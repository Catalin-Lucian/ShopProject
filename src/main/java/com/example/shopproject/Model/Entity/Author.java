package com.example.shopproject.Model.Entity;

public class Author {

    private Integer ID;
    private String prenume;
    private String nume;

    public Author(){}

    public Author(String prenume, String nume) {
        this.prenume = prenume;
        this.nume = nume;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Author{" +
                "ID=" + ID +
                ", prenume='" + prenume + '\'' +
                ", nume='" + nume + '\'' +
                '}';
    }
}
