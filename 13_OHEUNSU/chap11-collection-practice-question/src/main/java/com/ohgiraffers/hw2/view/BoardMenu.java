package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.*;

import java.util.Scanner;

public class BoardMenu {

    private BoardManager bm;
    private InputBoard ib;

    {
        bm = new BoardManager();
        ib = new InputBoard();
    }

    public void mainMenu(){
        String menu = """
                *** 게시글 서비스 프로그램 ***
                1. 게시글 쓰기
                2. 게시글 전체 보기
                3. 게시글 한 개 보기
                4. 게시글 제목 수정
                5. 게시글 내용 수정
                6. 게시글 삭제
                7. 게시글 제목 검색
                8. 정렬하기
                9. 끝내기
                """;
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while(input != 9){
            System.out.println(menu);
            System.out.print("원하는 메뉴 번호를 입력해주세요.");
            input = sc.nextInt();
            sc.nextLine();
            switch (input){
                case 1: bm.insertBoard(ib.inputBoard()); break;
                case 2: bm.selectAllList(); break;
                case 3: bm.selectOneBoard(ib.inputBoardNo()); break;
                case 4: bm.updateBoardTitle(ib.inputBoardNo(), ib.inputBoardTitle()); break;
                case 5: bm.updateBoardContent(ib.inputBoardNo(), ib.inputBoardContent()); break;
                case 6: bm.deleteBoard(ib.inputBoardNo()); break;
                case 7: bm.searchBoard(ib.inputBoardTitle()); break;
                case 8: this.sortSubMenu(); break;
                case 9: {
                    System.out.println("프로그램이 종료되었습니다.");
                    break;
                }
                default: {
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요");
                }
            }
        }
    }

    public void sortSubMenu(){
        String menu = """
                ***** 게시글 정렬 메뉴 *****
                1. 글번호순 오름차순 정렬
                2. 글번호순 내림차순 정렬
                3. 작성날짜순 오름차순 정렬
                4. 작성날짜순 내림차순 정렬
                5. 글제목순 오름차순 정렬
                6. 글제목순 내림차순 정렬
                7. mainMenu()메소드로 이동
                """;

        Scanner sc = new Scanner(System.in);
        int input = 0;
        while(input < 1 || input > 7){
            System.out.println(menu);
            System.out.print("원하는 정렬 옵션의 번호를 입력해주세요.");
            input = sc.nextInt();
            sc.nextLine();
            switch (input){
                case 1: bm.sortList(new AscBoardNo()); break;
                case 2: bm.sortList(new DescBoardNo()); break;
                case 3: bm.sortList(new AscBoardDate()); break;
                case 4: bm.sortList(new DescBoardDate()); break;
                case 5: bm.sortList(new AscBoardTitle()); break;
                case 6: bm.sortList(new DescBoardTitle()); break;
                case 7: break;
                default:{
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요");
                }
            }
        }

    }
}
