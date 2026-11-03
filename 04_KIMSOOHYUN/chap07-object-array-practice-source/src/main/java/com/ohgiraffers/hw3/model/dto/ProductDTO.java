package com.ohgiraffers.hw3.model.dto;

import com.ohgiraffers.hw3.controller.ProductController;

public class ProductDTO {

    private int pld;        // 제품 번호
    private String pName;   // 제품명
    private int price;      // 제품 가격
    private double tax;     // 제품 세금

    public ProductDTO() {}

    public ProductDTO(int pld, String pName, int price, double tax) {
        this.pld = pld;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public String information() {
        return " " + pld + "  \t" + pName + "\t" + price + "\t " + tax;
    }

    public int getPld() {
        return pld;
    }

    public void setPld(int pld) {
        this.pld = pld;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String Pname) {
        this.pName = Pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

}
