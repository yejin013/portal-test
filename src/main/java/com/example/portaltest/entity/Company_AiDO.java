package com.example.portaltest.entity;

import com.example.portaltest.dto.AccountDto;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(CompanyAiDOId.class)
@Table(name="TB_PT_CMPN_AIDO_YJ")
public class Company_AiDO {
    @Id
    @ManyToOne
    @JoinColumn(name = "CMPN_CD")
    Company company;
    @Id
    @ManyToOne
    @JoinColumn(name = "AIDO_CD")
    AiDO aido;
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
