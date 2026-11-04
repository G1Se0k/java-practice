package com.ohgiraffers.level03.hard.fruit.model;

public class Fruit {

    private String name;    // 과일 이름

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
