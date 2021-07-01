package com.example.hd.services;

import java.io.IOException;
import java.util.List;

import com.example.hd.CSVHelper;
import com.example.hd.pojo.Data;
import com.example.hd.repositories.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class CSVService {
    @Autowired
    DataRepository repository;

    public void save(MultipartFile file) {
        try {
            List<Data> dataList = CSVHelper.csvToTutorials(file.getInputStream());
            repository.saveAll(dataList);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public List<Data> getAllTutorials() {
        return repository.findAll();
    }
}