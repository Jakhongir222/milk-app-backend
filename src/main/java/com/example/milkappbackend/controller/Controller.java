package com.example.milkappbackend.controller;

import com.example.milkappbackend.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/milk")
public class Controller {
    @Autowired
    Service service;

    @PostMapping("/load-data")
    public void loadData() throws IOException {
        service.loadData();
    }
}
