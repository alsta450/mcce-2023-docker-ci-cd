package com.fh.burgenland.example.cicd.service;

import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class PrimeNumberService {


    public int createRandomPrimeNumber() {
        Random random = new Random();
        int randomNum = random.nextInt(Integer.MAX_VALUE);

        while (!isPrime(randomNum)) {
            randomNum = random.nextInt(Integer.MAX_VALUE);
        }

        return randomNum;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
