package com.example.portaltest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PT_CMPN_YJ")
public class Company {
    @Id
    Integer code;
    String name;
}
