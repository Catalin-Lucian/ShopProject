package com.example.shopproject.Service;

import com.example.shopproject.Model.Entity.Book;
import com.example.shopproject.Repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> GetBookByISBN( String ISBN){
        return bookRepository.findById(ISBN);
    }

    public void PostBook(@RequestBody Book book){
        System.out.println(book.toString());
        bookRepository.save(book);
    }
}
