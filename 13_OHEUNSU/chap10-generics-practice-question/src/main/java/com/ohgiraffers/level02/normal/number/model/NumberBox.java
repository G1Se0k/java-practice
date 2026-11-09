package com.ohgiraffers.level02.normal.number.model;

public class NumberBox<T extends Number> {

    private T first;
    private T second;

    public NumberBox(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public double sum(){
        double first = this.first.doubleValue();
        double second = this.second.doubleValue();
        return first + second;
    }

    public boolean isFirstBigger(){
        double first = this.first.doubleValue();
        double second = this.second.doubleValue();
        return first > second;
    }
}
