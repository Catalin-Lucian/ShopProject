package com.example.shopproject.Model.DTO;

import java.util.List;

public class AuthorDTO {

    private Integer _ID;
    private String _prenume;
    private String _nume;
    private List<BookDTO> _books;


    public AuthorDTO(Integer ID,String prenume,String nume, List<BookDTO> books){
        _ID=ID;
        _nume=nume;
        _prenume=prenume;
        _books=books;
    }


    public Integer getID() {
        return _ID;
    }
    public void setID(Integer value) {
        _ID = value;
    }
    public String getPrenume() {
        return _prenume;
    }
    public void setNume(String value) {
        _nume = value;
    }

    public void getBooks(List<BookDTO> books) {
        _books=books;
    }
    public List<BookDTO> getBooks() {
        return _books;
    }
}
