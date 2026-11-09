package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {

    public BoardDTO inputBoard(){
        Scanner sc = new Scanner(System.in);

        int boardNo = 0;
        System.out.print("글제목: ");
        String boardTitle = sc.nextLine();
        System.out.print("작성자: ");
        String boardWriter = sc.nextLine();
        Date boardDate = new Date();
        System.out.print("글내용(exit입력시 종료): ");
        String boardContent = "";
        String str = sc.nextLine();
        while (!str.equals("exit")){
            boardContent += str + "\n";
            str = sc.nextLine();
        }
        int readCount = 0;
        return new BoardDTO(boardNo, boardTitle, boardWriter, boardDate, boardContent, readCount);
    }

    public int inputBoardNo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("글번호: ");
        int boardNo = sc.nextInt();
        sc.nextLine();
        return boardNo;
    }

    public String inputBoardTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("글제목: ");
        return sc.nextLine();
    }

    public String inputBoardContent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("글내용: ");
        return sc.nextLine();
    }
}
