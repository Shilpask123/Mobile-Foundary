package com.retouch.MobileFoundary.Repository;

import com.retouch.MobileFoundary.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    Optional<Customer> findByUsernameAndPassword(String username, String password);
}
