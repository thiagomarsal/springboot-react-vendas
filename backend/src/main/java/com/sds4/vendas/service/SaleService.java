package com.sds4.vendas.service;

import java.util.List;

import com.sds4.vendas.converter.ConverterMapper;
import com.sds4.vendas.dto.SaleDTO;
import com.sds4.vendas.dto.SaleSuccessDTO;
import com.sds4.vendas.dto.SaleSumDTO;
import com.sds4.vendas.entities.Sale;
import com.sds4.vendas.repository.SaleRepository;
import com.sds4.vendas.repository.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private ConverterMapper mapper;
    
    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(mapper::toDTO);
    }
    
    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        List<SaleSumDTO> result = saleRepository.amountGroupedBySeller();
        return result;
    }
    
    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller() {
        List<SaleSuccessDTO> result = saleRepository.successGroupedBySeller();
        return result;
    }
}
