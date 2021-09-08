package com.sds4.vendas.repository;

import com.sds4.vendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    
}
