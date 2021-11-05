package com.example.shopproject.Controller;


import com.example.shopproject.Model.Entity.Book;
import com.example.shopproject.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/bookcollection/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public ResponseEntity GetBookByISBN(@RequestParam String ISBN){
        var book=bookRepository.get(ISBN);
        return ResponseEntity.ok(book);
    }

    @PostMapping
    public void PostBook(@RequestBody Book book){
        System.out.println(book.toString());
        bookRepository.create(book);
    }
}
