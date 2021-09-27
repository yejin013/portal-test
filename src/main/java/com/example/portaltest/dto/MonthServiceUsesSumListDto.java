package com.example.portaltest.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class MonthServiceUsesSumListDto {
    List<MonthServiceUsesSumDto> list;

    public MonthServiceUsesSumListDto(List<MonthServiceUsesSumDto> list) {
        this.list = list;
    }
}
