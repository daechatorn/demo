package com.example.demo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class HomeController {
    @GetMapping("/")
    public String test(){
        return "Hello from spring boot";
    }
}
