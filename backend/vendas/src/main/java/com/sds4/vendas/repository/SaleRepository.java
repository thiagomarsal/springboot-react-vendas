package com.sds4.vendas.repository;

import java.util.List;

import com.sds4.vendas.dto.SaleSuccessDTO;
import com.sds4.vendas.dto.SaleSumDTO;
import com.sds4.vendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    
    @Query("select new com.sds4.vendas.dto.SaleSumDTO(obj.seller.name, SUM(obj.amount)) from Sale as obj group by obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();
    
    @Query("select new com.sds4.vendas.dto.SaleSuccessDTO(obj.seller.name, SUM(obj.visited), SUM(obj.deals)) from Sale as obj group by obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}