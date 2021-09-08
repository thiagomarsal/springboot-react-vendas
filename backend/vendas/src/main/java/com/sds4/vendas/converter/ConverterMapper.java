package com.sds4.vendas.converter;

import com.sds4.vendas.dto.SellerDTO;
import com.sds4.vendas.entities.Seller;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConverterMapper {
    public Seller toEntity(SellerDTO dto);
    public SellerDTO toDTO(Seller entity);
}