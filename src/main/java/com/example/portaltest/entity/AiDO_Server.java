package com.example.portaltest.entity;

import javax.persistence.*;

@Entity
@IdClass(AiDOServerId.class)
@Table(name="TB_PT_AIDO_SVR_YJ")
public class AiDO_Server {
    @Id
    @Column(name = "AIDO_CD", length = 20)
    String aido_cd;
    @Id
    @Column(name = "SVR_CD")
    Integer code;
    @Column(name = "SVR_NM", length = 50)
    String name;
    @Column(name = "SVR_USE")
    Float utilization;
    @Column(name = "SVR_MON_PR")
    Float month_price;
}
