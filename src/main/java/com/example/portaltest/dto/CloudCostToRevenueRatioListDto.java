package com.example.portaltest.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class CloudCostToRevenueRatioListDto {
    List<CloudCostToRevenueRatioDto> list;

    public CloudCostToRevenueRatioListDto(List<CloudCostToRevenueRatioDto> list) {
        this.list = list;
    }
}
