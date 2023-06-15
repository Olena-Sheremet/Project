package com.project.demo.controllers;

import org.springframework.ui.Model;
import com.project.demo.models.Order;
import com.project.demo.models.User;
import com.project.demo.servises.OrderService;
import com.project.demo.servises.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;
    private final UserService userService;

    public OrderController(OrderService orderService, UserService userService) {
        this.orderService = orderService;
        this.userService = userService;
    }

    @GetMapping
    public String getAllOrders(Model model) {
        List<Order> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "order-list";
    }

    @GetMapping("/{id}")
    public String getOrderById(@PathVariable Long id, Model model) {
        Order order = orderService.getOrderById(id);
        model.addAttribute("order", order);
        return "order-detail";
    }

    @GetMapping("/create")
    public String createOrderForm(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        model.addAttribute("order", new Order());
        return "order-form";
    }

    @PostMapping("/create")
    public String createOrder(Order order) {
        orderService.saveOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("/{id}/edit")
    public String editOrderForm(@PathVariable Long id, Model model) {
        Order order = orderService.getOrderById(id);
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        model.addAttribute("order", order);
        return "order-form";
    }

    @PostMapping("/{id}/edit")
    public String editOrder(@PathVariable Long id, Order updatedOrder) {
        Order order = orderService.getOrderById(id);
        order.setUser(updatedOrder.getUser());
        orderService.updateOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("/{id}/delete")
    public String deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return "redirect:/orders";
    }
}