package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Demo;

@Repository
public interface DemoRepo extends JpaRepository<Demo,Long>{
    
}