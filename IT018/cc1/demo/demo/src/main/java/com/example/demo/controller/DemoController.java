package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Demo;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
    @Autowired
    DemoService demoService;

    @PostMapping("/demo")
    public Demo addDemo(@RequestBody Demo demo) {// returns added w
        return demoService.addMedicine(demo);// call service class
    }

    @GetMapping("/getdem")
    public List<Demo> getDemos() {
        return demoService.getDemos();// call service
    }

    @GetMapping("/demo/{demoId}")
    public Optional<Demo> getDemoById(@PathVariable Long demoId) {
        return demoService.getDemoById(demoId);
    }
}