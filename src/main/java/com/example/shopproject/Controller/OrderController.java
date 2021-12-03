package com.example.shopproject.Controller;


import com.example.shopproject.Model.Entity.Order;
import com.example.shopproject.Service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/orders")
public class OrderController {

    public final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public void PostOrder(Order order){
        orderService.PostOrder(order);
    }

}
