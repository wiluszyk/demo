package com.example.store.demo.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    @NotEmpty
    private String username;

    @Column(name = "password")
    @NotEmpty
    private String password;

}
