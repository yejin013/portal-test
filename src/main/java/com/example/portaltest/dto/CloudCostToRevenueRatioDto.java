package com.example.portaltest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CloudCostToRevenueRatioDto {
    Integer month;
    Double sum;

    public CloudCostToRevenueRatioDto(Object[] objects) {
        month = (Integer) objects[0];
        sum = (Double) objects[1];
    }
}
