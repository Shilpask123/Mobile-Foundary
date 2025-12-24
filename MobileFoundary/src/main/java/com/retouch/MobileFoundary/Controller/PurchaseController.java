package com.retouch.MobileFoundary.Controller;

import com.retouch.MobileFoundary.Entity.Purchase;
import com.retouch.MobileFoundary.Services.PurchaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseServices purchaseServices;


    @PostMapping
    public String buy(@RequestBody Purchase purchase){
        return purchaseServices.purchaseProduct(purchase);
    }
}
