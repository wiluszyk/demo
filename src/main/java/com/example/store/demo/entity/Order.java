package com.example.store.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "order")
public class Order {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "name")
        @NotEmpty
        private String name;

        @Column(name = "date")
        @Temporal(TemporalType.DATE)
        @DateTimeFormat(pattern = "dd/MM/yyyy")
        private Date date;

        @OneToMany(mappedBy="order", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
        private List<OrderDetail> orderDetails = new ArrayList<>();

        @ManyToOne
        @JoinColumn(name="account_id")
        private Account account;
}
