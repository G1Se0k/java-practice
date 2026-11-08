package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {

    Scanner sc = new Scanner(System.in);

    public BoardDTO inputBoard() {
        // 게시글 등록
        // 글제목,작성자,글 내용(exit입력시 종료)는 각각 입력받기
        // 날짜는 따로 입력받지않고 현재날짜로 등록

        int boardNo;   ///  글번호
        String boardTtile;  /// 게시글 제목
        String boardWriter; /// 작성자
        Date boardDate;     /// 게시 날짜
        String boardContent;    /// 게시글 내용
        int readCount;      /// 게시글 조회수
        System.out.print("글번호: ");
        boardNo = sc.nextInt();
        sc.nextLine();
        System.out.print("게시글 제목: ");
        boardTtile = sc.nextLine();
        System.out.print("작성자: ");
        boardWriter = sc.nextLine();
        boardDate = new Date();
        System.out.print("게시글 내용: ");
        boardContent = sc.nextLine();
        readCount = 0;
        System.out.println("입력이 완료 됐습니다.");
        return new BoardDTO(boardWriter, boardNo, boardTtile, boardDate, boardContent, readCount);

    }

    public int inputBoardNo() {
//        게시번호 을 입력받아서 리턴
        System.out.print("게시글 번호: ");
        return sc.nextInt();
    }


    public String inputBoardTitle() {
//        게시글 제목 을 입력받아서 리턴
        sc.nextLine();
        System.out.print("게시글 제목: ");
        return sc.nextLine();
    }

    public String inputBoardContent() {
//        내용을 입력받아서 리턴
        sc.nextLine();
        System.out.print("내용입력: ");
        return sc.nextLine();
    }

}
