package com.example.portaltest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MonthServiceUsesSumDto {
    Integer year;
    Integer month;
    Double sum;

    public MonthServiceUsesSumDto(Object[] entity) {
        year = (Integer) entity[0];
        month = (Integer) entity[1];
        sum = (Double) entity[2];
    }
}
