package com.sds4.vendas.controller;

import java.util.List;

import com.sds4.vendas.dto.SellerDTO;
import com.sds4.vendas.service.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
    
    @Autowired
    private SellerService sellerService;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        List<SellerDTO> result = sellerService.findAll();
        return ResponseEntity.ok(result);
    }
}
