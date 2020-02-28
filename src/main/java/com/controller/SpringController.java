package com.controller;


import com.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class SpringController {

    @Autowired
    private HelloService service;

    @RequestMapping(value = "/helloMessage")
    public ResponseEntity<String> sayHello() {
        String message = service.sayHello();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}

 
