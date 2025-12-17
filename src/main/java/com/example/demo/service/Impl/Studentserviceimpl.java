package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Studententity;
import com.example.demo.repository.Studentrepository;
import com.example.demo.service.Studentservice; 
import org.springframework.stereotype.Service;
@Service
public class Studentserviceimpl implements Studentservice{
    @Autowired Studentrepository student;
    //save(),findAll(),findById(),deleteById(),existsById();
    @Override
    public Studententity postdata(Studententity stu){
       return student.save(stu);

    }


}