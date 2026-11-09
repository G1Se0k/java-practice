package com.ohgiraffers.level03.hard.order.controller;

import com.ohgiraffers.level03.hard.order.model.dto.OrderDTO;
import com.ohgiraffers.level03.hard.order.model.dto.OrderItem;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderAnalyzer {

    private List<OrderDTO> orders;

    public OrderAnalyzer(List<OrderDTO> orders) {
        this.orders = orders;
    }

    public int totalQuantity() {
        return orders.stream()
                .flatMap(order -> order.getItems().stream())
                .mapToInt(OrderItem::getQuantity)
                .sum();
    }

    public int totalSales() {
        return orders.stream()
                .map(OrderDTO::getTotal)
                .reduce(0, Integer::sum);
    }

    public boolean hasBigOrder(int limit) {
        return orders.stream()
                .anyMatch(order -> order.getTotal() >= limit);
    }

    public boolean allHaveItems() {
        return orders.stream()
                .allMatch(order -> !order.getItems().isEmpty());
    }

    public String topCustomers(int n) {
        return orders.stream()
                .sorted(
                        Comparator.comparingInt(OrderDTO::getTotal)
                                .reversed()
                )
                .limit(n)
                .map(OrderDTO::getCustomer)
                .collect(Collectors.joining(", "));
    }
}