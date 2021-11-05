package com.example.shopproject.Model.Entity;

public class Book {

    private String ISBN;
    private String titlu;
    private String editura;
    private String anPublicare;
    private String genLiteral;


    public Book() {
    }

    public Book(String titlu, String editura, String anPublicare, String genLiteral){
        this.titlu =titlu;
        this.editura =editura;
        this.anPublicare =anPublicare;
        this.genLiteral =genLiteral;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public String getAnPublicare() {
        return anPublicare;
    }

    public void setAnPublicare(String anPublicare) {
        this.anPublicare = anPublicare;
    }

    public String getGenLiteral() {
        return genLiteral;
    }

    public void setGenLiteral(String genLiteral) {
        this.genLiteral = genLiteral;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", titlu='" + titlu + '\'' +
                ", editura='" + editura + '\'' +
                ", anPublicare='" + anPublicare + '\'' +
                ", genLiteral='" + genLiteral + '\'' +
                '}';
    }
}
