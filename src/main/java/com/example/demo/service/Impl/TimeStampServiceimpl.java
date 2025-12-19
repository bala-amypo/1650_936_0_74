package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ValidationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.ValidationRepo;
import com.example.demo.service.ValidationService;
// import com.example.demo.exception.ValidationException;
@Service
public class TimeStampServiceimpl implements TimeStampService{
  @Autowired TimeStampRepo stamp;
  @Override
   public TimeStamp postDataa(TimeStamp ti){
             return validate.save(val);
      }
      
}    
