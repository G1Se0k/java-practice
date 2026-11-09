package com.ohgiraffers.level03.hard.fruit.model;

public class Box<T> {

    private T item; // 담은 값

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

}
