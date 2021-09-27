package com.example.portaltest.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class MonthlyAccountListDto {
    List<MonthlyAccountDto> list;

    public MonthlyAccountListDto(List<MonthlyAccountDto> list) {
        this.list = list;
    }
}
