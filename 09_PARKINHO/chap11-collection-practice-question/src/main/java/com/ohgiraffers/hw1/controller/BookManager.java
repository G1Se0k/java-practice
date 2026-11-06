package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
    }

    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public void deleteBook(int index) {
        for (int i = 0;i<bookList.size();i++) {
            if (bookList.get(i).getbNo() == index) {
                System.out.println(bookList.get(i).toString());
                bookList.remove(i);
                return;
            }
        }
        System.out.println("삭제할 도서가 존재하지 않습니다");

    }

    public int searchBook(String bTitle) {
        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getTitle().equals(bTitle)) {
                return i;
            }
        }
        System.out.println("조회한 도서가 존재하지 않습니다");
        return -1;
    }

    public void printBook(int index) {
        if(bookList.get(index) != null) {
            System.out.println(bookList.get(index).toString());
        } else {
            System.out.println("출력할 도서가 없습니다");
        }

    }

    public void displayAll() {
        for(int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).toString());
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        if(select == 1) {

            bookList.sort(new AscCategory());


        }
        return null;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO book : br) {
            System.out.println(book.toString());
        }

    }

}
