package com.retouch.MobileFoundary.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int purchaseId;
    private int custId;
    private int modelNumber;
    private String brandName;
    private double price;
    private int quantityNeeded;
    private double totalAmount;
    private String paymentStatus;
}
