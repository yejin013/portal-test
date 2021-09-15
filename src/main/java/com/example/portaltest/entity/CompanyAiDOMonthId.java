package com.example.portaltest.entity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

public class CompanyAiDOMonthId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "CMPN_CD")
    Company company;
    @ManyToOne
    @JoinColumn(name = "AIDO_CD")
    AiDO aido;
    @Column(name = "MON_CD")
    Date code;
}
