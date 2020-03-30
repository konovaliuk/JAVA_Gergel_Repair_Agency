package com.example.my_project2.service;


import com.example.my_project2.entity.JobTable;
import com.example.my_project2.entity.QueryTable;
import com.example.my_project2.interfac.JobTableInterface;
import com.example.my_project2.interfac.QueryTableInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JobTableServiceImpl {

    @Autowired
    private JobTableInterface jobTableInterface;

    @Transactional(readOnly = true)
    public List<JobTable> getJobs(){
        return jobTableInterface.findAll();
    }

    @Transactional(readOnly = true)
    public List<JobTable> getJob(Integer price){
        return jobTableInterface.findByPrice(price);
    }
}
