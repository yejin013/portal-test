package com.example.portaltest.dto;

import com.example.portaltest.entity.AiDO;
import com.example.portaltest.entity.Company;
import lombok.*;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MonthlyAccountDto {
    CompanyDto company;
    AiDODto aido;
    Date code;
    Float price;
    Integer count;
    String count_type;

    public MonthlyAccountDto(Company company, AiDO aido, Date code, Float price, Integer count, String count_type) {
        this.company = company.toDto();
        this.aido = aido.toDto();
        this.code = code;
        this.price = price;
        this.count = count;
        this.count_type = count_type;
    }
}
