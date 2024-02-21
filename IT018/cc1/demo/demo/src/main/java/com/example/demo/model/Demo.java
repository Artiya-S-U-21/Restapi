package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Demo")
public class Demo{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long demoId;
    String demoName;
    String demoFor;
    String demoBrand;
    String manufacturedIn;
    Double demoPrice;
    String expiryDate;
    public Long getDemoId() {
        return demoId;
    }
    public void setDemoId(Long demoId) {
        this.demoId = demoId;
    }
    public String getDemoName() {
        return demoName;
    }
    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }
    public String getDemoFor() {
        return demoFor;
    }
    public void setDemoFor(String demoFor) {
        this.demoFor = demoFor;
    }
    public String getDemoBrand() {
        return demoBrand;
    }
    public void setDemoBrand(String demoBrand) {
        this.demoBrand = demoBrand;
    }
    public String getManufacturedIn() {
        return manufacturedIn;
    }
    public void setManufacturedIn(String manufacturedIn) {
        this.manufacturedIn = manufacturedIn;
    }
    public Double getDemoPrice() {
        return demoPrice;
    }
    public void setDemoPrice(Double demoPrice) {
        this.demoPrice = demoPrice;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}