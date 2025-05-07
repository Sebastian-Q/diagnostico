package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class apiController {

    // Get bed by ID
    @GetMapping("/")
    public ResponseEntity<?> getHello() {
        return ResponseEntity.ok("Hola desde mi backend");
    }
}

