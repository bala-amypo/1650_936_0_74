package com.example.demo.service.Impl;


import org.springframework.stereotype.Service;
@Service
public class Studentserviceimpl implements Studentservice{
    package com.example.demo.service;
import com.example.demo.entity.Studententity;
public interface Studentservice{
    Studententity postdata(Studententity stu);
}

}