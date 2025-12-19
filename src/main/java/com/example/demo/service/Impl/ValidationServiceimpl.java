package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ValidationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.ValidationRepo;
import com.example.demo.service.ValidationService;
import com.example.demo.exception.ValidationException;
@Service
public class ValidationServiceimpl implements ValidationService{
  @Autowired ValidationRepo validate;
  @Override
   public ValidationEntity postData(ValidationEntity val){
             return validate.save(val);
      }
      @Override 
     public ValidationEntity getdata(Long id){
      //   return validate.findById(id).orElse(null);
      return validate.findById(id).orElseThrow(()->new ValidationException("invalid"+id));
     }
}    
