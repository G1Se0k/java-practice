package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.time.LocalDate;
import java.util.Scanner;

public class InputBoard {

    Scanner sc = new Scanner(System.in);

    public BoardDTO inputBoard(){
        // 게시글 등록

        System.out.println("===== 게시글 등록 =====");

        // 글제목,작성자,글 내용(exit입력시 종료)는 각각 입력받기
        System.out.print("글 제목 : ");
        String title = sc.nextLine();

        System.out.print("작성자 : ");
        String writer = sc.nextLine();

        String content = inputBoardContent();

        // 날짜는 따로 입력받지않고 현재날짜로 등록
        LocalDate date = LocalDate.now();

        return new BoardDTO(
                0,
                title,
                writer,
                date,
                content,
                0
        );

    }

    public int inputBoardNo() {

        System.out.print("글 번호 : ");

        return Integer.parseInt(sc.nextLine());
    }

    public String inputBoardTitle() {

        System.out.print("글 제목 : ");

        return sc.nextLine();
    }

    public String inputBoardContent() {

        System.out.print("글 내용 : ");
        System.out.println("작성을 끝내려면 exit를 입력하세요.");
        StringBuilder content = new StringBuilder();

        while (true) {

            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }

            content.append(input).append("\n");
        }
        return content.toString();
    }
}
