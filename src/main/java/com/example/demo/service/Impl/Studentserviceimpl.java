package com.example.demo.service.Impl;


import org.springframework.stereotype.Service;
@Service
public class Studentserviceimpl implements Studentservice{
    @Autowired Studentrepository student;
    //save(),findAll(),findById(),deleteById(),existsById();
    
    public Studententity postdata(Studententity stu){
       

    }


}