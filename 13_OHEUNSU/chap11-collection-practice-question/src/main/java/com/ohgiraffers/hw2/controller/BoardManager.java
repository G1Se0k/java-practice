package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {

    private ArrayList<BoardDTO> boardList;
    private ResultPrinter rp;

    {
        boardList = new ArrayList<>();
        rp = new ResultPrinter();
    }

    public void insertBoard(BoardDTO b){

        if(boardList.isEmpty()){
            b.setBoardNo(1);
            boardList.add(b);
        }else {
            b.setBoardNo(boardList.get(boardList.size() - 1).getBoardNo() + 1);
            boardList.add(b);
        }

        rp.successPage("insertBoard");
    }

    public void selectAllList(){
        rp.printAllList(boardList);
    }

    public void selectOneBoard(int boardNo){
        boolean isExist = false;

        for(BoardDTO board: boardList){
            if(board.getBoardNo() == boardNo){
                isExist = true;
                board.setReadCount(board.getReadCount() + 1);
                rp.printBoard(board);
                break;
            }
        }

        if(!isExist) rp.errorPage("selectOne");

    }

    public void updateBoardTitle(int boardNo, String title){
        boolean isExist = false;

        for(BoardDTO board: boardList){
            if(board.getBoardNo() == boardNo){
                isExist = true;
                board.setBoardTitle(title);
                break;
            }
        }

        if(isExist) rp.successPage("updateTitle");
        else rp.errorPage("updateTitle");
    }

    public void updateBoardContent(int boardNo,String content){
        boolean isExist = false;

        for(BoardDTO board: boardList){
            if(board.getBoardNo() == boardNo){
                isExist = true;
                board.setBoardContent(content);
                break;
            }
        }

        if(isExist) rp.successPage("updateContent");
        else rp.errorPage("updateContent");
    }

    public void deleteBoard(int boardNo){
        boolean isExist = false;

        for(int i = 0; i < boardList.size(); i++){
            if(boardList.get(i).getBoardNo() == boardNo){
                isExist = true;
                boardList.remove(i);
                break;
            }
        }

        if(isExist) rp.successPage("deleteBoard");
        else rp.errorPage("deleteBoard");
    }

    public void searchBoard(String title){
        ArrayList<BoardDTO> resList = new ArrayList<>();
        for(BoardDTO board: boardList){
            if(board.getBoardTitle().equals(title)){
                resList.add(board);
                break;
            }
        }

        if(resList.isEmpty()) rp.errorPage("selectOne");
        else rp.printAllList(resList);
    }

    public void sortList(Comparator<BoardDTO> c){
        boardList.sort(c);
        rp.printAllList(boardList);
    }
}
