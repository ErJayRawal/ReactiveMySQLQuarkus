package com.reactive.models;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.*;
import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import lombok.Getter;

@Entity
public class FruitTest extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter
    @Column(length = 40, unique = true)
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
