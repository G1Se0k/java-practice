package com.ohgiraffers.level01.basic.box.model;

public class Box<T> {

    private T item;

    public void put(T item){
        this.item = item;
    }

    public T get(){
        return item;
    }
}
