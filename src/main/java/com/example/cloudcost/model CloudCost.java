package com.example.cloudcost.model;

import jakarta.persistence.*;

@Entity
public class CloudCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serviceName;
    private Double cost;
    private String billingMonth;

    public CloudCost() {}

    public CloudCost(String serviceName, Double cost, String billingMonth) {
        this.serviceName = serviceName;
        this.cost = cost;
        this.billingMonth = billingMonth;
    }

    public Long getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(String billingMonth) {
        this.billingMonth = billingMonth;
    }
}


