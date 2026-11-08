package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;

public class ResultPrinter {

    /// + printAllList
    /// (list:ArrayList<BoardDTO>):void
    /// 전달받은 객체안에 있는 값
    /// 출력
    /// 출력할내용이 없을 시에
    /// “게시물이 없습니다.”를 출력
    /// + printBoard(b:BoardDTO):void 전달받은 내용 출력
    /// + errorPage(msg:String):void 에러 메시지 출력
    /// (클래스 예시를 참조)
    /// + successPage(msg:String):void
    /// 성공 메시지 출력
    /// (클래스 예시를 참조)
    /// + noSearchResult():void 검색결과없을시 출력
    /// (“검색결과가 없습니다.”)

    public void printAllList(ArrayList<BoardDTO> list) {
        // list에 출력할 내용이 있으면 출력
        // list에 출력할 내용이 없으면 “게시물이 없습니다” 출력
        if (list != null) {
            list.stream().forEach(System.out::println);
        } else System.out.println("게시물이 없습니다");
    }

    public void printBoard(BoardDTO b) {
        // 전달받은 내용 출력
        System.out.println(b);
    }

    public void errorPage(String msg) {
//        전달받은 문자열에 따라서 실패내용 출력
//        insertBoard : 게시물 등록 실패
//        selectOne: “조회된 글이 없습니다.”
//        updateTitle:”게시물 제목 수정 실패!”
//        updateContent:”게시글 내용 수정 실패!”
//        deleteBoard:”게시글 삭제 실패!”

        switch (msg) {
            case "insertBoard":
                System.out.println("게시물 등록 실패");
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
//        전달받은 문자열에 따라서 실패내용 출력
//        insertBoard : “게시글 등록 성공!” 출력
//        updateTitle: “게시글 제목 수정 성공!” 출력
//        updateContent:”게시글 내용 수정 성공!” 출력
//        deleteBoard:”게시글 삭제 성공!” 출력
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
//      “검색 결과가 없습니다” 출력
        System.out.println("검색 결과가 없습니다");
    }


}
