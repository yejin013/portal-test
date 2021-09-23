package com.example.portaltest.repository;

import com.example.portaltest.entity.AiDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AiDORepository extends JpaRepository<AiDO, String> {
}
