package com.example.demo.service.Impl;
import com.example.demo.entity.Validationentity;
import com.example.demo.repository.Validationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.Validservice;
import org.springframework.stereotype.Service;

@Service
public class Validserviceimpl implements Validservice{
    @Autowired Validationrepository vali;
    @Override
    public Validationentity posttdata(Validationentity val){
        return vali.save(val);
    }
}