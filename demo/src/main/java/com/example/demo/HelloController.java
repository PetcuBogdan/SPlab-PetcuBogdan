package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequiredArgsConstructor
public class HelloController {
    private final ClientComponent clientComponent;

    @GetMapping("/")
    public String sayHello() {
        return "Hello";
    }
}
