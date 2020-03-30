package com.example.my_project2.controlers;


import com.example.my_project2.entity.QueryTable;
import com.example.my_project2.entity.User;
import com.example.my_project2.service.QueryTableServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class QueryTableServiceController {
    @Autowired
    private QueryTableServiceImpl queryTableService;


    @GetMapping(value = "/getQuery")
    public ResponseEntity<QueryTable> getQuery(){
        return new ResponseEntity(queryTableService.getQuery(), HttpStatus.OK);
    }
}
