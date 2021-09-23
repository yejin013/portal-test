package com.example.portaltest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ServiceUpdateDto {
    String code;
    String name;
    Float version;
    Date release_datetime;
    Float list_price;
    String status;
    Integer update_rate;
}
