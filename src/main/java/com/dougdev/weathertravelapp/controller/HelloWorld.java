package com.dougdev.weathertravelapp.controller;

import com.dougdev.weathertravelapp.services.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    private HelloWorldService helloWorldService;

    public HelloWorld() {
        this.helloWorldService = new HelloWorldService();
    }

    @GetMapping(value = "/helloWorld")
    public String helloWorld() {
        return helloWorldService.helloWorldOutput();
    }
}
