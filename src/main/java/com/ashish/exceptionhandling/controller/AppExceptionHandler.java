package com.ashish.exceptionhandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ashish.exceptionhandling.entity.ExceptionInfo;

@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ExceptionInfo> handleArithmeticException(ArithmeticException ae) {
        ExceptionInfo exc = new ExceptionInfo();
        exc.setMsg(ae.getMessage());
        exc.setCode("AI0004");

        return new ResponseEntity<>(exc, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
