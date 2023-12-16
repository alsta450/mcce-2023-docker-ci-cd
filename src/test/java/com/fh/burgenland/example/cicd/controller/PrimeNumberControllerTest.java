package com.fh.burgenland.example.cicd.controller;

import com.fh.burgenland.example.cicd.service.PrimeNumberService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PrimeNumberControllerTest {

    private final PrimeNumberService mockPrimeNumberService = Mockito.mock(PrimeNumberService.class);

    private final PrimeNumberController primeNumberController = new PrimeNumberController(mockPrimeNumberService);

    @Test
    void givenControllerCallReturnResponseEntityWithPrimeNumber() {
        when(mockPrimeNumberService.createRandomPrimeNumber()).thenReturn(13);
        ResponseEntity<Integer> actualRandomPrimeNumber = primeNumberController.getRandomPrimeNumber();

        assertEquals(13, actualRandomPrimeNumber.getBody());
    }
}