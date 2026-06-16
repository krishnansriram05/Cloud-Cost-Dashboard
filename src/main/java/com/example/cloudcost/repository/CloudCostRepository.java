package com.example.cloudcost.repository;

import com.example.cloudcost.model.CloudCost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudCostRepository
        extends JpaRepository<CloudCost, Long> {
}
