package com.example.portaltest.entity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class AiDOServerId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "AIDO_CD")
    AiDO aido;
    @Column(name = "SVR_CD")
    Integer code;
}
