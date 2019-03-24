package com.eureka.client.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/client")
public class ClientController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String sayHelloServer() {
        return restTemplate.getForObject("http://eureka-host-server/server", String.class);
    }
}
