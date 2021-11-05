package com.example.shopproject.Model.Entity;

public class Book {

    private String _ISBN;
    private String _titlu;
    private String _editura;
    private String _anPublicare;
    private String _genLiteral;

    public Book(String ISBN,String titlu, String editura,String anPublicare, String genLiteral){
        _ISBN=ISBN;
        _titlu=titlu;
        _editura=editura;
        _anPublicare=anPublicare;
        _genLiteral=genLiteral;
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

}
