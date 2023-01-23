package com.example.milkappbackend.service;

import com.example.milkappbackend.model.Milk;
import com.example.milkappbackend.repository.JPAMilkRepository;
import com.example.milkappbackend.repository.MilkRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    MilkRepository repo;
    @Autowired
    private JPAMilkRepository jpaRepo;

    public void loadData() throws IOException{
        File jsonFile = new ClassPathResource("milk.json").getFile();
        List<Milk> milks = objectMapper.readValue(jsonFile, new TypeReference<List<Milk>>() {});
        jpaRepo.saveAll(milks);
    }
}
