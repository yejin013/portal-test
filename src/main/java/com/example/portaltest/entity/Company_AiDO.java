package com.example.portaltest.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(CompanyAiDOId.class)
@Table(name="TB_PT_CMPN_AIDO_YJ")
public class Company_AiDO {
    @Id
    @Column(name = "CMPN_CD")
    Integer company_code;
    @Id
    @Column(name = "AIDO_CD", length = 20)
    String aido_code;
    @Column(name = "AC_DTM")
    Date account_datetime;
    @Column(name = "SP")
    Float sales_price;
    @Column(name = "SC", length = 20)
    String sales_condition;
    @Column(name = "AC_NO")
    Integer account_number;
    @Column(name = "AC_STATUS", length = 20)
    String account_status;
    @Column(name = "AC_MEMO", length = 50)
    String account_memo;
    @Column(name = "AC_NM", length = 50)
    String account_name;
}
