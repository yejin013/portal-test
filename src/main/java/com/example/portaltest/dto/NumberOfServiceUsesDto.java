package com.example.portaltest.dto;

public class NumberOfServiceUsesDto {
    String aido_code;
    Long count;

    public NumberOfServiceUsesDto(Object[] objects) {
        aido_code = (String) objects[0];
        count = (Long) objects[1];
    }
}
