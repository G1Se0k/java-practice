package com.ohgiraffers.level03.hard.order.controller;

import com.ohgiraffers.level03.hard.order.model.dto.OrderDTO;
import com.ohgiraffers.level03.hard.order.model.dto.OrderItem;

import java.util.List;

public class OrderAnalyzer {

    private List<OrderDTO> orders;

    public OrderAnalyzer(List<OrderDTO> orders) {
        this.orders = orders;
    }

    public int totalQuantity() {
        return orders.stream().flatMapToInt(order->order.getItems().stream().mapToInt(OrderItem::getQuantity)).sum();
    }

    public int totalSales() {
        return orders.stream().mapToInt(OrderDTO::getTotal).reduce(Integer::sum).getAsInt();
    }

    public boolean hasBigOrder(int limit) {
        return orders.stream().mapToInt(OrderDTO::getTotal).anyMatch(i->i>=limit);
    }

    public boolean allHaveItems() {
        return orders.stream().noneMatch(order->order.getItems().isEmpty());
    }

    public String topCustomers(int n) {
        return String.join(", ", orders.stream().sorted((o1, o2)->o2.getTotal() - o1.getTotal()).map(OrderDTO::getCustomer).toList().subList(0, n));
    }
}
