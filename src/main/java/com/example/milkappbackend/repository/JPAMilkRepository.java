package com.example.milkappbackend.repository;

import com.example.milkappbackend.model.Milk;
import org.springframework.data.repository.CrudRepository;

public interface JPAMilkRepository extends CrudRepository<Milk, String> {
}
