package com.example.portaltest.entity;

import javax.persistence.*;

@Entity
@IdClass(AiDOModelId.class)
@Table(name="TB_PT_AIDO_MODEL_YJ")
public class AiDO_Model {
    @Id
    @ManyToOne
    @JoinColumn(name = "AIDO_CD")
    AiDO aido;
    @Id
    @Column(name = "MODEL_CD", length = 50)
    String model_cd;
}
