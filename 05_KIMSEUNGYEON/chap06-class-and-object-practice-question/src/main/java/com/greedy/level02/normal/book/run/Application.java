package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {

    public static void main(String[] args) {
        //기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO book = new BookDTO();
        printBookInfo(book);

        //필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        book = new BookDTO("자바의 정석", "도우출판", "남궁성");
        printBookInfo(book);

        //모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        book = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        printBookInfo(book);

    }

    public static void printBookInfo(BookDTO book) {
        System.out.println(book.getTitle() + ", " +book.getPublisher() + ", " +book.getAuthor() + ", " +book.getPrice() + ", " +book.getDiscountRate());
    }
}
