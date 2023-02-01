package com.example.milkappbackend.repository;

import com.example.milkappbackend.model.Milk;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JPAMilkRepository extends MongoRepository <Milk, String> {

    Milk getMilkById(String id);
}
