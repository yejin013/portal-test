package com.example.portaltest.repository;

import com.example.portaltest.entity.AiDO_Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AiDOServerRepository extends JpaRepository<AiDO_Server, String> {
    @Query(value = "select sum(utilization) from AiDO_Server", nativeQuery = true)
    Float findSumUtilization();

    @Query(value = "select count(all) from AiDO_Server where utilization > 40", nativeQuery = true)
    Long countActiveService();
}
