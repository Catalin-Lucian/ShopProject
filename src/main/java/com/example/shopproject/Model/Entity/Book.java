package com.example.shopproject.Model.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Book implements Serializable {

    @Id
    private String ISBN;
    private String TITLU;
    private String EDITURA;
    private Integer AN;
    private String GEN;


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
