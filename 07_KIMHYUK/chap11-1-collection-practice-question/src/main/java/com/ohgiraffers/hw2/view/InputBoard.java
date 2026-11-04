package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {

    private static final Scanner sc = new Scanner(System.in);


    public BoardDTO InputBoard() {
        System.out.println("게시글 제목을 입력하세요 : ");
        String title = InputBoardTitle();

        System.out.println("작성자를 입력하세요 : ");
        String writer = sc.nextLine();

        System.out.println("게시글 내용을 입력하세요. (exit 입력 시 종료)");

        String content = InputBoardContent();

        return new BoardDTO(0, title, writer, new Date(), content, 0);
    }

    public int InputBoardNo() {
        System.out.println("게시글 번호를 입력하세요 : ");
        return Integer.parseInt(sc.nextLine());
    }

    public String InputBoardTitle() {
        return sc.nextLine();
    }

    public String InputBoardContent() {

        StringBuilder content = new StringBuilder();

        while(true) {
            String line = sc.nextLine();

            if(line.equals("exit")) {
                break;
            }
            content.append(line).append("\n");
        }
        return content.toString();
    }
}
