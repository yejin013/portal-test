package com.example.portaltest.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="TB_PT_AIDO_YJ")
public class AiDO {
    @Id
    @Column(name = "AIDO_CD", length = 20)
    String code;
    @Column(name = "AIDO_NM", length = 50)
    String name;
    @Column(name = "AIDO_VER")
    Float version;
    @Column(name = "AIDO_REL_DTM")
    Date release_datetime;
    @Column(name = "AIDO_LIST_PR")
    Float list_price;
    @Column(name = "AIDO_STATUS", length = 20)
    String status;
    @Column(name = "AIDO_UP_RATE")
    String update_rate;
}
