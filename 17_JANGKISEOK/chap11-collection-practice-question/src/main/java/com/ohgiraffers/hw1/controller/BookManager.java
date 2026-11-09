package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {
    private final ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();

        /* 디버깅용 */
        bookList.add(new BookDTO(1,3,"test1","test1"));
        bookList.add(new BookDTO(2,1,"test2","test2"));
        bookList.add(new BookDTO(3,2,"test3","test3"));
    }

    public void addBook(BookDTO book){
        bookList.add(book);
    }
    public void deleteBook(int index){
        //bookList.remove(index);
        for(BookDTO b : bookList){
            if (b.getBNo() == index){
                bookList.remove(b);
                return;
            }
        }
    }
    public int searchBook(String bTitle){
        for(BookDTO b : bookList){
            if (b.getTitle().equals(bTitle)){
                return bookList.indexOf(b);
            }
        }
        return -1;
    }
    public void printBook(int index){
        BookDTO book = bookList.get(index);
        if(book == null) System.out.println("조회한 도서가 존재하지 않음");
        else System.out.println(book);
    }
    public void displayAll(){
        if(bookList.isEmpty()){
            System.out.println("출력할 도서가 없습니다.");
            return;
        }
        for(BookDTO b : bookList){
            System.out.println(b);
        }
    }
    public ArrayList<BookDTO> sortedBookList(int select){
        ArrayList<BookDTO> result = new ArrayList<>(bookList);
        switch (select){
            case 1:
                result.sort(new AscCategory());
                break;
            case 2:
                result.sort(new DescCategory());
                break;
        }
        return result;
    }
    public void printBookList(ArrayList<BookDTO> br){
        for(BookDTO b : br){
            System.out.println(b);
        }
    }
}
