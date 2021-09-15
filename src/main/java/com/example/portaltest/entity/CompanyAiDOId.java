package com.example.portaltest.entity;

import javax.persistence.Column;
import java.io.Serializable;

public class CompanyAiDOId implements Serializable {
    @Column(name = "CMPN_CD")
    Integer company_code;
    @Column(name = "AIDO_CD", length = 20)
    String aido_code;
}
