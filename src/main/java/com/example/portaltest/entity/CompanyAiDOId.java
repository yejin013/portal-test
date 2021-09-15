package com.example.portaltest.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class CompanyAiDOId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "CMPN_CD")
    Company company;
    @ManyToOne
    @JoinColumn(name = "AIDO_CD")
    AiDO aido;
}
