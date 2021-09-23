package com.example.portaltest.repository;

import com.example.portaltest.entity.AiDO_Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AiDOModelRepository extends JpaRepository<AiDO_Model, String> {
}
