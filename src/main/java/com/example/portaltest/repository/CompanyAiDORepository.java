package com.example.portaltest.repository;

import com.example.portaltest.entity.Company_AiDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyAiDORepository extends JpaRepository<Company_AiDO, String> {
    @Query(value = "select aido.code, count(all aido) from Company_AiDO group by aido")
    List<Object[]> serviceCount();
    @Query(value = "SELECT AIDO_CD, COUNT(*) AS CNT, COUNT(*) * 100 / SUM(COUNT(*)) OVER() AS RATIO " +
            "FROM TB_PT_CMPN_AIDO_YJ GROUP BY AIDO_CD;", nativeQuery = true)
    List<Object[]> serviceCountRatio();
    @Query(value = "SELECT TOP 5 CMPN_CD, AC_DTM, AC_NO, SP, AC_STATUS, AC_MEMO " +
            "FROM TB_PT_CMPN_AIDO_YJ ORDER BY AC_DTM DESC;", nativeQuery = true)
    List<Object[]> findTop5ByOrderByAccount_datetime();
}
