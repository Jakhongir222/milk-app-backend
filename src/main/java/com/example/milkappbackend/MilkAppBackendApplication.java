package com.example.milkappbackend;

import com.example.milkappbackend.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.File;

@SpringBootApplication
public class MilkAppBackendApplication implements CommandLineRunner {


    @Autowired
    private Service service;

    public static void main(String[] args) {
        SpringApplication.run(MilkAppBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ClassPathResource resource = new ClassPathResource("milk.json");
        File file = resource.getFile();
        service.loadData(file.getAbsolutePath());
    }
}
