package com.fh.burgenland.example.cicd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<Boolean> test() {
        System.out.println("Hello World");
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
