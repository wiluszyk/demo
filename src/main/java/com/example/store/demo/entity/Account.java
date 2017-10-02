package com.example.store.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @NotEmpty
    private String name;

    @Column(name = "surname")
    @NotEmpty
    private String surname;

    @Column(name = "email")
    @NotEmpty
    @Email
    private String email;

    @Column(name = "telephone")
    @NotEmpty
    @Digits(fraction = 0, integer = 10)
    private String telephone;

    @OneToOne(mappedBy = "account", cascade=CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy="account", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Order> orders = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="address_id")
    private Address addressA;


}
