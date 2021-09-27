package com.example.portaltest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NumberOfServiceUsesDto {
    String aido_code;
    Long count;

    public NumberOfServiceUsesDto(Object[] objects) {
        aido_code = (String) objects[0];

        if(objects[1].getClass().getName().equals("java.lang.Integer"))
            objects[1] = Long.valueOf((Integer) objects[1]);

        count = (Long) objects[1];
    }
}
