package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentIdRepo;
import com.example.demo.service.StudentIdService;
// import com.example.demo.exception.ValidationException;
@Service
public class StudentDetailsServiceimpl implements StudentDetailsService{
  @Autowired StudentDetailsRepo stui;
  @Override
   public StudentDetails postDattaa(StudentId st){
             return stui.save(st);
      }
      
}    
