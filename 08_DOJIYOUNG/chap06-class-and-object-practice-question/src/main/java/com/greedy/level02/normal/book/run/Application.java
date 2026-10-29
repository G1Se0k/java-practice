package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {

        BookDTO bookDTO1 = new BookDTO();
        bookDTO1.getInfo();

        BookDTO bookDTO2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        bookDTO2.getInfo();

        BookDTO bookDTO3 = new BookDTO("자바의 정석", "도우출판", "남궁성",5000000,0.5);
        bookDTO3.getInfo();

    }
}
