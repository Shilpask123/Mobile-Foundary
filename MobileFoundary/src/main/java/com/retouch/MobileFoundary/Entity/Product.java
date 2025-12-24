package com.retouch.MobileFoundary.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity  // To create table in Database
@Data      //Reduce the boilerplate code, and to provide setters() and getters(), toString()
public class Product {
  @Id                                //Primary key for unique elements
  @GeneratedValue(strategy = GenerationType.IDENTITY)    //Auto Increament for serial number
    private int modelNumber;
    private String brandName;
    private String ram;
    private String rom;
    private double price;
    private int quantityAvailable;
}
