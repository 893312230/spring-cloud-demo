package org.example.feignclient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "app-producer-01") // value 取值为 application.name 的取值
public interface UsernameService {
    @GetMapping(value = "/api/getUsername")
    public String getUsername();

}
