package com.sds4.vendas.converter;

import com.sds4.vendas.dto.SaleDTO;
import com.sds4.vendas.dto.SellerDTO;
import com.sds4.vendas.entities.Sale;
import com.sds4.vendas.entities.Seller;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConverterMapper {
    public Seller toEntity(SellerDTO dto);
    public SellerDTO toDTO(Seller entity);
    
    public Sale toEntity(SaleDTO dto);
    public SaleDTO toDTO(Sale entity);
}