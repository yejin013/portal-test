package com.example.portaltest.dto;

import java.util.List;

public class ServiceVersionListDto {
    List<ServiceVersionDto> list;

    public ServiceVersionListDto(List<ServiceVersionDto> list) {
        this.list = list;
    }
}
