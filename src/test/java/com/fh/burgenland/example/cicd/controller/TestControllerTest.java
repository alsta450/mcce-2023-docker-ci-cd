package com.fh.burgenland.example.cicd.controller;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestControllerTest {

    private final TestController testController = new TestController();

    @Test
    void test() {
        ResponseEntity<Boolean> actualResponse = testController.test();
        assertEquals(new ResponseEntity<>(true, HttpStatus.OK), actualResponse);
    }
}