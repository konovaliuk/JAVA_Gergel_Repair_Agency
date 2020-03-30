package com.example.my_project2.entity;

import com.example.my_project2.entity.JobTable;
import com.example.my_project2.entity.QueryTable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user", schema = "my_chema")
public class User implements Serializable{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer user_id;
    private String user_name;
    private String status;

    @OneToMany(mappedBy = "user_query")
    @JsonIgnore
    private List<QueryTable> queryTableList;

    @OneToMany(mappedBy = "user_job")
    @JsonIgnore
    private List<JobTable> jobTable;

    public User(Integer user_id, String user_name, String status) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.status = status;
    }

    public User(String user_name, String status) {
        this.user_name = user_name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + user_id +
                ", userName='" + user_name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
