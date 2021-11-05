package com.example.shopproject.Repository;


import com.example.shopproject.Model.Entity.Author;
import com.example.shopproject.Model.Entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Component
public class BookRepository implements Repository<Book,String> {

    private static final Logger log= LoggerFactory.getLogger(BookRepository.class);
    private JdbcTemplate jdbcTemplate;

    public BookRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> getBookByISBN(String ISBN){

        String query= "SELECT * FROM book WHERE ISBN = '" + ISBN+ "'";
        List<Book> books = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Book.class));
        return books;
    }


    @Override
    public List<Book> list() {
        String sql="SELECT * FROM book";
        return jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Book.class));
    }

    @Override
    public void create(Book book) {
        String sql="INSERT INTO book (ISBN, titulu, editura, an_publicare, gen_literal) VALUES(?,?,?,?,?)";
        int insert = jdbcTemplate.update(sql,book.getISBN(),book.getTitlu(),book.getEditura(),book.getAnPublicare(),book.getGenLiteral());
        if (insert == 1){
            log.info("new Author created:"+ book.toString());
        }
    }

    @Override
    public Optional<Book> get(String id) {
        String sql= "SELECT * FROM book WHERE ISBN = ?";
        Book book = null;
        try{
            book = jdbcTemplate.queryForObject(sql, new Object[]{id},BeanPropertyRowMapper.newInstance(Book.class));
        }catch (DataAccessException ex){
            log.info("Book not found:"+id);
        }
        return Optional.ofNullable(book);
    }

    @Override
    public void update(Book book, String id) {
        String sql="UPDATE book SET titlu=?, editura=?, an_publicare=?,gen_literal=? where ID = ?";
        int update = jdbcTemplate.update(sql,book.getTitlu(),book.getEditura(),book.getAnPublicare(),book.getGenLiteral(),book.getISBN());
        if (update == 1){
            log.info("Book updated:"+book.getISBN());
        }
    }

    @Override
    public void delete(String id) {
        jdbcTemplate.update("delete from book where ISBN = ?",id);
    }
}
