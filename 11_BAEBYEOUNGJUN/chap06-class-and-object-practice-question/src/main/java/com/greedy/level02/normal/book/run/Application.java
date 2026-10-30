package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

import java.awt.print.Book;

public class Application {

    public static void main(String[] args) {

        BookDTO dto1 = new BookDTO();
        dto1.printInformation();
        BookDTO dto2 = new BookDTO("자바의 정석","도우출판","남궁성");
        dto2.printInformation();
        BookDTO dto3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        dto3.printInformation();
    }
}
