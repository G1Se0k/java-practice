package com.ohgiraffers.level03.hard.inventory.model.dto;

public class ItemDTO implements Comparable<ItemDTO> {

    private String code;
    private String name;
    private String category;
    private int price;
    private int quantity;

    public ItemDTO(String code, String name, String category, int price, int quantity) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int compareTo(ItemDTO o) {
        return this.code.compareTo(o.code);
    }

    @Override
    public String toString() {
        return code + " " + name + " (" + category + ") " + price + "원, 재고 " + quantity + "개";
    }
}
