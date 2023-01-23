package com.example.milkappbackend.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MilkRepository {
    @Autowired
    JPAMilkRepository repo;

    public Object getAllMilk() {
        return repo.findAll();
    }
}
