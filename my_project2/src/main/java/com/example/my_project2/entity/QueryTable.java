package com.example.my_project2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@Table(name = "query_table", schema = "my_chema")
@NoArgsConstructor
public class QueryTable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private Timestamp date;
    private String nameProduct;
    private String typeBreaking;

    @OneToMany(mappedBy = "queryTable")
    @JsonIgnore
    private List<JobTable> jobTable;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user_query;

    public QueryTable(Integer id, Timestamp date, String nameProduct, String typeBreaking ) {
    this.id = id;
    this.date = date;
    this.nameProduct = nameProduct;
    this.typeBreaking = typeBreaking;
    }
//
//    @Override
//    public String toString() {
//        return "QueryTable{" +
//                "id=" + id +
//                ", date=" + date +
//                ", nameProduct='" + nameProduct + '\'' +
//                ", typeBreaking='" + typeBreaking + '\'' +
//                ", user=" + user +
//                '}';
//    }
}
