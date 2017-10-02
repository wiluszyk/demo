package com.example.store.demo.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order")
public class Order {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "name")
        @NotEmpty
        private String name;

        @Column(name = "name")
        @NotEmpty
        private Date date;
}
