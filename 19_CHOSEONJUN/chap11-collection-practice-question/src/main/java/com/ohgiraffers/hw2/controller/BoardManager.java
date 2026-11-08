package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {

    private ArrayList<BoardDTO> boardList;
    ResultPrinter rp = new ResultPrinter();

    public void insertBoard(BoardDTO b) {
        ///// 글번호 0으로 초기화
        int boarNo = 0;  /// 처음 게시글 0번 시작
        /// // 조회내역이 있는 경우
        /// - 조회된 내역이 있는 경우 새로운 리스트 생성
        if (boardList == null) {
            boardList = new ArrayList<>();
            /// - 글 번호를 1로 변경
            ///  // 조회내역이 없는 경우
            boarNo++; /// 처음 글번호 +1
        } else {
            /// - 조회 내역이 있는 경우 기존 리스트의 마지막 인덱스의 글번호 조회
            /// List 마지막 인덱스의 게시글 번호 + 1 -> 게시글 갯수
            boarNo = boardList.get(boardList.size() - 1).getBoardNo() + 1;
        }
        b.setBoardNo(boarNo); /// 게시글 번호 적용.
        ///  // 출력값 결정(successPage)
        boardList.add(b);


    }

    /* 게시글 전체 조회용 메소드 */
    public void selectAllList() {
        ///// 게시글 전체 조회 후 전체 출력 (printAllList() 이용)
        boardList.stream().forEach(System.out::println);
    }

    /* 게시물 1개 조회용 메소드 */
    public void selectOneBoard(int boardNo) {
        /// // 전체 게시물을 조회
        ///  // 조회에 성공하면 게시물 번호와 일치하는 게시물을 리스트에서 탐색
        BoardDTO selectedBoard = null; /// 조회할 게시글 변수
        if (boardList != null) {
            for (int i = 0; i < boardList.size(); i++) {
                if (boardList.get(i).getBoardNo() == boardNo) { /// 게시글 번호 일치 검사
                    selectedBoard = boardList.get(i);   /// 해당 게시글 가져오기
                    ///  // 조회성공 시 조회수 1증가
                    selectedBoard.setReadCount(selectedBoard.getReadCount() + 1);
                    break; /// 찾았으면 종료
                }
            }
        } else {
            ///  // 일치하는 게시물이 없으면 에러출력,
            System.out.println("게시글이 없습니다. 먼제 게시글을 등록해주세요. ");
        }
        /// // 일치하는 내용이 있으면 게시물 출력
        if (selectedBoard == null) {   /// 해당값을 찾이 못할 경우.
            System.out.println("해당 값이 없습니다.");
        } else {
            System.out.println(selectedBoard);
        }
    }

    /* 게시물 제목 변경용 메소드 */
    public void updateBoardTitle(int boardNo, String title) {
        ///// 전체 리스트 조회
        /// // 일치하는 게시물 조회
        BoardDTO selectedBoard = null; /// 일치하는 게시글 변수
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getBoardNo() == boardNo) {
                ///  조회 결과가 있는 경우 제목 수정
                selectedBoard = boardList.get(i); /// 주소값 건드림.
                selectedBoard.setBoardTtile(title); /// 제목 변경
                break; /// 종료
            }
        }
        if (selectedBoard == null) {
            System.out.println("일치하는 게시글이 없습니다. ");
        }
        /// // 결과 출력(successPage)

    }

    /* 게시물 내용 변경용 메소드 */
    public void updateContent(int boardNo, String content) {
        ///// 전체 리스트 조회
        /// // 일치하는 게시물 조회
        BoardDTO selectedBoard = null; /// 일치하는 게시글 변수
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getBoardNo() == boardNo) {
                ///  조회 결과가 있는 경우 내용 수정
                selectedBoard = boardList.get(i);
                selectedBoard.setBoardContent(content);
            }
        }

        ///  수정 후 다시 파일에 저장
        /// // 결과 출력(successPage)
    }

    /* 게시물 삭제용 메소드 */
    public void deleteBoard(int boardNo) {
        /// // 전체 게시물 조회
        ///  // 게시물 번호와 일치하는 게시물 조회
        BoardDTO selectedBoard = null; /// 삭제할 게시글 변수
        for (int i = 0; i < boardList.size(); i++) {
            ///  ->일치하는 게시물이 있는경우 삭제
            if (boardList.get(i).getBoardNo() == boardNo) {
                selectedBoard = boardList.get(i);
                boardList.remove(selectedBoard);    /// 해당 게시글 삭제
                break;
            }
        }
        /// // 결과 출력(successPage())


    }

    /* 제목으로 조회 */
    public void searchBoard(String title) {
        ///시물 조회
        ///  // 검색 결과를 담을 리스트 생성
        ///  // 제목을 포함하고 있는 게시물을 결과 리스트에 저장
        ArrayList<BoardDTO> searchList = new ArrayList<>();
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getBoardTtile().equals(title)) {
                searchList.add(boardList.get(i));
            }
        }
        ///  // 검색결과 리스트가 비어있는 경우 에러 출력, 비어 있지 않은 경우 결과 출력
        if (!searchList.isEmpty()) {
            searchList.stream().forEach(System.out::println);
        }else System.out.println("해당 제목을 찾을 수 없습니다.");

    }

    /* 정렬 처리용 메소드 */
    public void sortList(Comparator<BoardDTO> c) {
        ///// 리스트 전체 조회
        ///  // 정렬
        boardList.sort(c);

        ///  // 출력
        rp.printAllList(boardList);

    }

}
