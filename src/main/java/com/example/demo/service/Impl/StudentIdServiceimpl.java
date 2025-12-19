package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TimeStamp;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentIdRepo;
import com.example.demo.service.StudentIdService;
// import com.example.demo.exception.ValidationException;
@Service
public class StudentIdServiceimpl implements StudentIdService{
  @Autowired TimeStampRepo stamp;
  @Override
   public TimeStamp postDataa(TimeStamp ti){
             return stamp.save(ti);
      }
      
}    
