package com.ashish.exceptionhandling.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.exceptionhandling.entity.ExceptionInfo;

@RestController
public class Controller {
    private Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/")
    public String doAction() {
        String s = "Welcome to Ashish IT";
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            logger.error("Exception Occurred::", e.getMessage());
            throw new ArithmeticException(e.getMessage());
        }
        return s; 
    }

    //Controller BAsed Exception Handeller
    // @ExceptionHandler(ArithmeticException.class)
    // public ResponseEntity<ExceptionInfo> handleArithmeticException(ArithmeticException ae) {
    //     ExceptionInfo exc = new ExceptionInfo();
    //     exc.setMsg(ae.getMessage());
    //     exc.setCode("AI0004");

    //     return new ResponseEntity<>(exc, HttpStatus.INTERNAL_SERVER_ERROR);
    // }
}
