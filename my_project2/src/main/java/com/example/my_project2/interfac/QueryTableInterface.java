package com.example.my_project2.interfac;

import com.example.my_project2.entity.QueryTable;

import java.sql.Timestamp;
import java.util.List;

public interface QueryTableInterface {

    List<QueryTable> findByDate(Timestamp date);
    List<QueryTable> findAll();

}
