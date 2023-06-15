package com.project.demo.servises;

import jakarta.persistence.criteria.Order;

import java.util.List;

public interface OrderService {
    List<com.project.demo.models.Order> getAllOrders();
    com.project.demo.models.Order getOrderById(Long id);
    void saveOrder(com.project.demo.models.Order order);
    void updateOrder(com.project.demo.models.Order order);
    void deleteOrder(Long id);


}
