package com.example.portaltest.dto;

import com.example.portaltest.entity.AiDO;
import com.example.portaltest.entity.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MonthlyAccountDto {
    Company company;
    AiDO aido;
    Date code;
    Float price;
    Integer count;
    String count_type;
}
