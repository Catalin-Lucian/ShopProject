package com.example.shopproject.Controller;


import com.example.shopproject.Model.Entity.Book;
import com.example.shopproject.Repository.BookRepository;
import com.example.shopproject.Service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/bookcollection/books")
public class BookController {


    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public @ResponseBody
    Optional<Book> GetBookByISBN(@RequestParam String ISBN){
        return bookService.GetBookByISBN(ISBN);
    }

    @PostMapping
    public void PostBook(@RequestBody Book book){
        System.out.println(book.toString());
        bookService.PostBook(book);
    }
}
