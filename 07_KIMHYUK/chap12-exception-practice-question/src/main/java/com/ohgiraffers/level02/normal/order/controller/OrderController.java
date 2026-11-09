package com.ohgiraffers.level02.normal.order.controller;

import com.ohgiraffers.level02.normal.order.exception.OutOfStockException;
import com.ohgiraffers.level02.normal.order.model.dto.Inventory;

public class OrderController {

    private Inventory inventory;

    public OrderController(Inventory inventory) {
        this.inventory = inventory;
    }

    public void placeOrder(int qty) {

        try {
            System.out.println("1. 주문 접수");
            System.out.println("2. 재고 확인");

            inventory.reduce(qty);

            System.out.println("3. 재고 차감");
            System.out.println("주문 성공");
        } catch (OutOfStockException e) {
            System.out.println("주문 실패 : " + e.getMessage());
        } finally {
            System.out.println("주문 처리 끝");
        }
    }
}
