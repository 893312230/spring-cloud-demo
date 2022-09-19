package org.example.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsernameController {
    @Value("${server.port}")
    private String curServer;
    @Value("${spring.application.name}")
    private String curAppName;
    @GetMapping("/getUsername")
    public String returnCurrentUsername(){
        return "lvhui"+curAppName+curServer;
    }
}
