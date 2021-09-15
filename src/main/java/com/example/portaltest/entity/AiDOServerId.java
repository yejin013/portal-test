package com.example.portaltest.entity;

import javax.persistence.Column;
import java.io.Serializable;

public class AiDOServerId implements Serializable {
    @Column(name = "AIDO_CD", length = 20)
    String aido_cd;
    @Column(name = "SVR_CD")
    Integer code;
}
