package com.example.shopproject.Model.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private String ISBN;
    private String TITLU;
    private String EDITURA;
    private Integer AN;
    private String GEN;


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTITLU() {
        return TITLU;
    }

    public void setTITLU(String TITLU) {
        this.TITLU = TITLU;
    }

    public String getEDITURA() {
        return EDITURA;
    }

    public void setEDITURA(String EDITURA) {
        this.EDITURA = EDITURA;
    }

    public Integer getAN() {
        return AN;
    }

    public void setAN(Integer AN_PUBLICARE) {
        this.AN = AN_PUBLICARE;
    }

    public String getGEN() {
        return GEN;
    }

    public void setGEN(String GEN_LITERAR) {
        this.GEN = GEN_LITERAR;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", TITLU='" + TITLU + '\'' +
                ", EDITURA='" + EDITURA + '\'' +
                ", AN=" + AN +
                ", GEN='" + GEN + '\'' +
                '}';
    }
}
