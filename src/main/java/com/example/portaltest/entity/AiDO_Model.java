package com.example.portaltest.entity;

import javax.persistence.*;

@Entity
@IdClass(AiDOModelId.class)
@Table(name="TB_PT_AIDO_MODEL_YJ")
public class AiDO_Model {
    @Id
    @Column(name = "AIDO_CD", length = 20)
    String aido_cd;
    @Id
    @Column(name = "MODEL_CD", length = 50)
    String model_cd;
}
