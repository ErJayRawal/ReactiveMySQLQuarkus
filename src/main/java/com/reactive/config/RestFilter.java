package com.reactive.config;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.ext.Provider;
import jakarta.ws.rs.container.ContainerResponseFilter;

import java.io.IOException;
@Provider
public class RestFilter implements ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        System.out.println(responseContext.getHeaders());
        responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
    }
}
