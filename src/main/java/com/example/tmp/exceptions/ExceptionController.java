package com.example.tmp.exceptions;

import java.net.http.HttpResponse;

import com.example.tmp.domain.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
    
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity< Response > handleUserNotFound(){
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    } 


}
