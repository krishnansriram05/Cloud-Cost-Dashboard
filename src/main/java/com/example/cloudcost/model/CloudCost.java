package com.example.cloudcost.model;

import jakarta.persistence.*;

@Entity
@Table(name="cloud_cost")
public class CloudCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="service_name")
    private String serviceName;

    private Double cost;

    @Column(name="billing_month")
    private String billingMonth;

    public CloudCost() {}

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

