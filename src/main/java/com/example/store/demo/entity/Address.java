package com.example.store.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
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

    @OneToOne
    @JoinColumn(name="account_id")
    private Account account;

    @OneToMany(mappedBy="address", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Account> accounts = new ArrayList<>();

}
