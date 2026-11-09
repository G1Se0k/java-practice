package com.ohgiraffers.level01.basic.discount.model;

public class TenPercentDiscount implements DiscountCalculator{

    @Override
    public int calculator(int price) {
        return price - ((price*10)/100);
    }
}
