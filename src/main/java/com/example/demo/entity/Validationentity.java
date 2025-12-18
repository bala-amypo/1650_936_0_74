package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraint.NotNull;
import jakarta.validation.constraint.Size;
import jakarta.validation.constraint.Email;
import jakarta.validation.constraint.Max;


@Entity
public class Validationentity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=6,message="must be of 2 to 6 characters")
    private String username;
    @NotNull(message="password mandatory")
    @Max(6)
    private String password;
    @Email(message="email not valid")
    private String email;
    @Max(30)
    @Positive
    private int age;

}