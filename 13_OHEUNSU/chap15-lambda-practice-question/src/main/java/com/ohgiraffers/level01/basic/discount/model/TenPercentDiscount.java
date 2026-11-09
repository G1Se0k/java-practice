package com.ohgiraffers.level01.basic.discount.model;

public class TenPercentDiscount implements DiscountCalculator{

    @Override
    public int calculate(int price) {
        return (price * 90) / 100;
    }
}
