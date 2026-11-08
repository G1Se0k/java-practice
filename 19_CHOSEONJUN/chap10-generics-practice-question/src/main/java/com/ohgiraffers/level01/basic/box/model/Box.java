package com.ohgiraffers.level01.basic.box.model;

public class Box<T> {
    private T item;

    public void put(T input) {
        item = input;
    }

    public T getItem() {
        return item;
    }

}
