package com.greedy.level02.normal.book.model.dto;

public class BookDTO {

    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookDTO() {
    }

    public BookDTO(String a, String b, String c) {
        this.title = a;
        this.publisher = b;
        this.author = c;
    }

    public BookDTO(String a, String b, String c, int d, double e) {
        this.title = a;
        this.publisher = b;
        this.author = c;
        this.price = d;
        this.discountRate = e;
    }

    public void printInformation() {
        System.out.print(title+", ");
        System.out.print(publisher+", ");
        System.out.print(author+", ");
        System.out.print(price+", ");
        System.out.println(discountRate);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
