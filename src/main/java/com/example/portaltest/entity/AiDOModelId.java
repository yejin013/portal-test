package com.example.portaltest.entity;

import javax.persistence.Column;
import java.io.Serializable;

public class AiDOModelId implements Serializable {
    @Column(name = "AIDO_CD", length = 20)
    String aido_cd;
    @Column(name = "MODEL_CD", length = 50)
    String model_cd;
}
