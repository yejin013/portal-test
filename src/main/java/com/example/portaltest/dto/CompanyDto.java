package com.example.portaltest.dto;

import com.example.portaltest.entity.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompanyDto {
    Integer code;
    String name;
}
