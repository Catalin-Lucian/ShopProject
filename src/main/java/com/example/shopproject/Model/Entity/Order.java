package com.example.shopproject.Model.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.persistence.Id;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Document(collation = "Client.ID")
public class Order {

    @MongoId
    public ObjectId id;
    public Date date = new Date();
    public Map<String,String> items = new HashMap<>();

    public Order() {
    }

    public Order(Date date, Map<String, String> items) {
        this.date = date;
        this.items = items;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, String> getItems() {
        return items;
    }

    public void setItems(Map<String, String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", items=" + items +
                '}';
    }
}
