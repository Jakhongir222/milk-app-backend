package com.example.milkappbackend.service;

import com.example.milkappbackend.dto.MilkDTO;
import com.example.milkappbackend.model.JsonFileReader;
import com.example.milkappbackend.model.Milk;
import com.example.milkappbackend.repository.JPAMilkRepository;
import com.example.milkappbackend.repository.MilkRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
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


    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void loadData(String filePath) throws IOException {
        JsonFileReader jsonFileReader = new JsonFileReader();
        Milk[] data = (Milk[]) jsonFileReader.readJsonFile(filePath, Milk[].class);
        for (Milk milk : data) {
            entityManager.persist(milk);
        }
    }

    public Object getAllMilk() {
        return repo.getAllMilk();
    }

    public Object getSpecificMilk(String id) {
        return repo.getSpecificMilk(id);
    }

    public Object createNewMilk(MilkDTO milkDto) {
        return repo.createNewMilk(new Milk(milkDto.id(), milkDto.name(), milkDto.type(), milkDto.storage()));
    }

    public void deleteMilk(String id) {
         repo.deleteMilk(id);
    }
}
