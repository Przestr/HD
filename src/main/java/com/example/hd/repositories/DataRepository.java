package com.example.hd.repositories;

import com.example.hd.pojo.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface DataRepository extends CrudRepository<Data, Integer>, PagingAndSortingRepository<Data, Integer> {

    List<Data> findAll();
}
