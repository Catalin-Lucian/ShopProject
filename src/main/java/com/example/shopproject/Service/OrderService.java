package com.example.shopproject.Service;

import com.example.shopproject.Mapper.OrderMapper;
import com.example.shopproject.Model.DTO.Order.PostOrderDTO;
import com.example.shopproject.Model.Entity.Order.Order;
import com.example.shopproject.Repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository=orderRepository;
    }

    public void PostOrder(PostOrderDTO postOrderDTO){
        orderRepository.save(OrderMapper.convertToOrder(postOrderDTO));
    }

}
