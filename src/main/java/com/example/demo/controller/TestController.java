package com.example.demo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test/servicenow")
@Validated
public class TestController {
    @PostMapping("/inquiry")
    public String inquiry(
            @RequestBody String request){
        System.out.println(request);
        return request;
    }
}
