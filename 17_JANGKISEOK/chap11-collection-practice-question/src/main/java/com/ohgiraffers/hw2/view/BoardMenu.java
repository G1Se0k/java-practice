package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.comparator.*;
import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Scanner;

public class BoardMenu {
    private final BoardManager bm;
    private final InputBoard ib;

    public BoardMenu() {
        bm = new BoardManager();
        ib = new InputBoard();
    }

    public void mainMenu(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. 게시글 쓰기");
            System.out.println("2. 게시글 전체 보기");
            System.out.println("3. 게시글 한개 보기");
            System.out.println("4. 게시글 제목 수정");
            System.out.println("5. 게시글 내용 수정");
            System.out.println("6. 게시글 삭제");
            System.out.println("7. 게시글 제목 검색");
            System.out.println("8. 정렬하기");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호 선택 : ");

            int input = sc.nextInt();
            sc.nextLine();

            switch (input){
                case 1:
                    BoardDTO newBoard = ib.inputBoard();
                    bm.insertBoard(newBoard);
                    break;
                case 2:
                    bm.selectAllList();
                    break;
                case 3: {
                    int num = ib.inputBoardNo();
                    bm.selectOneBoard(num);
                } break;
                case 4: {
                    int num = ib.inputBoardNo();
                    String title = ib.inputBoardTitle();
                    bm.updateBoardTitle(num, title);
                } break;
                case 5: {
                    int num = ib.inputBoardNo();
                    String content = ib.inputBoardContent();
                    bm.updateBoard(num,content);
                } break;
                case 6: {
                    int num = ib.inputBoardNo();
                    bm.deleteBoard(num);
                }break;
                case 7 : {
                    String title = ib.inputBoardTitle();
                    bm.searchBoard(title);
                } break;
                case 8:
                    sortSubMenu();
                    break;
                case 9:
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                default:
            }
        }
    }
    public void sortSubMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("***** 게시글 정렬 메뉴 *****");
        System.out.println("1. 글 번호순 오름차순 정렬");
        System.out.println("2. 글 번호순 내림차순 정렬");
        System.out.println("3. 작성 날짜순 오름차순 정렬");
        System.out.println("4. 작성 날짜순 내림차순 정렬");
        System.out.println("5. 글 제목순 오름차순 정렬");
        System.out.println("6. 글 제목순 내림차순 정렬");
        System.out.println("7. mainMenu()메소드로 이동");

        int input = sc.nextInt();
        sc.nextLine();

        switch(input){
            case 1: bm.sortList(new AscBoardNo()); break;
            case 2: bm.sortList(new DescBoardNo()); break;
            case 3: bm.sortList(new AscBoardDate()); break;
            case 4: bm.sortList(new DescBoardDate()); break;
            case 5: bm.sortList(new AscBoardTitle()); break;
            case 6: bm.sortList(new DescBoardTitle()); break;
            case 7:
            default: return;
        }
    }
}
