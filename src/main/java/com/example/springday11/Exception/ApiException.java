package com.example.springday11.Exception;

public class ApiException extends RuntimeException{

    public ApiException(String message){
        super(message);
    }
}
