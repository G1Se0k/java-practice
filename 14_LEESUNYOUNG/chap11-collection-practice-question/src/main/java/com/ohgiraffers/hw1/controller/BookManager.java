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
    public void addBook(BookDTO book){
        bookList.add(book);
    }

    public void deleteBook(int index){
        bookList.remove(index);
    }

    public int searchBook(String bTitle){
        for(int i=0; i< bookList.size(); i++){
            if(bookList.get(i).getTitle().equals(bTitle)){
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index){
        if(index <0 || index > bookList.size()){
            System.out.println("조회한 도서가 존재하지 않음");
        }else{
            System.out.println(bookList.get(index));
        }
    }

    public void displayAll(){
        if(bookList.size()<=0 ){
            System.out.println("출력할 도서가 없습니다.");
        }else{
            printBookList(bookList);
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select){
        ArrayList<BookDTO> sorted = new ArrayList<>(bookList);
        if (select == 1){
            sorted.sort(new AscCategory());
        }else if (select == 2){
            sorted.sort(new DescCategory());
        }
        return sorted;
    }

    public void printBookList(ArrayList<BookDTO> br){
        for (BookDTO book: br ){
            System.out.println(book);
        }
    }
}
