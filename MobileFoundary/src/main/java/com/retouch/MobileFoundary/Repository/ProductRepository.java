package com.retouch.MobileFoundary.Repository;

import com.retouch.MobileFoundary.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
