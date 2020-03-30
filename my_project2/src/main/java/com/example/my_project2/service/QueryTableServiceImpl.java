package com.example.my_project2.service;


import com.example.my_project2.entity.QueryTable;
import com.example.my_project2.interfac.QueryTableInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Service
public class QueryTableServiceImpl {

    @Autowired
    private QueryTableInterface queryTableInterface;

    @Transactional(readOnly = true)
    public List<QueryTable> getQuery(){
        return queryTableInterface.findAll();
    }

    @Transactional(readOnly = true)
    public List<QueryTable> getQuery(Timestamp date){
        return queryTableInterface.findByDate(date);
    }
}
