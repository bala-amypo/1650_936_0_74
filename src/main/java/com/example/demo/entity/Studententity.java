package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistance.Id;
import jakarta.persistance.GeneratedValue;
import jakarta.persistance.GenerationtType;
@Entity
public class Studententity{
    @Id
    @GeneratedValue(strategy=GenerationtType.IDENTITY)
    private Integer rollno;

    private String name;
    private String email;
    private String pass;
    private Date date;
    
    public Integer getrollno(){
        return rollno;
    }
    public void setrollno(Integer rollno){
        this.rollno=rollno;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email=email;
    }
    public String getpass(){
        return pass;
    }
    public void setpass(String pass){
        this.pass=pass;
    }
    public Date getdate(){
        return date;
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
