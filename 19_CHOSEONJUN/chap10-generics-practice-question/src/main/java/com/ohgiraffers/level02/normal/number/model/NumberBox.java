package com.ohgiraffers.level02.normal.number.model;

public class NumberBox<T extends Number> {

    private T first;   // 첫째 값
    private T second;   // 둘째 값


    public NumberBox(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public double sum() {
        double sum = first.doubleValue() + second.doubleValue();
        return sum;
    }

    //두 값을 double로 바꿔 비교하고, 첫째 값이 더 크면 true를 반환한다.
    public boolean isFirstBigger() {
        return (first.doubleValue() > second.doubleValue()) ? true : false;
    }

}
