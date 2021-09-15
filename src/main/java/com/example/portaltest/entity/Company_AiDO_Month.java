package com.example.portaltest.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(CompanyAiDOMonthId.class)
@Table(name="TB_PT_CMPN_AIDO_MON_YJ")
public class Company_AiDO_Month {
    @Id
    @Column(name = "CMPN_CD")
    Integer company_code;
    @Id
    @Column(name = "AIDO_CD", length = 20)
    String aido_code;
    @Id
    @Column(name = "MON_CD")
    Date code;
    @Column(name = "MON_PR")
    Float price;
    @Column(name = "MON_CNT")
    Integer count;
    @Column(name = "MON_CNT_TYPE", length = 20)
    String count_type;
}
