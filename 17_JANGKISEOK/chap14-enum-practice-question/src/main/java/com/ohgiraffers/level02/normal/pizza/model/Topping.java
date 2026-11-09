package com.ohgiraffers.level02.normal.pizza.model;

public enum Topping {
    CHEESE      ("치즈", 2000),
    BACON       ("베이컨", 3000),
    OLIVE       ("올리브", 1000),
    MUSHROOM    ("버섯", 1500),
    PINEAPPLE   ("파인애플", 2500);

    private String label;
    private int price;

    Topping(String label, int price) {
        this.label = label;
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public int getPrice() {
        return price;
    }
}
