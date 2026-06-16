package com.example.cloudcost.service;

import com.example.cloudcost.model.CloudCost;
import com.example.cloudcost.repository.CloudCostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudCostService {

    private final CloudCostRepository repository;

    public CloudCostService(CloudCostRepository repository) {
        this.repository = repository;
    }

    public List<CloudCost> getAllCosts() {
        return repository.findAll();
    }

    public CloudCost saveCost(CloudCost cost) {
        return repository.save(cost);
    }
}
