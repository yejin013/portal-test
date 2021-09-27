package com.example.portaltest.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class ServiceUpdateListDto {
    List<ServiceUpdateDto> list;

    public ServiceUpdateListDto(List<ServiceUpdateDto> list) {
        this.list = list;
    }
}
