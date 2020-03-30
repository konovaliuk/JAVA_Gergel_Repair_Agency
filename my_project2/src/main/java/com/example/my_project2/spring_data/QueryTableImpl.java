package com.example.my_project2.spring_data;

import com.example.my_project2.entity.QueryTable;
import com.example.my_project2.entity.User;
import com.example.my_project2.interfac.QueryTableInterface;
import com.example.my_project2.repository.QueryTableRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

@Repository("QueryTableRepository")
@Transactional
@AllArgsConstructor

public class QueryTableImpl implements QueryTableInterface {
    private QueryTableRepository queryTableRepository;


    @Override
    public List<QueryTable> findByDate(Timestamp date) {
        return queryTableRepository.findByDate(date);
    }

    @Override
    public List<QueryTable> findAll() {
        return (List<QueryTable>) queryTableRepository.findAll();
    }
}
