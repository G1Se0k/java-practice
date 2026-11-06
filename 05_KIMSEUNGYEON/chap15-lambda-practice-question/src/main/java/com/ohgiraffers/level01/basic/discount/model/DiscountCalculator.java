package com.ohgiraffers.level01.basic.discount.model;

@FunctionalInterface
public interface DiscountCalculator {

    int calculator(int price);
}
