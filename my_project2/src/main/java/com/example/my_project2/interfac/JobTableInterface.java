package com.example.my_project2.interfac;

import com.example.my_project2.entity.JobTable;

import java.util.List;

public interface JobTableInterface {

    List<JobTable> findByPrice(Integer price);
    List<JobTable> findAll();
}
