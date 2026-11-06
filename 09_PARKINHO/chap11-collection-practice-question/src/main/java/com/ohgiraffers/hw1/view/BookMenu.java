package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void menu() {

        System.out.print("""
                ==== 도서 관리 프로그램 ====
                1. 새 도서 추가
                2. 도서 정보 정렬 후 출력
                3. 도서 삭제
                4. 도서 검색 출력
                5. 전체 도서 출력
                6. 끝내기
                =========================
                메뉴 번호 선택 :
                """);
        switch (sc.nextInt()) {
            case 1:
                bm.addBook(inputBook());
                break;
            case 2:
                System.out.print("정렬방식을 선택해주세요(1. 오름차순, 2. 내림차순) : ");
                bm.sortedBookList(sc.nextInt());
                break;
            case 3:
                System.out.print("삭제할 도서번호를 입력하세요 : ");
        }


        bm.addBook(inputBook());
        System.out.print("");
        bm.sortedBookList()


    }

    public BookDTO inputBook() {
        BookDTO book = new BookDTO();

        System.out.print("추가하실 도서의 번호를 입력하세요 : ");
        book.setbNo(sc.nextInt());
        System.out.print("추가하실 도서의 제목을 입력하세요 : ");
        book.setTitle(inputBookTitle());
        System.out.print("추가하실 도서의 장르를 입력하세요(1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        boolean state = true;
        while (state) {
            switch (sc.nextInt()) {
                case 1:
                case 2:
                case 3:
                case 4:
                    book.setCategory(sc.nextInt());
                    state = false;
                    break;
                default:
                    System.out.println("장르를 다시 입력해 주세요");
            }
        }
        System.out.print("추가하실 도서의 저자를 입력하세요 : ");
        book.setAuthor(sc.next());
        System.out.println("=============도서를 추가했습니다=============");
        return book;
    }

    public String inputBookTitle() {
        return sc.next();
    }
}
