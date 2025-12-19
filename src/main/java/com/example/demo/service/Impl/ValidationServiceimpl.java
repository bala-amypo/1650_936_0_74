package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ValidationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.ValidationRepo;
import com.example.demo.service.ValidationService;
@Service
public class ValidationServiceimpl implements ValidationService{
  @Autowired ValidationRepo validate;
  @Override
   public ValidationEntity postData(ValidationEntity val){
             return validate.save(val);
      }
      @Override 
     public ValidationEntity getdata(int id){
        return validate.findById(id                                                                                                                                                                                                              ).orElse(null);
     }
}