package com.ohgiraffers.level02.normal.number.model;

public class NumberBox<T extends Number> {
    private T first;
    private T second;

    public NumberBox(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public double sum(){
        return first.doubleValue() + second.doubleValue();
    }

    public boolean isFirstBigger(){
        return first.doubleValue() > second.doubleValue();
    }
}
