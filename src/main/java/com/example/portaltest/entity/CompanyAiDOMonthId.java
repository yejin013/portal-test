package com.example.portaltest.entity;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

public class CompanyAiDOMonthId implements Serializable {
    @Column(name = "CMPN_CD")
    Integer company_code;
    @Column(name = "AIDO_CD", length = 20)
    String aido_code;
    @Column(name = "MON_CD")
    Date code;
}
