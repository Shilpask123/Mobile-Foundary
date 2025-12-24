package com.retouch.MobileFoundary.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId;

    @Column(name = "customer_name")   //Database column name
    private String customerName;      //Java variable name

    @Column(name = "username")     /* To void duplicate column name like (username and user_name),
                                     Because Java and Database follow different naming rules,
                                      and Hibernate’s auto-guessing is not always reliable.*/
    private String username;

    @Column(name = "password")
    private String password;
}
