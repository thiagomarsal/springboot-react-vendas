package com.sds4.vendas.controller;

import java.util.List;

import com.sds4.vendas.dto.SaleDTO;
import com.sds4.vendas.dto.SaleSuccessDTO;
import com.sds4.vendas.dto.SaleSumDTO;
import com.sds4.vendas.service.SaleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    
    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> result = saleService.findAll(pageable);
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "sumBySaller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
        List<SaleSumDTO> result = saleService.amountGroupedBySeller();
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "successBySaller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
        List<SaleSuccessDTO> result = saleService.successGroupedBySeller();
        return ResponseEntity.ok(result);
    }
}
