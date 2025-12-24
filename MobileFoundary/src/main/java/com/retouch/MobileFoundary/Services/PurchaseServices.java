package com.retouch.MobileFoundary.Services;

import com.retouch.MobileFoundary.Entity.Product;
import com.retouch.MobileFoundary.Entity.Purchase;
import com.retouch.MobileFoundary.Repository.ProductRepository;
import com.retouch.MobileFoundary.Repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServices {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private PaymentGateway paymentGateway;
    @Autowired
    private PurchaseRepository purchaseRepository;

    public String purchaseProduct(Purchase purchase){

     Product product=productRepository.findById(purchase.getModelNumber()).orElseThrow(()->new RuntimeException("Product not Found"));

     if(product.getQuantityAvailable()<purchase.getQuantityNeeded()){
         return "OUT OF STOCK";
     }

     double total=product.getPrice()*purchase.getQuantityNeeded();

     purchase.setPrice(product.getPrice());

     purchase.setBrandName(product.getBrandName());

     purchase.setTotalAmount(total);


     boolean paymentSuccess=paymentGateway.processPayment(total);

     if(paymentSuccess) {
         purchase.setPaymentStatus("PAID");

         product.setQuantityAvailable(product.getQuantityAvailable() - purchase.getQuantityNeeded());

         productRepository.save(product);
     }
     else {
         purchase.setPaymentStatus("PENDING");
     }
     purchaseRepository.save(purchase);

     return purchase.getPaymentStatus();
    }
}
