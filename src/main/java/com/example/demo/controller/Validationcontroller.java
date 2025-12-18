package com.example.demo.controller;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.service.Validservice;
import com.example.demo.entity.Validationentity;
import com.example.demo.repository.Validationrepository;

@RestController
public class Validationrepository{
    @Autowired Validservice va;
    @PostMapping("/postt")
    public Validationentity sendata(@Valid @RequestBody Validationentity val){
        return va.posttdata(val);
    }
}