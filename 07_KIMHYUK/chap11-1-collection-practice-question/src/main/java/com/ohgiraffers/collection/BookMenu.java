package com.ohgiraffers.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void menu() {
        int menu = 0;
        do {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 번호 선택 : ");

            menu = sc.nextInt();

            if (menu == 1) {
                bm.addBook(inputBook());
            } else if (menu == 2) {
                System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순) : ");
                int select = sc.nextInt();
                if (select == 1 || select == 2) {
                    bm.printBookList(bm.sortedBookList(select));
                } else {
                    System.out.println("번호를 잘못 입력하셨습니다.");
                }
            } else if (menu == 3) {
                System.out.print("삭제할 도서 번호 : ");
                int index = sc.nextInt();
                bm.deleteBook(index);
            } else if (menu == 4) {
                bm.printBook(bm.searchBook(inputBookTitle()));
            } else if (menu == 5) {
                bm.displayAll();
            } else if (menu == 6) {
                System.out.println("프로그램을 종료합니다.");
            } else {
                System.out.println("잘못된 번호입니다.");
            }
        } while (!(menu == 6));
    }

    public BookDTO inputBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.println("책제목 : ");
        String title = sc.nextLine();
        System.out.print("도서 저자 : ");
        String author = sc.nextLine();
        return new BookDTO(bNo,category,title,author);
    }

    public String inputBookTitle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("확인할 도서명을 입력해주세요.");
        System.out.print("책제목 : ");
        return sc.nextLine();
    }
}
