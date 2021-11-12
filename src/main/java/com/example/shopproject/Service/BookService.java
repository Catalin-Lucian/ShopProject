package com.example.shopproject.Service;

import com.example.shopproject.Model.Entity.Book;
import com.example.shopproject.Repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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

    public void PostBook(Book book){
        System.out.println(book.toString());
        bookRepository.save(book);
    }

    public void DeleteBook(String ISBN){
        bookRepository.deleteById(ISBN);
    }

    public Iterable<Book> GetAllBooks(){
        return bookRepository.findAll();
    }

}
