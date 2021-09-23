package com.example.portaltest.repository;

import com.example.portaltest.entity.Company_AiDO_Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyAiDOMonRepository extends JpaRepository<Company_AiDO_Month, String> {
    @Query("select sum(price) from Company_AiDO_Month")
    Float findPriceTotal();

    @Query(value = "select year(code), month(code), count(*) from TB_PT_CMPN_AIDO_MON group by year(code), month(code)", nativeQuery = true)
    List<Object[]> findMonthServiceUsesCount();

    @Query(value = "select year(code), month(code), sum(price) from TB_PT_CMPN_AIDO_MON group by year(code), month(code)", nativeQuery = true)
    List<Object[]> findMonthServiceUsesSum();

    List<Company_AiDO_Month> findTop4ByOrderByCode();

    @Query(value = "SELECT MONTH(MON.MON_CD), SUM(MON.MON_PR) - SUM(MON.MON_PR) / SUM(SVR.SVR_MON_PR) " +
            "FROM TB_PT_CMPN_AIDO_MON_YJ AS MON, TB_PT_AIDO_SVR_YJ AS SVR " +
            "WHERE MON.AIDO_CD = SVR.AIDO_CD AND YEAR(MON.MON_CD) = YEAR(GETDATE())" +
            "GROUP BY MONTH(MON.MON_CD) ORDER BY MONTH(MON.MON_CD)"
            , nativeQuery = true)
    List<Object[]> cloudCostToRevenueRatio();
}