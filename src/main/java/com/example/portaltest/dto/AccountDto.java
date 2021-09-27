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
public class AccountDto {
    CompanyDto company;
    Date account_datetime;
    Double sales_price;
    Integer account_number;
    String account_status;
    String account_memo;

    public AccountDto(Object[] objects) {
        Company company = (Company) objects[0];
        this.company = company.toDto();
        account_datetime = (Date) objects[1];
        account_number = (Integer) objects[2];
        sales_price = (Double) objects[3];
        account_status = (String) objects[4];
        account_memo = (String) objects[5];
    }
}
