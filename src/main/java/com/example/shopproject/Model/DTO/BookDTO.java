package com.example.shopproject.Model.DTO;

import java.util.List;

public class BookDTO {

    private String _ISBN;
    private String _titlu;
    private String _editura;
    private String _anPublicare;
    private String _genLiteral;
    private List<AuthorDTO> _authors;



    public BookDTO(String ISBN,String titlu, String editura,String anPublicare, String genLiteral, List<AuthorDTO> authors){
        _ISBN=ISBN;
        _titlu=titlu;
        _editura=editura;
        _anPublicare=anPublicare;
        _genLiteral=genLiteral;
        _authors=authors;
    }

    public String getISBN() {
        return _ISBN;
    }
    public void setISBN(String value) {
        _ISBN = value;
    }
    public String getTitlu() {
        return _titlu;
    }
    public void setTitlu(String value) {
        _titlu = value;
    }
    public String getEditura() {
        return _editura;
    }
    public void setEditura(String value) {
        _editura = value;
    }
    public String getAnPulicare() {
        return _anPublicare;
    }
    public void setAnPublicare(String value) {
        _anPublicare = value;
    }
    public String getGenLiteral() {
        return _genLiteral;
    }
    public void setGenLiteral(String value) {
        _genLiteral = value;
    }
    public List<AuthorDTO> getAuthors() {
        return _authors;
    }
    public void setAuthors(List<AuthorDTO> authors) {
        _authors=authors;
    }
}
