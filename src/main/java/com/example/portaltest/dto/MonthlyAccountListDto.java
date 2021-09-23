package com.example.portaltest.dto;

import java.util.List;

public class MonthlyAccountListDto {
    List<MonthlyAccountDto> list;

    public MonthlyAccountListDto(List<MonthlyAccountDto> list) {
        this.list = list;
    }
}
