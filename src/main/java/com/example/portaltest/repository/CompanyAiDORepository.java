package com.example.portaltest.repository;

import com.example.portaltest.entity.Company_AiDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyAiDORepository extends JpaRepository<Company_AiDO, String> {
//    List<Company_AiDO>
}
