package com.example.store.demo.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "country")
    @NotEmpty
    private String country;

    @Column(name = "voivodeship")
    @NotEmpty
    private String voivodeship;

    @Column(name = "city")
    @NotEmpty
    private String city;

    @Column(name = "street")
    @NotEmpty
    private String street;

    @Column(name = "postal_code")
    @NotEmpty
    private String postalCode;

    @Column(name = "number")
    @NotEmpty
    private Integer number;

}
