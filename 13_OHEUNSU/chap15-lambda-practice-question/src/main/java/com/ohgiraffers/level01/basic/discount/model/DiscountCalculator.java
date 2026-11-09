package com.ohgiraffers.level01.basic.discount.model;
@FunctionalInterface
public interface DiscountCalculator {

    public int calculate(int price);
}
