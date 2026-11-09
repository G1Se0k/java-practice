package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class InputBoard {
    public BoardDTO inputBoard(){
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int id = rand.nextInt(0, Integer.MAX_VALUE);

        String title = inputBoardTitle();
        System.out.print("작성자 : ");
        String writer = sc.next();

        String content = inputBoardContent();

        return new BoardDTO(id, title, writer, new Date(), content, 0);
    }

    public int inputBoardNo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("글 번호를 입력하세요 : ");

        int input = sc.nextInt();
        sc.nextLine();
        return input;
    }

    public String inputBoardTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("글 제목을 입력하세요 : ");

        return sc.nextLine();
    }

    public String inputBoardContent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================== 글 내용 (exit 입력으로 종료) ==================");
        String content = "";
        StringBuilder sb = new StringBuilder();
        while (true){
            content = sc.nextLine();
            if (content.equals("exit")) break;
            sb.append(content);
            sb.append("\n");
        }

        return sb.toString();
    }
}
