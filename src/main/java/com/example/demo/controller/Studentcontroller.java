package com.example.demo.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.Studentservice;
import com.example.demo.entity.Studententity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@RestController
public class Studentcontroller{
    @Autowired Studentservice ser;
    @PostMapping("/post")
    public Studententity senddata(@RequestBody Studententity stu){
        return ser.postdata(stu);
    }
    @GetMapping("/get")
    public List<Studententity> getdata(){
        return ser.getalldata();
    }
    @DeleteMapping("/delete/{rollno}")
    public String deleteval(@PathVariable int rollno){
        return ser.deletedata(rollno);

    }
    @GetMapping("/getid/{rollno}")
    public Studententity getdataid(@PathVariable int rollno){
        return ser.getdata(rollno); 
    }
    @PutMapping("/put/{rollno}")
    public Studententity putval(@PathVariable int rollno,@RequestBody Studententity entity){
        return ser.updatedata(rollno,entity);
    }
     



}