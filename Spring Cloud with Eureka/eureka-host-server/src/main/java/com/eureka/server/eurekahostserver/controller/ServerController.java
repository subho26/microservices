package com.eureka.server.eurekahostserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/server")
public class ServerController {
    @GetMapping
    public String sayHelloServer()
    {
        return "Hello Server";
    }
}
