package com.retouch.MobileFoundary.Repository;

import com.retouch.MobileFoundary.Entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase,Integer> {
}
