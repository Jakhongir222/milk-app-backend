package com.example.milkappbackend.model;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;


@Document("milkStore")
public class Milk {


    @MongoId(value = FieldType.OBJECT_ID)
    private String docId;
    private String id;

    private String name;

    private String type;

    private int storage;

    public Milk(String id, String name, String type, int storage) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.storage = storage;
    }

    public Milk() {

    }

    //FGH
    // GFCHGJK

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
