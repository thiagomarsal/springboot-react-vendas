package com.sds4.vendas.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.sds4.vendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class SaleSumDTO implements Serializable {
    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum) {
        super();
        this.sellerName = seller.getName();
        this.sum = sum;
    }
}
