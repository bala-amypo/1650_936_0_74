package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TimeStamp;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.TimeStampRepo;
import com.example.demo.service.TimeStampService;
// import com.example.demo.exception.ValidationException;
@Service
public class TimeStampServiceimpl implements TimeStampService{
  @Autowired TimeStampRepo stamp;
  @Override
   public TimeStamp postDataa(TimeStamp ti){
             return stamp.save(ti);
      }
      
}    
