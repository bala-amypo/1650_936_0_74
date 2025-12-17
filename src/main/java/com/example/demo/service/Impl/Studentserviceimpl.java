package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation

import org.springframework.stereotype.Service;
@Service
public class Studentserviceimpl implements Studentservice{
    @Autowired Studentrepository student;
    //save(),findAll(),findById(),deleteById(),existsById();

    public Studententity postdata(Studententity stu){
       return student.save(stu);

    }


}