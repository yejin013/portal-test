package com.example.portaltest.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class MonthServiceCountListDto {
    List<MonthServiceCountDto> list;

    public MonthServiceCountListDto(List<MonthServiceCountDto> list) {
        this.list = list;
    }
}
