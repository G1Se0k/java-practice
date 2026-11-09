package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {

    private ArrayList<BoardDTO> boardList;
    private ResultPrinter rp;

    public BoardManager() {

        boardList = new ArrayList<>();
        rp = new ResultPrinter();
    }

    /* 새 게시글 등록용 메소드 */
    public void insertBoard(BoardDTO b){

        if (b == null) {
            rp.errorPage("insertBoard");
            return;
        }

        //  글번호 0으로 초기화
        int boardNo = 0;

        //  조회내역이 있는 경우
        //  - 조회된 내역이 있는 경우 새로운 리스트 생성
        //  - 글 번호를 1로 변경
        //  조회내역이 없는 경우
        //  - 조회 내역이 있는 경우 기존 리스트의 마지막 인덱스의 글번호 조회
        if (!boardList.isEmpty()) {

            BoardDTO lastBoard = boardList.getLast();
            boardNo = lastBoard.getBoardNo() + 1;
        }

        b.setBoardNo(boardNo);

        // 출력값 결정(successPage)
        boolean result = boardList.add(b);

        if (result) {
            rp.successPage("insertBoard");
        } else {
            rp.errorPage("insertBoard");
        }

    }

    /* 게시글 전체 조회용 메소드 */
    public void selectAllList(){
        // 게시글 전체 조회 후 전체 출력 (printAllList() 이용)
        rp.printAllList(boardList);
    }

    /* 게시물 1개 조회용 메소드 */
    public void selectOneBoard(int boardNo){

        // 전체 게시물을 조회
        // 조회에 성공하면 게시물 번호와 일치하는 게시물을 리스트에서 탐색
        // 조회성공 시 조회수 1증가
        BoardDTO result = null;

        for (BoardDTO board : boardList) {
            if (board.getBoardNo() == boardNo) {
                board.setReadCount(board.getReadCount() + 1);
                result = board;
                break;
            }
        }

        // 일치하는 게시물이 없으면 에러출력,
        // 일치하는 내용이 있으면 게시물 출력
        if (result == null) {
            rp.errorPage("selectOne");
        } else {
            rp.printBoard(result);
        }
    }

    /* 게시물 제목 변경용 메소드 */
    public void updateBoardTitle(int boardNo, String title) {


        //  전체 리스트 조회
        //  일치하는 게시물 조회
        boolean result = false;
        for (BoardDTO board : boardList) {
            //  조회 결과가 있는 경우 제목 수정
            if (board.getBoardNo() == boardNo) {
                board.setBoardTitle(title);
                result = true;
                break;
            }
        }

        //  결과 출력(successPage)
        if (result) {
            rp.successPage("updateTitle");
        } else {
            rp.errorPage("updateTitle");
        }
    }

    /* 게시물 내용 변경용 메소드 */
    public void updateBoardContent(int boardNo, String content) {
        //  전체 리스트 조회
        //  일치하는 게시물 조회
        boolean result = false;

        for (BoardDTO board : boardList) {
            //  조회 결과가 있는 경우 내용 수정
            if (board.getBoardNo() == boardNo) {
                //  수정 후 다시 파일에 저장
                board.setBoardContent(content);
                result = true;
                break;
            }
        }

        //  결과 출력(successPage)
        if (result) {
            rp.successPage("updateContent");
        } else {
            rp.errorPage("updateContent");
        }
    }

    /* 게시물 삭제용 메소드 */
    public void deleteBoard(int boardNo) {
        //  전체 게시물 조회
        boolean result = false;

        //  게시물 번호와 일치하는 게시물 조회
        //  ->일치하는 게시물이 있는경우 삭제
        for (int i = 0;
             i < boardList.size();
             i++) {

            if (boardList.get(i).getBoardNo() == boardNo) {
                boardList.remove(i);
                result = true;
                break;
            }
        }

        //  결과 출력(successPage())
        if (result) {
            rp.successPage("deleteBoard");
        } else {
            rp.errorPage("deleteBoard");
        }
    }

    /* 제목으로 조회 */
    public void searchBoard(String title) {
        // 전체 게시물 조회
        // 검색 결과를 담을 리스트 생성
        ArrayList<BoardDTO> searchList = new ArrayList<>();

        for (BoardDTO board : boardList) {
            // 제목을 포함하고 있는 게시물을 결과 리스트에 저장
            if (board.getBoardTitle().contains(title)) {
                searchList.add(board);
            }
        }

        // 검색결과 리스트가 비어있는 경우 에러 출력, 비어 있지 않은 경우 결과 출력
        if (searchList.isEmpty()) {
            rp.noSearchResult();
        } else {
            rp.printAllList(searchList);
        }
    }

    /* 정렬 처리용 메소드 */
    public void sortList(Comparator<BoardDTO> c) {
        // 리스트 전체 조회
        // 정렬
        boardList.sort(c);

        // 출력
        rp.printAllList(boardList);
    }
}
