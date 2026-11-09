package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BoardManager {
    private final ArrayList<BoardDTO> boardList;
    private final ResultPrinter rp;

    public BoardManager() {
        boardList = new ArrayList<BoardDTO>();
        rp = new ResultPrinter();
    }

    public void insertBoard(BoardDTO b){
        if(boardList.isEmpty())b.setBoardNo(1);
        else b.setBoardNo(boardList.getLast().getBoardNo() + 1);
        boardList.add(b);
    }
    public void selectAllList(){
        rp.printAllList(boardList);
    }
    public void selectOneBoard(int boardNo){
        BoardDTO searchBoard = null;
        for(BoardDTO board : boardList){
            if (board.getBoardNo() == boardNo) {
                board.setReadCount(board.getReadCount() + 1);
                searchBoard = board;
            }
            break;
        }
        if(searchBoard == null) {
            rp.errorPage("selectOne");
        }
        else {
            rp.printBoard(searchBoard);
        }
    }
    public void updateBoardTitle(int boardNo, String title){
        BoardDTO searchBoard = null;
        for(BoardDTO board : boardList){
            if (board.getBoardNo() == boardNo) {
                searchBoard = board;
            }
            break;
        }
        if(searchBoard == null){
            rp.errorPage("updateTitle");
        }
        else {
            searchBoard.setBoardTitle(title);
            rp.successPage("updateTitle");
        }
    }
    public void updateBoard(int boardNo, String content){
        BoardDTO searchBoard = null;
        for(BoardDTO board : boardList){
            if (board.getBoardNo() == boardNo) {
                searchBoard = board;
            }
            break;
        }
        if(searchBoard == null){
            rp.errorPage("updateContent");
        }
        else {
            searchBoard.setBoardContent(content);
            rp.successPage("updateContent");
        }
    }
    public void deleteBoard(int boardNo){
        BoardDTO searchBoard = null;
        for(BoardDTO board : boardList){
            if (board.getBoardNo() == boardNo) {
                searchBoard = board;
            }
            break;
        }
        if(searchBoard == null){
            rp.errorPage("deleteBoard");
        }
        else {
            boardList.remove(searchBoard);
            rp.successPage("deleteBoard");
        }
    }
    public void searchBoard(String title){
        List<BoardDTO> searchList = new ArrayList<>();
        for(BoardDTO board : boardList){
            if (board.getBoardTitle().equals(title)){
                searchList.add(board);
            }
        }

        if(searchList.isEmpty()){
            rp.errorPage("selectOne");
        }
        else{
            for(BoardDTO board : searchList){
                System.out.println(board);
            }
        }
    }
    public void sortList(Comparator<BoardDTO> c){
        boardList.sort(c);
        for(BoardDTO board : boardList){
            System.out.println(board);
        }
    }
}
