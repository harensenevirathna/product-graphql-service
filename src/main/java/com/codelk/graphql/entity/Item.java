package com.codelk.graphql.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "item", schema = "public")
public class Item {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;
    @Column(name = "name")
    private String name;
    @Column(name = "rate")
    private String rate;
}
