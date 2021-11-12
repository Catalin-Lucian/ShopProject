package com.example.shopproject.Model.Entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Author implements Serializable {

    @Id
    @GeneratedValue
    private Integer ID;
    private String PRENUME;
    private String NUME;


    @Override
    public String toString() {
        return "Author{" +
                "ID=" + ID +
                ", prenume='" + PRENUME + '\'' +
                ", nume='" + NUME + '\'' +
                '}';
    }
}
