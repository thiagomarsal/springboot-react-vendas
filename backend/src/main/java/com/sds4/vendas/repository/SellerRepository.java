package com.sds4.vendas.repository;

import com.sds4.vendas.entities.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    
}
