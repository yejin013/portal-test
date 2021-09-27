package com.example.portaltest.entity;


import com.example.portaltest.dto.AiDODto;
import com.example.portaltest.dto.ServiceUpdateDto;
import com.example.portaltest.dto.ServiceVersionDto;

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
    Integer update_rate;

    public Integer getUpdate_rate() {
        return update_rate;
    }

    public AiDODto toDto() {
        return new AiDODto(code, name, version, release_datetime, list_price, status, update_rate);
    }

    public ServiceVersionDto fromVersionToDto() {
        return new ServiceVersionDto(code, name, version, release_datetime, list_price, status, update_rate);
    }

    public ServiceUpdateDto fromUpdateToDto() {
        return new ServiceUpdateDto(code, name, version, release_datetime, list_price, status, update_rate);
    }
}
