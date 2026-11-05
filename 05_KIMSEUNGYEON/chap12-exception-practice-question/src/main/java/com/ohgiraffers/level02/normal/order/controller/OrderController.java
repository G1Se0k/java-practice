package com.ohgiraffers.level02.normal.order.controller;

import com.ohgiraffers.level02.normal.order.exception.OutOfStockException;
import com.ohgiraffers.level02.normal.order.model.dto.Inventory;

public class OrderController {

    private Inventory inventory;

    public OrderController(Inventory inventory) {
        this.inventory = inventory;
    }

    public void placeOrder(int quantity) throws OutOfStockException {
        System.out.println("1. 주문 접수");
        inventory.reduce(quantity);
    }
}
