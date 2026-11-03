package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {
    private int pid;            // 제품 번호
    private String pName;       // 제품명
    private int price;          // 제품 가격
    private double tax;         // 제품 세금

    public ProductDTO() {
    }

    public ProductDTO(int pid, String pName, int price, double tax) {
        this.pid = pid;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
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

    public String information() {
        return "";
    }
}
