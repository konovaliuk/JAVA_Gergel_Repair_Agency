package com.example.my_project2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "job_table", schema = "my_chema")
@NoArgsConstructor
public class JobTable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private Integer price;
    private Byte decision;
    private Byte repairDone;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="master_id", referencedColumnName = "user_id"),
            @JoinColumn(name="manager_id", referencedColumnName = "user_id")
    })
    private User user_job;

    @ManyToOne
    @JoinColumn(name="id_product")
    private QueryTable queryTable;


}
