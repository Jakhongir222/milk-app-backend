package com.example.milkappbackend.service;

import com.example.milkappbackend.dto.MilkDTO;
import com.example.milkappbackend.model.Milk;
import com.example.milkappbackend.repository.MilkRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    MilkRepository repo;



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

    public void updateMilk(Milk milk) {
        repo.updateMilk(milk);
    }
}
