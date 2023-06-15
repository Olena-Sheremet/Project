package com.project.demo.servises;


import com.project.demo.repositories.OrderRepository;
import jakarta.persistence.criteria.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<com.project.demo.models.Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public com.project.demo.models.Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public void saveOrder(com.project.demo.models.Order order) {
        orderRepository.save(order);
    }

    @Override
    public void updateOrder(com.project.demo.models.Order order) {
        orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}