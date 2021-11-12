package com.example.shopproject.Model.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class BookAuthor {
    @Id
    @GeneratedValue
    private Integer ID;

    protected String ISBN;
    private Integer IDAUTHOR;

}
