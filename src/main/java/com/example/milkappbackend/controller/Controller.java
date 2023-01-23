package com.example.milkappbackend.controller;

import com.example.milkappbackend.dto.MilkDTO;
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

    @GetMapping("/{id}")
    public ResponseEntity<?> getSpecificMilk(@PathVariable String id){
        return ResponseEntity.ok(service.getSpecificMilk(id));
    }

    @PostMapping
    public ResponseEntity<?> createNewMilk (@RequestBody MilkDTO milkDto){
        service.createNewMilk(milkDto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMilk(@PathVariable String id){
        service.deleteMilk(id);
        return ResponseEntity.ok().build();
    }




}
