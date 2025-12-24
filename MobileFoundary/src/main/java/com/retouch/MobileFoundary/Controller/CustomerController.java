package com.retouch.MobileFoundary.Controller;

import com.retouch.MobileFoundary.Entity.Customer;
import com.retouch.MobileFoundary.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/register")
    public String register(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "Registered Successfully";
    }

    @PostMapping("/login")
    public String login(@RequestBody  Customer customer){
        return customerRepository
                .findByUsernameAndPassword(customer.getUsername(),customer.getPassword())
                .isPresent()
                ?"LOGIN SUCCESS"
                : "INVALID CREDENTIALS";

//        OR
//        boolean isValidUser = customerRepository
//                .findByUsernameAndPassword(
//                        customer.getUsername(),
//                        customer.getPassword()
//                )
//                .isPresent();
//
//        if (isValidUser) {
//            return "LOGIN SUCCESS";
//        } else {
//            return "INVALID CREDENTIALS";
    }
}
