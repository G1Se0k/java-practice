package com.ohgiraffers.level03.hard.order.model.dto;

import java.util.List;

public class OrderDTO {

    private int orderNo;
    private String customer;
    private List<OrderItem> items;

    public OrderDTO(int orderNo, String customer, List<OrderItem> items) {
        this.orderNo = orderNo;
        this.customer = customer;
        this.items = items;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public String getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public int getTotal() {
        return items.stream().mapToInt(OrderItem::getAmount).sum();
    }
}
