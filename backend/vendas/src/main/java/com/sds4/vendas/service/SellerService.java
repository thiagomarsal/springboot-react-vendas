package com.sds4.vendas.service;

import java.util.List;
import java.util.stream.Collectors;

import com.sds4.vendas.converter.ConverterMapper;
import com.sds4.vendas.dto.SellerDTO;
import com.sds4.vendas.entities.Seller;
import com.sds4.vendas.repository.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private ConverterMapper mapper;
    
    public List<SellerDTO> findAll() {
        List<Seller> result = sellerRepository.findAll();
        return result.stream().map(mapper::toDTO).collect(Collectors.toList());
    }
}
