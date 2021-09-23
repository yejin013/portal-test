package com.example.portaltest.dto;

public class CloudCostToRevenueRatioDto {
    Integer month;
    Float sum;

    public CloudCostToRevenueRatioDto(Object[] objects) {
        month = (Integer) objects[0];
        sum = (Float) objects[1];
    }
}
