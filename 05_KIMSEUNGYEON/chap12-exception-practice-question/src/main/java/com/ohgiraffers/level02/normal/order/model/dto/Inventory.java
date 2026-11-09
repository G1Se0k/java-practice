package com.ohgiraffers.level02.normal.order.model.dto;

import com.ohgiraffers.level02.normal.order.exception.OutOfStockException;

public class Inventory {

    private int stock;

    public Inventory(int stock) {
        this.stock = stock;
    }

    public void reduce(int quantity) throws OutOfStockException {
        System.out.println("2. 재고 확인");

        if(stock < quantity) {
            throw new OutOfStockException("재고가 부족합니다. 남은 재고 : " + stock);
        } else {
            System.out.println("3. 재고 차감");
            stock = stock-quantity;
        }
    }


}
