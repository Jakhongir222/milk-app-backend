package com.example.milkappbackend.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

public class JsonFileReader {

    public Object readJsonFile(String filePath, Class clazz) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new FileReader(filePath), clazz);
    }
}
