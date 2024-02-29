package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="demo")
public class Demo{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     int demoId;
    String demoName;
    String demoFor;
    String demoBrand;
    public int getDemoId() {
        return demoId;
    }
    public void setDemoId(int demoId) {
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

    
    
}