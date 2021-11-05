package com.example.shopproject.Repository;


import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BookRepository {
    String stringConnection="jdbc:sqlserver://DESKTOP-R5D4659;integratedSecurity=false;database=POS";
    Connection conection = null;
    String user="";
    String password="";

    public BookRepository(){
        try {
            conection = DriverManager.getConnection(stringConnection, user, password);
            if (conection != null)
                System.out.println(" Connected");
        }
        catch (SQLException e)
        {
            System.out.println("error  "+e);
        }
    }



}
