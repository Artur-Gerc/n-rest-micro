package ru.micro.ordermicro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.micro.entity.model.Order;
import ru.micro.ordermicro.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/by-user/{user}")
    public List<Order> getOrdersByUser(@PathVariable("user") Long userId) {
        return orderService.getOrdersByUserId(userId);
    }

}
