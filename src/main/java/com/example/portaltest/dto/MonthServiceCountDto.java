package com.example.portaltest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MonthServiceCountDto {
    Integer year;
    Integer month;
    Long count;

    public MonthServiceCountDto(Object[] entity) {
        year = (Integer) entity[0];
        month = (Integer) entity[1];
        count = (Long) entity[2];
    }
}
