package com.ohgiraffers.collection;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<BookDTO>();
    }

    public void addBook (BookDTO book) {
        bookList.add(book);
    }

    public void deleteBook (int index) {
        bookList.remove(index);
    }

    public int searchBook (String bTitle) {
        int result = -1;

        for(int i = 0; i < bookList.size(); i++) {
            result = i;
            break;
        }
        return result;
    }

    public void printBook (int index) {
        if (index < 0 || index >= bookList.size()) {
            System.out.println("조회한 도서가 존재하지 않음");
        } else {
            System.out.println(bookList.get(index));
        }
    }

    public void displayAll() {
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
        } else {
            printBookList(bookList);
        }
    }

    public ArrayList<BookDTO> sortedBookList (int select) {
        if (select == 1) {
            bookList.sort(new AscCategory());
        } else {
            bookList.sort(new DescCategory());
        }
        return bookList;
    }

    public void printBookList (ArrayList<BookDTO> br) {
        for (BookDTO b : br) {
            System.out.println(b);
        }
    }



}
