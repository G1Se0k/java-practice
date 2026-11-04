package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.*;

import java.util.Scanner;

public class BoardMenu {

    private BoardManager bm;
    private InputBoard ib;
    Scanner sc = new Scanner(System.in);

    public BoardMenu () {
        bm = new BoardManager();
        ib = new InputBoard();
    }

    public void mainMenu() {
        int menu;

        do {
            System.out.println("*** 게시글 서비스 프로그램 ***");
            System.out.println("1. 게시글 쓰기");
            System.out.println("2. 게시글 전체보기");
            System.out.println("3. 게시글 1개보기");
            System.out.println("4. 게시글 제목 수정");
            System.out.println("5. 게시글 내용 수정");
            System.out.println("6. 게시글 삭제");
            System.out.println("7. 게시글 제목 검색");
            System.out.println("8. 정렬하기");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호 선택 : ");

            menu = Integer.parseInt(sc.nextLine());

            switch (menu) {

                case 1:
                    bm.insertBoard(ib.InputBoard());
                    break;

                case 2:
                    bm.selectAllList();
                    break;

                case 3:
                    bm.selectOneBoard(ib.InputBoardNo());
                    break;

                case 4:
                    bm.updateBoardTitle(
                            ib.InputBoardNo(),
                            ib.InputBoardTitle()
                    );
                    break;

                case 5:
                    bm.updateBoardContent(
                            ib.InputBoardNo(),
                            ib.InputBoardContent()
                    );
                    break;

                case 6:
                    bm.deleteBoard(ib.InputBoardNo());
                    break;

                case 7:
                    bm.searchBoard(ib.InputBoardTitle());
                    break;

                case 8:
                    sortSubMenu();
                    break;

                case 9:
                    System.out.println("프로그램이 종료되었습니다.");
                    break;

                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
                    break;
            }

        } while (menu != 9);
    }

    public void sortSubMenu() {
        int menu;

        do {
            System.out.println("***** 게시글 정렬 메뉴 *****");
            System.out.println("1. 글번호순 오름차순 정렬");
            System.out.println("2. 글번호순 내림차순 정렬");
            System.out.println("3. 작성날짜순 오름차순 정렬");
            System.out.println("4. 작성날짜순 내림차순 정렬");
            System.out.println("5. 글제목순 오름차순 정렬");
            System.out.println("6. 글제목순 내림차순 정렬");
            System.out.println("7. 메인 메뉴로 이동");
            System.out.print("메뉴 번호 선택 : ");

            menu = Integer.parseInt(sc.nextLine());

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
                    break;

                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
                    break;
            }

        } while (menu != 7);
    }

}
