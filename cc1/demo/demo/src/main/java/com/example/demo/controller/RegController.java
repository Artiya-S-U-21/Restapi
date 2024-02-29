package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Reg;
import com.example.demo.service.RegService;

@RestController
public class RegController {
    @Autowired
    RegService regService;

    @PostMapping("/reg")
    public Reg addReg(@RequestBody Reg reg) {// returns added w
        return regService.addReg(reg);// call service class
    }

    @GetMapping("/getreg")
    public List<Reg> getReg() {
        return regService.getReg();// call service
    }

    @GetMapping("/reg/{regId}")
    public Optional<Reg> getRegById(@PathVariable Long regId) {
        return regService.getRegById(regId);
    }
    
    @PutMapping("/editreg/{regid}")
    public Reg edituser(@PathVariable Long regid, @RequestBody Reg reg) {
        
        
        return regService.edituser(regid,reg);
    }

    @DeleteMapping("/delreg/{regid}")
    public void deluser(@PathVariable Long regid)
    {
         regService.deluser(regid);
    }
    
    @GetMapping("user/get/sort/{field}")
    public List<Reg> getMethodbySort(@PathVariable String field)
    {
        return regService.getBySortedbyName(field);
    }
    @GetMapping("user/get/page/{no}/{size}")
    public List<Reg> getMethodbyPage(@PathVariable int no,@PathVariable int size)
    {
        return regService.getByPaging(no, size);
    }
    @GetMapping("user/get/pageandsort/{field}/{no}/{size}")
    public List<Reg> getMethodbySortandPage(@PathVariable String field,@PathVariable int no,@PathVariable int size)
    {
        return regService.getBySortandPages(field,no,size);
    }
}