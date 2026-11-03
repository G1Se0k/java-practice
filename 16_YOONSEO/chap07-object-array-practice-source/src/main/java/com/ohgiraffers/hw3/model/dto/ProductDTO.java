package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {
    private int pID;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO() {
    }

    public ProductDTO(int pID, String pName, int price, double tax) {
        this.pID = pID;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public String information(){
        return "";
    }
}
