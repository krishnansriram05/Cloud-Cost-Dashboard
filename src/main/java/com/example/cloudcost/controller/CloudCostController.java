package com.example.cloudcost.controller;

import com.example.cloudcost.model.CloudCost;
import com.example.cloudcost.service.CloudCostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/costs")
public class CloudCostController {

    private final CloudCostService service;

    public CloudCostController(CloudCostService service) {
        this.service = service;
    }

    @GetMapping
    public List<CloudCost> getAllCosts() {
        return service.getAllCosts();
    }

    @PostMapping
    public CloudCost saveCost(@RequestBody CloudCost cost) {
        return service.saveCost(cost);
    }
}
