package com.example.portaltest.repository;

import com.example.portaltest.entity.Company_AiDO_Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyAiDOMonRepository extends JpaRepository<Company_AiDO_Month, String> {
    @Query("select sum(price) from Company_AiDO_Month")
    Double findPriceTotal();

    @Query(value = "SELECT YEAR(MON_CD) AS YEAR_CD, MONTH(MON_CD) AS MONTH_CD, COUNT(*) FROM TB_PT_CMPN_AIDO_MON_YJ " +
            "GROUP BY YEAR(MON_CD), MONTH(MON_CD) ORDER BY YEAR(MON_CD) DESC, MONTH(MON_CD) DESC;", nativeQuery = true)
    List<Object[]> findMonthServiceUsesCount();

    @Query(value = "SELECT YEAR(MON_CD) AS YEAR_CD, MONTH(MON_CD) AS MONTH_CD, SUM(MON_PR) FROM TB_PT_CMPN_AIDO_MON_YJ " +
            "GROUP BY YEAR(MON_CD), MONTH(MON_CD) ORDER BY YEAR(MON_CD) DESC, MONTH(MON_CD) DESC;", nativeQuery = true)
    List<Object[]> findMonthServiceUsesSum();

    List<Company_AiDO_Month> findTop4ByOrderByCode();

    @Query(value = "SELECT MONTH(MON.MON_CD) AS MONTH_CD, (SUM(MON.MON_PR) - SUM(MON.MON_PR) / SUM(SVR.SVR_MON_PR)) AS RATIO " +
            "FROM TB_PT_CMPN_AIDO_MON_YJ AS MON, TB_PT_AIDO_SVR_YJ AS SVR " +
            "WHERE MON.AIDO_CD = SVR.AIDO_CD AND YEAR(MON.MON_CD) = YEAR(GETDATE())" +
            "GROUP BY MONTH(MON.MON_CD) ORDER BY MONTH(MON.MON_CD);"
            , nativeQuery = true)
    List<Object[]> cloudCostToRevenueRatio();
}