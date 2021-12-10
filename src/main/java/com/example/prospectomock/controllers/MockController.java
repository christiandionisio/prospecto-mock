package com.example.prospectomock.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mockService")
public class MockController {

    @PostMapping
    public ResponseEntity<String> mockService(@RequestBody String input) {
        return new ResponseEntity<String>("Hola mundo", HttpStatus.OK);
    }

}
