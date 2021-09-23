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
    @Query(value = "SELECT TOP 5 CMPN.CMPN_NM, ACC.AC_DTM, ACC.AC_NO, ACC.SP, ACC.AC_STATUS, ACC.AC_MEMO " +
            "FROM TB_PT_CMPN_YJ AS CMPN, TB_PT_CMPN_AIDO_YJ AS ACC " +
            "WHERE CMPN.CMPN_CD = ACC.CMPN_CD " +
            "ORDER BY ACC.AC_DTM DESC", nativeQuery = true)
    List<Company_AiDO> findTop5ByOrderByAccount_datetime();
}
