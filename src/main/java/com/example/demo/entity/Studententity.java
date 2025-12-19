package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class Studententity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer rollno;

    private String name;
    private String email;
    private String pass;
    private Date date;
    
   
}                
