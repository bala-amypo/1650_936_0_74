package com.example.demo.exception;
public class ValidException extends RuntimeException{
    public ValidationException(String message){
        super(message);
    }
}