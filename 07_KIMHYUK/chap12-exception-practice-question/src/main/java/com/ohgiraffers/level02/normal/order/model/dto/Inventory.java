package com.ohgiraffers.level02.normal.order.model.dto;

import com.ohgiraffers.level02.normal.order.exception.OutOfStockException;

public class Inventory {

    private int stock;

    public Inventory(int stock) {
        this.stock = stock;
    }

    public void reduce(int qty) throws OutOfStockException {

        if (qty > stock) {
            throw new OutOfStockException("재고가 부족합니다. 남은 재고 : " + stock + "개");
        }

        stock -= qty;
    }
}
