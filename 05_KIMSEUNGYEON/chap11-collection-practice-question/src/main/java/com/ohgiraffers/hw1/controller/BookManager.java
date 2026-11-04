package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public void deleteBook(int index) {
        bookList.remove(index);
    }

    public int searchBook(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index) {
        System.out.println(bookList.get(index));
    }

    public void displayAll() {
        if(bookList.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
        } else {
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        ArrayList<BookDTO> sortedList = new ArrayList<>(bookList);

        if (select == 1) {
            sortedList.sort(new AscCategory());
        } else if (select == 2) {
            sortedList.sort(new DescCategory());
        }

        return sortedList;
    }

    public void printBookList(ArrayList<BookDTO> bookList) {

        for (BookDTO book : bookList) {
            System.out.println(book);
        }
    }
}
