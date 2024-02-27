package com.ashish.exceptionhandling.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hController {
    private Logger logger =LoggerFactory.getLogger(hController.class);

    @GetMapping("/wel")
    public String dohandle(){
        String msg="inside second handeller";
        try{
        int i=10/0;}
        catch(Exception e){
        logger.error("exception occured ::", e.getMessage());
        throw new ArithmeticException();
        
    }
        return msg;
}
}