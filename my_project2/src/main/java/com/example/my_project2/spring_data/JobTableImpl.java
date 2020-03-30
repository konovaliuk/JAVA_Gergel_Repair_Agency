package com.example.my_project2.spring_data;

import com.example.my_project2.entity.JobTable;
import com.example.my_project2.interfac.JobTableInterface;
import com.example.my_project2.repository.JobTableRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("JobTableRepository")
@Transactional
@AllArgsConstructor

public class JobTableImpl implements JobTableInterface {
    private JobTableRepository jobTableRepository;

    @Override
    public List<JobTable> findByPrice(Integer id) {
        return jobTableRepository.findByPrice(id);
    }

    @Override
    public List<JobTable> findAll() {
        return (List<JobTable>) jobTableRepository.findAll();
    }
}
