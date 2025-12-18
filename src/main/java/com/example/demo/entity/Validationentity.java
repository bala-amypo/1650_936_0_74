package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;

@Entity
public class Validationentity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=6,message="must be of 2 to 6 characters")
    private String username;
    @NotNull(message="password mandatory")
    @Size(min=2,max=6)
    private String password;
    @Email(message="email not valid")
    private String email;
    @Max(30)
    @Positive(message="age must be positive")
    private int age;
    

     public void setid(Long id){
        this.id=id;
    }
    public Long getid(){
        return id;
    }
   
    public void setusername(String username){
        this.username=username;
    }
     public String getusername(){
        return username;
    }
    
    public void setemail(String email){
        this.email=email;
    }
    public String getemail(){
        return email;
    }
    
    public void setpassword(String password){
        this.password=password;
    }
    public String getpassword(){
        return password;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }
    public Validationentity(Long id,
    @NotNull
    @Size(min=2,max=6,message="must be of 2 to 6 characters") String username,
    @NotNull(message="password mandatory")@Size(min=2,max=6) String password,
    @Email(message="email not valid") String email,
    @Max(30)@Positive(message="age must be positive") int age){

this.id=id;
this.username=username;
this.email=email;
this.password=password;
this.age=age;
    }
     public Validationentity(){

     }
}