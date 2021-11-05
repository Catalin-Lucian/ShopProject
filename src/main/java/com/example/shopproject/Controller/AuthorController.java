package com.example.shopproject.Controller;


import com.example.shopproject.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/bookcollection/authors")
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @GetMapping
    public ResponseEntity GetAuthorByID(@RequestParam Integer ID){
        var authors=authorRepository.get(ID);
        return ResponseEntity.ok(authors);
    }

}
