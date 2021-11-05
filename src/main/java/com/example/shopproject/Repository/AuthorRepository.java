package com.example.shopproject.Repository;

import com.example.shopproject.Model.Entity.Author;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AuthorRepository implements Repository<Author, Integer> {

    private static final Logger log= LoggerFactory.getLogger(AuthorRepository.class);
    private JdbcTemplate jdbcTemplate;

    public AuthorRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Author> list() {
        String sql="SELECT * FROM autor";
        return jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Author.class));
    }

    @Override
    public void create(Author author) {
        String sql="INSERT INTO autor (nume,prenume) VALUES(?,?)";
        int insert = jdbcTemplate.update(sql,author.getNume(),author.getPrenume());
        if (insert == 1){
            log.info("new Author created:"+ author.toString());
        }
    }

    @Override
    public Optional<Author> get(Integer id) {
        String sql= "SELECT * FROM autor WHERE ID = ?";
        Author author = null;
        try{
            author = jdbcTemplate.queryForObject(sql, new Object[]{id},BeanPropertyRowMapper.newInstance(Author.class));
        }catch (DataAccessException ex){
            log.info("Author not found:"+id);
        }
        return Optional.ofNullable(author);
    }

    @Override
    public void update(Author author, Integer id) {
        String sql="UPDATE author SET nume=?, prenume=? where ID = ?";
        int update = jdbcTemplate.update(sql,author.getNume(),author.getPrenume(),author.getID());
        if (update == 1){
            log.info("Author updated:"+author.getID());
        }
    }

    @Override
    public void delete(Integer id) {
        jdbcTemplate.update("delete from author where ID = ?",id);
    }
}
