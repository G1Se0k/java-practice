package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.*;

import java.util.Scanner;

public class BoardMenu {

    private BoardManager bm;
    private InputBoard ib;
    private Scanner sc;

    public BoardMenu() {

        bm = new BoardManager();
        ib = new InputBoard();
        sc = new Scanner(System.in);
    }

    public void mainMenu() {
        //*** 게시글 서비스 프로그램 ***
        //  1. 게시글 쓰기 // insertBoard(inputBoard()이 리턴한 객체) 실행
        //  2. 게시글 전체보기 // selectAllList() 실행
        //  3. 게시글 한 개보기 // selectOneBoard(inputBoardNo()) 실행
        //  4. 게시글 제목 수정 // updateBoardTitle(inputBoardNo(),inputBoardTitle()) 실행
        //  5. 게시글 내용 수정 // updateBoardContent(inputBoardNo(),inputBoardContent()) 실행
        //  6. 게시글 삭제 // deleteBoard(inputBoardNo()) 실행
        //  7. 게시글 제목 검색 // searchBoard(inputBoardTitle()) 실행
        //  8, 정렬하기 // sortSubMenu() 실행
        //  9. 끝내기 // “프로그램이 종료되었습니다.” 출력
        //  메뉴 번호 선택 : >> 입력 받음
        //  메뉴 화면 반복 실행 처리
        //  해당 메뉴 번호에 따라 BoardManager 클래스 메소드 실행
        while (true) {

            System.out.println();
            System.out.println("*** 게시글 서비스 프로그램 ***");
            System.out.println("1. 게시글 쓰기");
            System.out.println("2. 게시글 전체보기");
            System.out.println("3. 게시글 한 개보기");
            System.out.println("4. 게시글 제목 수정");
            System.out.println("5. 게시글 내용 수정");
            System.out.println("6. 게시글 삭제");
            System.out.println("7. 게시글 제목 검색");
            System.out.println("8. 정렬하기");
            System.out.println("9. 끝내기");

            System.out.print("메뉴 번호 선택 : ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {

                case 1:
                    bm.insertBoard(ib.inputBoard());
                    break;

                case 2:
                    bm.selectAllList();
                    break;

                case 3:
                    bm.selectOneBoard(ib.inputBoardNo());
                    break;

                case 4:
                    bm.updateBoardTitle(ib.inputBoardNo(), ib.inputBoardTitle());
                    break;

                case 5:
                    bm.updateBoardContent(ib.inputBoardNo(), ib.inputBoardContent());
                    break;

                case 6:
                    bm.deleteBoard(ib.inputBoardNo());
                    break;

                case 7:
                    bm.searchBoard(ib.inputBoardTitle());
                    break;

                case 8:
                    sortSubMenu();
                    break;

                case 9:
                    System.out.println("프로그램이 종료되었습니다.");
                    return;

                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
            }
        }
    }

    public void sortSubMenu(){
        // ***** 게시글 정렬 메뉴 *****
        //  1. 글번호순 오름차순 정렬 // sortList(AscBoardNo())
        //  2. 글번호순 내림차순 정렬 // sortList(DescBoardNo())
        //  3. 작성날짜순 오름차순 정렬 // sortList(AscBoardDate())
        //  4. 작성날짜순 내림차순 정렬// sortList(DescBoardDate())
        //  5. 글제목순 오름차순 정렬 // sortList(AscBoardTitle())
        //  6. 글제목순 내림차순 정렬 // sortList(DescBoardTitle())
        //  7. mainMenu()메소드로 이동
        //  메뉴번호를 입력받아 선택한 후에 출력
        while (true) {

            System.out.println();
            System.out.println("***** 게시글 정렬 메뉴 *****");
            System.out.println("1. 글번호순 오름차순 정렬");
            System.out.println("2. 글번호순 내림차순 정렬");
            System.out.println("3. 작성날짜순 오름차순 정렬");
            System.out.println("4. 작성날짜순 내림차순 정렬");
            System.out.println("5. 글제목순 오름차순 정렬");
            System.out.println("6. 글제목순 내림차순 정렬");
            System.out.println("7. 메인메뉴로 이동");
            System.out.print("메뉴 번호 선택 : ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {

                case 1:
                    bm.sortList(new AscBoardNo());
                    break;

                case 2:
                    bm.sortList(new DescBoardNo());
                    break;

                case 3:
                    bm.sortList(new AscBoardDate());
                    break;

                case 4:
                    bm.sortList(new DescBoardDate());
                    break;

                case 5:
                    bm.sortList(new AscBoardTitle());
                    break;

                case 6:
                    bm.sortList(new DescBoardTitle());
                    break;

                case 7:
                    return;

                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
            }
        }
    }
}
