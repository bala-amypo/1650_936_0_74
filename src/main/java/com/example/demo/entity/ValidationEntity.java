package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  @NotNull
  @Size(min=2,max = 6,message="must be of 2 to 6 characters") 
  private String name;
  @Email(message="Email is not Valid")
  private String email;
  @Size(max=6)
  @NotNull(message="password is mandatory")
  private String password;
  @Max(30)
  @Positive(message="Age must be positive")
   private int age;


  
}