package com.example.my_project2.repository;

import com.example.my_project2.entity.QueryTable;
import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;
import java.util.List;

public interface QueryTableRepository extends CrudRepository<QueryTable, Integer> {
    List<QueryTable> findByDate(Timestamp date);
}
