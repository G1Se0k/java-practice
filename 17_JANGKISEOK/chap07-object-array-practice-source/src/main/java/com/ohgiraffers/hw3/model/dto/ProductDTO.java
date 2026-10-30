package com.ohgiraffers.hw3.model.dto;

import com.ohgiraffers.hw3.controller.ProductController;

public class ProductDTO {
    private int pid;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO(){}
    public ProductDTO(int pid, String pName, int price, double tax) {
        this.pid = pid;
        this.pName = pName;
        this.price = price;
        this.tax = tax;

        ProductController.count++;
    }

    public String information(){
        return "ID : " + pid + ", " +
                "제품명 : " + pName + ", " +
                "가격 : " + price + "원, " +
                "세율 : " + (tax * 100) + "%";
    }
}
