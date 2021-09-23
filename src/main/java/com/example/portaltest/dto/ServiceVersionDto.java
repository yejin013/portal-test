package com.example.portaltest.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class ServiceVersionDto {
    String code;
    String name;
    Float version;
    Date release_datetime;
    Float list_price;
    String status;
    Integer update_rate;

    public ServiceVersionDto(String code, String name, Float version, Date release_datetime,
                      Float list_price, String status, Integer update_rate) {
        this.code = code;
        this.name = name;
        this.version = version;
        this.release_datetime = release_datetime;
        this.list_price = list_price;
        this.status = status;
        this.update_rate = update_rate;
    }
}
