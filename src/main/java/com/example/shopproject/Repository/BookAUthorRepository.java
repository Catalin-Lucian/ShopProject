package com.example.shopproject.Repository;

import com.example.shopproject.Model.Entity.BookAuthor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookAUthorRepository extends CrudRepository<BookAuthor,Integer> {
    List<BookAuthor> findAllByIDAUTHOR(Integer IDAUTHOR);
    List<BookAuthor> findAllByISBN(String ISBN);
}
