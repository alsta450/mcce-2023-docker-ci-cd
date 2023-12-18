package com.fh.burgenland.example.cicd.controller;

import com.fh.burgenland.example.cicd.service.PrimeNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumberController {

    @NonNull
    private final PrimeNumberService primeNumberService;

    @Autowired
    public PrimeNumberController(PrimeNumberService primeNumberService) {
        this.primeNumberService = primeNumberService;
    }

    @GetMapping("/prime-numbers/getPrimeNumber")
    public ResponseEntity<Integer> getRandomPrimeNumber() {

        return new ResponseEntity<>(primeNumberService.createRandomPrimeNumber(), HttpStatus.OK);
    }
}
