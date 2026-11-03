package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc;
    private BookManager bm;

    public BookMenu() {
        sc = new Scanner(System.in);
        bm = new BookManager();
    }

    public void menu() {

        while (true) {

            System.out.println();
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 번호 선택 : ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {

                case 1:
                    bm.addBook(inputBook());
                    break;

                case 2:
                    System.out.println("정렬방식을 선택해주세요.");
                    System.out.println("1. 오름차순");
                    System.out.println("2. 내림차순");
                    System.out.print("선택 : ");

                    int select = Integer.parseInt(sc.nextLine());

                    if (select != 1 && select != 2) {
                        System.out.println("번호를 잘못입력하였습니다.");
                        break;
                    }

                    ArrayList<BookDTO> sortedList
                            = bm.sortedBookList(select);

                    bm.printBookList(sortedList);
                    break;

                case 3:
                    System.out.print("삭제할 도서 번호 : ");
                    int bookNo = Integer.parseInt(sc.nextLine());

                    bm.deleteBook(bookNo);
                    break;

                case 4:
                    String title = inputBookTitle();

                    int index = bm.searchBook(title);

                    if (index == -1) {
                        System.out.println("조회한 도서가 존재하지 않음");
                    } else {
                        bm.printBook(index);
                    }

                    break;

                case 5:
                    bm.displayAll();
                    break;

                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("번호를 잘못입력하였습니다.");
            }
        }
    }

    public BookDTO inputBook() {
        // 임의값 생성
        int bookNo = (int) (Math.random() * 1000) + 1;

        System.out.print("도서 제목 : ");
        String title = sc.nextLine();

        System.out.print(
                "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : "
        );
        int category = Integer.parseInt(sc.nextLine());

        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(
                bookNo,
                category,
                title,
                author
        );
    }

    public String inputBookTitle() {

        System.out.print("도서 제목 : ");

        return sc.nextLine();
    }
}
