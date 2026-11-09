package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BoardManager {

    private ArrayList<BoardDTO> boardList;
    private ResultPrinter rp;

    public BoardManager() {
        boardList = new ArrayList<>();
        rp = new ResultPrinter();
    }

    public void insertBoard(BoardDTO b) {
        b.setBoardNo(0);

        if (boardList.isEmpty()) {
            b.setBoardNo(1);
        } else {
            int lastIndex = boardList.size() - 1;
            int lastNo = boardList.get(lastIndex).getBoardNo();

            b.setBoardNo(lastNo + 1);
        }

        boardList.add(b);

        rp.successPage("insertBoard");
    }

    public void selectAllList() {
        rp.printAllList(boardList);
    }

    public void selectOneBoard(int boardNo) {
        boolean found = false;

        for (BoardDTO b : boardList) {

            if (b.getBoardNo() == boardNo) {

                b.setReadCount(b.getReadCount() + 1);

                rp.printBoard(b);

                found = true;

                break;
            }
        }

        if (!found) {
            rp.errorPage("selectOne");
        }
    }

    public void updateBoardTitle(int boardNo, String title) {
        boolean found = false;

        for (BoardDTO b : boardList) {

            if (b.getBoardNo() == boardNo) {

                b.setBoardTitle(title);

                found = true;

                rp.successPage("updateTitle");

                break;
            }
        }

        if (!found) {
            rp.errorPage("updateTitle");
        }
    }

    public void updateBoardContent(int boardNo, String content) {
        boolean found = false;

        for (BoardDTO b : boardList) {

            if (b.getBoardNo() == boardNo) {

                b.setBoardContent(content);

                found = true;

                rp.successPage("updateContent");

                break;
            }
        }

        if (!found) {
            rp.errorPage("updateContent");
        }
    }

    public void deleteBoard(int boardNo) {
        boolean found = false;

        for (int i = 0; i < boardList.size(); i++) {

            if (boardList.get(i).getBoardNo() == boardNo) {

                boardList.remove(i);

                found = true;

                rp.successPage("deleteBoard");

                break;
            }
        }

        if (!found) {
            rp.errorPage("deleteBoard");
        }
    }

    public void searchBoard(String title) {
        ArrayList<BoardDTO> searchList = new ArrayList<>();

        for (BoardDTO b : boardList) {

            if (b.getBoardTitle().contains(title)) {

                searchList.add(b);
            }
        }

        if (searchList.isEmpty()) {

            rp.noSearchResult();

        } else {

            rp.printAllList(searchList);
        }
    }

    public void sortList(Comparator<BoardDTO> c) {
        ArrayList<BoardDTO> sortList = new ArrayList<>(boardList);

        Collections.sort(sortList, c);

        rp.printAllList(sortList);
    }
}
