package com.example.shopproject.Repository;

import com.example.shopproject.Model.Entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order,String>{

}
