package com.khrd.spring_clould;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${app.message}")
    private String message;

    @GetMapping("/config")
    public String getConfigMessage() {
        return "Message from Config Server: " + message;
    }
}