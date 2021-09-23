package com.example.portaltest.repository;

import com.example.portaltest.entity.AiDO_Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AiDOServerRepository extends JpaRepository<AiDO_Server, String> {
    @Query(value = "select sum(utilization) from AiDO_Server")
    Float findSumUtilization();

    @Query(value = "select count(all code) from AiDO_Server where utilization > 40")
    Long countActiveService();
}
