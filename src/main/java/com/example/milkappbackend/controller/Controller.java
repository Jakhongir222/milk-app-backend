package com.example.milkappbackend.controller;

import com.example.milkappbackend.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/milk")
public class Controller {
    @Autowired
    Service service;

    @GetMapping
    public ResponseEntity<?> getAllMilk(){
        return ResponseEntity.ok(service.getAllMilk());
    }
}
