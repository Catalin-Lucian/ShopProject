package com.example.shopproject.Model.Entity.Order;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.persistence.Entity;
import java.util.*;


@Document(collation = "client")
public class Order {

    @MongoId
    private ObjectId id;
    private Date date = new Date();
    private List<Items> items= new ArrayList<Items>();

    public Order() {
    }

    public Order(ObjectId id, Date date, List<Items> items) {
        this.id = id;
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

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
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
