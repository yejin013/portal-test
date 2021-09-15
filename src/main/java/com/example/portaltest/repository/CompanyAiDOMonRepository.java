package com.example.portaltest.repository;

import com.example.portaltest.entity.Company_AiDO;
import com.example.portaltest.entity.Company_AiDO_Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyAiDOMonRepository extends JpaRepository<Company_AiDO_Month, String> {
    @Query("select sum(price) from Company_AiDO_Month")
    Float findPriceTotal();

    @Query(value = "select year(code), month(code), count(*) from Company_AiDO_Month group by year(code), month(code)", nativeQuery = true)
    List<Object[]> findMonthServiceUsesCount();

    @Query(value = "select year(code), month(code), sum(price) from Company_AiDO_Month group by year(code), month(code)", nativeQuery = true)
    List<Object[]> findMonthServiceUsesSum();

    List<Company_AiDO_Month> findTop4ByOrderByCode();
}
