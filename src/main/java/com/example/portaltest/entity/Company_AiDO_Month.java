package com.example.portaltest.entity;

import com.example.portaltest.dto.MonthlyAccountDto;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(CompanyAiDOMonthId.class)
@Table(name="TB_PT_CMPN_AIDO_MON_YJ")
public class Company_AiDO_Month {
    @Id
    @ManyToOne
    @JoinColumn(name = "CMPN_CD")
    Company company;
    @Id
    @ManyToOne
    @JoinColumn(name = "AIDO_CD")
    AiDO aido;
    @Id
    @Column(name = "MON_CD")
    Date code;
    @Column(name = "MON_PR")
    Float price;
    @Column(name = "MON_CNT")
    Integer count;
    @Column(name = "MON_CNT_TYPE", length = 20)
    String count_type;

    public MonthlyAccountDto toDto() {
        return new MonthlyAccountDto(company, aido, code, price, count, count_type);
    }
}
