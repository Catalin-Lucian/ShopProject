package com.example.shopproject.Model.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

    @Id
    private Integer ID;
    private String PRENUME;
    private String NUME;


    public Author(String PRENUME, String NUME) {
        this.PRENUME = PRENUME;
        this.NUME = NUME;
    }

    protected Author() {
    }

    public Integer getID() {
        return ID;
    }

    public String getPRENUME() {
        return PRENUME;
    }

    public void setPRENUME(String prenume) {
        this.PRENUME = prenume;
    }

    public String getNUME() {
        return NUME;
    }

    public void setNUME(String nume) {
        this.NUME = nume;
    }

    @Override
    public String toString() {
        return "Author{" +
                "ID=" + ID +
                ", prenume='" + PRENUME + '\'' +
                ", nume='" + NUME + '\'' +
                '}';
    }
}
