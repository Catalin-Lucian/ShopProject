package com.example.shopproject.Repository;

import com.example.shopproject.Model.Entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.*;
import java.util.List;

@Repository
public class AuthorRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Author> getAuthorByID(Integer ID){

        String query= "SELECT * FROM autor WHERE ID = '" + ID+ "'";
        List<Author> authors = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Author.class));

        authors.forEach(System.out::println);
        return authors;
    }


}
