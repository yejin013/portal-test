package com.example.portaltest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JoinRepository extends JpaRepository<Object, Object> {
    @Query(value = "SELECT MONTH(MON.MON_CD), SUM(MON.MON_PR) - SUM(MON.MON_PR) / SUM(SVR.SVR_MON_PR)  FROM TB_PT_CMPN_AIDO_MON_YJ AS MON, TB_PT_AIDO_SVR_YJ AS SVR WHERE MON.AIDO_CD = SVR.AIDO_CD AND YEAR(MON.MON_CD) = YEAR(GETDATE())GROUP BY MONTH(MON.MON_CD) ORDER BY MONTH(MON.MON_CD)", nativeQuery = true)
    List<Object[]> cloudCostToRevenueRatio();
}
