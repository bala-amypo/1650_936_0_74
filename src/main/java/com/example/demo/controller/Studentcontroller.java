package com.example.demo.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.Studentservice;
import com.example.demo.entity.Studententity;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class Studentcontroller{
    @Autowired Studentservice ser;
    @PostMapping("/post")
    public Studententity senddata(@RequestBody Studententity ent){
        return ser.postdata(ent);
    }



}