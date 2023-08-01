package com.reactive.resources;

import com.reactive.models.FruitTest;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.List;

@Path("/fruits")
@ApplicationScoped
public class ReactiveResources {

    @GET
    public Uni<List<FruitTest>> get(){
        return FruitTest.listAll(Sort.by("name"));
    }

    @GET
    @Path("/{id}")
    public Uni<FruitTest> getSingle(Long id) {
        return FruitTest.findById(id);
    }

    @POST
    @Transactional
    public Uni<RestResponse<FruitTest>> create(FruitTest fruit) {
        return  FruitTest.persist(fruit).replaceWith(RestResponse.status(RestResponse.Status.CREATED));
    }
}
