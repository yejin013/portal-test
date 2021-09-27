package com.example.portaltest.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class NumberOfServiceUsesListDto {
    List<NumberOfServiceUsesDto> list;

    public NumberOfServiceUsesListDto(List<NumberOfServiceUsesDto> list) {
        this.list = list;
    }
}
