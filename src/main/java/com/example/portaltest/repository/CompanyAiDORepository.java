package com.example.portaltest.repository;

import com.example.portaltest.entity.Company_AiDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyAiDORepository extends JpaRepository<Company_AiDO, String> {
    @Query(value = "select aido_code, count(*) from Company_AiDO GROUP BY aido_code", nativeQuery = true)
    List<Object[]> serviceCount();
    List<Company_AiDO> findTop5ByOrderByAccount_datetime();
}
