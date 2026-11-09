package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    {
        bookList = new ArrayList<BookDTO>();
    }

    public BookManager() {

    }

    public void addBook(BookDTO book){
        bookList.add(book);
    }

    public void deleteBook(int index){
        bookList.remove(index);
    }

    public int searchBook(String bTitle){
        int index;
        for(index = 0; index < bookList.size(); index++){
            if(bTitle.equals(bookList.get(index).getTitle())) break;
        }
        if(index == bookList.size()) return -1;
        else return index;
    }

    public void printBook(int index){
        if(index < bookList.size()) System.out.println(bookList.get(index));
        else System.out.println("조회한 도서가 존재하지 않음");
    }

    public void displayAll(){
        if(bookList.isEmpty()) System.out.println("출력할 도서가 없습니다");
        else System.out.println(bookList);
    }

    public ArrayList<BookDTO> sortedBookList(int select){
        if(select == 1) {
            bookList.sort(new AscCategory());
            return bookList;
        }
        else {
            bookList.sort(new DescCategory());
            return bookList;
        }
    }

    public void printBookList(ArrayList<BookDTO> br){
        for(BookDTO book: br){
            System.out.println(book);
        }
    }
}
