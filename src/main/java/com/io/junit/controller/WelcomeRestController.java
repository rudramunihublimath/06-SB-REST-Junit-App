package com.io.junit.controller;


import com.io.junit.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
    @Autowired
    private WelcomeService welcomeService;

    @GetMapping("/welcome")
    public ResponseEntity<String> welcomeMsg(){
        String msg = welcomeService.getWelcomeMSg();
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }


}
