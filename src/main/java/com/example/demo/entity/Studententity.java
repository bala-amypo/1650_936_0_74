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
    
    
    public void setrollno(Integer rollno){
        this.rollno=rollno;
    }
    public Integer getrollno(){
        return rollno;
    }
   
    public void setname(String name){
        this.name=name;
    }
     public String getname(){
        return name;
    }
    
    public void setemail(String email){
        this.email=email;
    }
    public String getemail(){
        return email;
    }
    
    public void setpass(String pass){
        this.pass=pass;
    }
    public String getpass(){
        return pass;
    }
    
    public void setdate(Date date){
        this.date=date;
    }
    
    public Studententity(Integer rollno,String name,String email,String pass,Date date){
            this.rollno=rollno;
            this.name=name;
            this.email=email;
            this.pass=pass;
            this.date=date;
    }
    public Studententity(){

    }
}                
