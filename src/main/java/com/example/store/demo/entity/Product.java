package com.example.store.demo.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @NotEmpty
    private String name;

    @Column(name = "price")
    @NotEmpty
    private Double price;

    @Column
    @NotEmpty
    private String Description;

}
