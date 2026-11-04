package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import java.util.ArrayList;

public class ResultPrinter {

    public void printAllList(ArrayList<BoardDTO> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("게시물이 없습니다.");
            return;
        }

        for (BoardDTO b : list) {
            System.out.println(b);
        }
    }

    public void printBoard(BoardDTO boardDTO) {
        System.out.println("게시글 번호 : " + boardDTO.getBoardNo());
        System.out.println("게시글 제목 : " + boardDTO.getBoardTitle());
        System.out.println("작성자 : " + boardDTO.getBoardWriter());
        System.out.println("작성 날짜 : " + boardDTO.getBoardDate());
        System.out.println("게시글 내용 : " + boardDTO.getBoardContent());
        System.out.println("조회수 : " + boardDTO.getReadCount());
    }

    public void errorPage(String msg) {
        switch (msg) {
            case "insertBoard":
                System.out.println("게시물 등록 실패!");
                break;

            case "selectOne":
                System.out.println("조회된 글이 없습니다.");
                break;

            case "updateTitle":
                System.out.println("게시물 제목 수정 실패!");
                break;

            case "updateContent":
                System.out.println("게시글 내용 수정 실패!");
                break;

            case "deleteBoard":
                System.out.println("게시글 삭제 실패!");
                break;
        }
    }

    public void successPage(String msg) {
        switch (msg) {
            case "insertBoard":
                System.out.println("게시글 등록 성공!");
                break;

            case "updateTitle":
                System.out.println("게시글 제목 수정 성공!");
                break;

            case "updateContent":
                System.out.println("게시글 내용 수정 성공!");
                break;

            case "deleteBoard":
                System.out.println("게시글 삭제 성공!");
                break;
        }
    }

    public void noSearchResult() {
        System.out.println("검색 결과가 없습니다.");
    }
}
