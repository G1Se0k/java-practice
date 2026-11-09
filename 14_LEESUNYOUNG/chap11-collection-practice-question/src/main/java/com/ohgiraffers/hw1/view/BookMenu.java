package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {
    private Scanner sc;
    private BookManager bm;

    public BookMenu() {
        sc = new Scanner(System.in);
        bm = new BookManager();
    }

    public void menu() {
        int choice;

        do {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 번호 선택 : ");

            choice = sc.nextInt();

            switch (choice){
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    System.out.println("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순 ");
                    int select = sc.nextInt();
                    if (select == 1 || select == 2){
                        bm.printBookList(bm.sortedBookList(select));
                    }else{
                        System.out.println("번호를 잘못입력하였습니다");
                    }
                    break;
                case 3:
                    System.out.print("삭제할 도서 인덱스 : ");
                    int deleteIndex = sc.nextInt();
                    bm.deleteBook(deleteIndex);
                    break;
                case 4:
                    int searchIndex = bm.searchBook(inputBookTitle());
                    if (searchIndex == -1) {
                        System.out.println("조회한 도서가 존재하지 않음");
                    } else {
                        bm.printBook(searchIndex);
                    }
                    break;
                case 5:
                    bm.displayAll();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("번호를 잘못입력하였습니다.");

            }
            // 여기서 switch로 번호별 기능 연결
        } while (choice != 6);


    }

    public BookDTO inputBook(){
        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();
        sc.nextLine(); // 숫자 뒤에 남은 줄바꿈 처리

        System.out.print("도서 제목 : ");
        String title = sc.nextLine();

        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine(); // 다음 문자열 입력을 위해 줄바꿈 처리

        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(bNo, category, title, author);

    }

    public String inputBookTitle(){
        sc.nextLine();
        System.out.println("도서 제목 : ");
        return sc.nextLine();
    }
}
