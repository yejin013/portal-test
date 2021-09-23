package com.example.portaltest.dto;

import com.example.portaltest.entity.AiDO;
import com.example.portaltest.entity.Company;
import com.example.portaltest.entity.Company_AiDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountDto {
    Company company;
    AiDO aido;
    Date account_datetime;
    Float sales_price;
    String sales_condition;
    Integer account_number;
    String account_status;
    String account_memo;
    String account_name;
}
