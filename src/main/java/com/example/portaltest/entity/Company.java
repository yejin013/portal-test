package com.example.portaltest.entity;

import com.example.portaltest.dto.CompanyDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PT_CMPN_YJ")
public class Company {
    @Id
    @Column(name = "CMPN_CD")
    Integer code;
    @Column(name = "CMPN_NM")
    String name;

    public CompanyDto toDto() {
        return new CompanyDto(code, name);
    }
}
