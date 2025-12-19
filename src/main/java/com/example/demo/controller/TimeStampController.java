package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.TimeStamp;
import com.example.demo.service.TimeStampService;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;
@RestController
public class TimeStampController{
  @Autowired TimeStampService ti;
  @PostMapping("/postvall")
  public TimeStamp sendDataa(@Valid @RequestBody TimeStamp ts){
      return ti.postDataa(ts);
  }
  
}     