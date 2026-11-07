package com.ohgiraffers.level03.hard.stay.model.dto;

public class StayDTO {

    private String name;
    private String region;
    private int price;
    private int rating;

    public StayDTO(String name, String region, int price, int rating) {
        this.name = name;
        this.region = region;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "(" + region + ") " + price + "원 별점 " + rating;
    }
}
