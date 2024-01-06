package com.example.demo.controller;

import com.example.demo.examples.ClientComponent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloController {
    private final ClientComponent clientComponent;

    @GetMapping("/")
    public String sayHello() {
        return "Hello";
    }
}
