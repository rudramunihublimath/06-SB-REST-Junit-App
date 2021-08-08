package com.io.junit.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    public String getWelcomeMSg() {
        return "Welcome to our world..";
    }
}
