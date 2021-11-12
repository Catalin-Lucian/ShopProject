package com.example.shopproject.Service;


import com.example.shopproject.Model.Entity.Author;
import com.example.shopproject.Repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Optional<Author> GetAuthorByID(Integer ID) {
        return authorRepository.findById(ID);
    }

    public void PostAuthor(@RequestBody Author author) {
        System.out.println(author.toString());
        authorRepository.save(author);
    }
}
