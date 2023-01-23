package com.example.milkappbackend.repository;


import com.example.milkappbackend.model.Milk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MilkRepository {
    @Autowired
    JPAMilkRepository repo;

    public Object getAllMilk() {
        return repo.findAll();
    }

    public Object getSpecificMilk(String id) {
        return repo.findById(id);
    }

    public Object createNewMilk(Milk milk) {
        return repo.save(milk);
    }

    public void deleteMilk(String id) {
         repo.deleteById(id);
    }
}
