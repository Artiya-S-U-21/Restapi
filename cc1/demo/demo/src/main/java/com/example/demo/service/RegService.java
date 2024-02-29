package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Reg;
import com.example.demo.repository.RegRepo;

@Service
public class RegService {
    @Autowired
    RegRepo regRepo;

    public Reg addReg(Reg reg)
    {
        return regRepo.save(reg);
    }
    public List<Reg> getReg()
    {
        return regRepo.findAll();
    }
    public Optional<Reg> getRegById(Long id)
    {
     return regRepo.findById(id);
    }
    
    public Reg edituser(Long regid,Reg reg)
    {
        Reg RegAvail = regRepo.findById(regid).orElse(null);
        if(RegAvail !=null)
        {    
             RegAvail.setId(reg.getId());
             RegAvail.setFirstName(reg.getFirstName());
            RegAvail.setLastName(reg.getFirstName());
             RegAvail.setEmail(reg.getLastName());
             RegAvail.setPassword(reg.getPassword());
             return regRepo.saveAndFlush(RegAvail);
        }
        else
        return null;
    }

    public void deluser(Long regid)
    {
         regRepo.deleteById(regid);
    }
    public List<Reg> getBySortedbyName(String field)
    {
        Sort sort = Sort.by(Sort.Direction.ASC,field);
        return regRepo.findAll(sort);
    }
    public List<Reg> getByPaging(int pgno,int pgsize)
    {
        PageRequest page = PageRequest.of(pgno, pgsize);
        return regRepo.findAll(page).getContent();
    }
    public List<Reg> getBySortandPages(String field,int no,int size)
    {
        return regRepo.findAll(PageRequest.of(no, size).withSort(Sort.Direction.ASC,field)).getContent();
    }
}