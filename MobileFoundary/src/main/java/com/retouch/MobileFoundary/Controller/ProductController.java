package com.retouch.MobileFoundary.Controller;

import com.retouch.MobileFoundary.Entity.Product;
import com.retouch.MobileFoundary.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @PostMapping
    public String addProduct(@RequestBody Product product){
        productRepository.save(product);
        return "Product has been Successfully added to Product Table";
    }

    @GetMapping
    public List<Product> FetchAllProduct(){
        return productRepository.findAll();
    }
}
