package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();
    String menu = """
            *** 도서 관리 프로그램 ***
            1. 새 도서 추가
            2. 도서정보 정렬 후 출력
            3. 도서 삭제
            4. 도서 검색출력
            5. 전체 출력
            6. 끝내기
            """;

    public void menu() {
        ///*** 도서 관리 프로그램 ***
        /// 1. 새 도서 추가 // addBook (inputBook()이 리턴한 객체) 실행

        /// 2. 도서정보 정렬 후 출력 // sortedBookList(정렬종류번호) 실행
        /// =>입력받은 매개변수를 이용하여 정렬방식에 따라 출력
        /// 정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순)
        /// 1,2 이외의 값을 입력했을 시에는 “번호를 잘못입력하였습니다”를 출력
        /// => ArrayList<BookDTO> 리턴 받아 printBookList(ArrayList<BookDTO>) 실행

        /// 3. 도서 삭제 // deleteBook (도서 번호) 실행

        /// 4. 도서 검색출력 // searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
        /// => index 리턴 받아 -1일 경우 “조회한 도서가 존재하지 않음”
        /// -1이 아닐 경우 printBook(index) 출력

        /// 5. 전체 출력 // displayAll() 실행
        /// => 결과 리스트 리턴 받아 비어있을 경우 “출력할 도서가 없습니다.”
        /// 아닌 경우는 전체 출력

        /// 6. 끝내기 // main()으로 리턴
        /// 메뉴 번호 선택 : >> 입력 받음

        /// // 메뉴 화면 반복 실행 처리
        /// // 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행
        int input;

        do {
            System.out.print(menu);
            System.out.print("\n번호 입력해주세요.");
            input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순)");
                    int select = sc.nextInt();
                    if (select == 1 || select == 2) {
                        ArrayList<BookDTO> list = bm.sortedBookList(select);
                        bm.printBookList(list);
                    } else
                        System.out.println("번호를 잘못입력하였습니다");
                    break;
                case 3:
                    System.out.print("삭제할 도서 리스트 인덱스 입력: ");
                    int delete = sc.nextInt();
                    bm.deleteBook(delete);
                    break;
                case 4:
                    bm.printBook(bm.searchBook(inputBookTitle()));
                    break;
                case 5:
                    System.out.println("전체 출력");
                    bm.displayAll();
                    break;
                case 6:
                    System.out.println("프로램을 종료합니다. ");
                    break;
                default:
                    System.out.println("번호를 잘못입력하였습니다 ");

            }
        } while (input != 6);


//// 메뉴 화면 반복 실행 처리
//// 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행

    }

    public BookDTO inputBook() {
        // 도서 번호 : >> 임의 값 입
        // "도서 제목 : " >> 입력 받음
        // "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : " >> 입력 받음 (숫자로)
        // "도서 저자 : " >> 입력 받음
        // 매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO객체 리턴

        int bNo;  // 도서 번호
        int category;  // 도서분류코드
        String title;  // 도서 제목
        String author;  // 도서 저자

        System.out.print("도서 번호: ");
        bNo = sc.nextInt();
        System.out.print("도서분류코드: ");
        category = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 제목: ");
        title = sc.nextLine();
        System.out.print("도서 저자: ");
        author = sc.nextLine();

        return new BookDTO(bNo, category, title, author);
    }

    public String inputBookTitle() {
    // “도서 제목 : “ >> 입력 받음 >> 리턴
        System.out.print("도서 타이틀 검색: ");
        String title = sc.nextLine();
        return title;
    }

}
