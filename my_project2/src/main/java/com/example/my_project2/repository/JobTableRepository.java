package com.example.my_project2.repository;

import com.example.my_project2.entity.JobTable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JobTableRepository extends CrudRepository<JobTable, Integer> {
    List<JobTable> findByPrice(Integer price);
}
