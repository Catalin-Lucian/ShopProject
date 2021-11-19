package com.example.shopproject.Model.DTO.Book;

import com.example.shopproject.Model.DTO.DTO;


public class PartialBookDTO implements DTO {

    public String isbn;
    public String title;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "PartialBookDTO{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
