package com.example.shopproject.Repository;

import com.example.shopproject.Model.Entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
