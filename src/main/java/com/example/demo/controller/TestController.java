package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test/servicenow")
@Validated
public class TestController {
    @PostMapping(path = "/inquiry", produces= MediaType.APPLICATION_JSON_VALUE)
    public String inquiry(
            @RequestBody String request){
        System.out.println(request);
        return request;
    }
}
