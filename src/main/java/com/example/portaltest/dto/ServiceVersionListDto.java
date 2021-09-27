package com.example.portaltest.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class ServiceVersionListDto {
    List<ServiceVersionDto> list;

    public ServiceVersionListDto(List<ServiceVersionDto> list) {
        this.list = list;
    }
}
