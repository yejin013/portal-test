package com.example.portaltest.entity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class AiDOModelId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "AIDO_CD")
    AiDO aido;
    @Column(name = "MODEL_CD", length = 50)
    String model_cd;
}
