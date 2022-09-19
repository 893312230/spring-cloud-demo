package org.example.controller;


import org.example.feignclient.UsernameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feignMethod")
public class ConsumerController {

    @Autowired
    private UsernameService usernameService;
    @GetMapping("/getUsername")
    public String getRemoteUsername(){
        String username = usernameService.getUsername();
        return username;
    }
}
