package com.ohgiraffers.hw2.model.dto;

import java.util.Date;

public class BoardDTO {


    private int boardNo;   ///  글번호
    private String boardTtile;  /// 게시글 제목
    private String boardWriter; /// 작성자
    private Date boardDate;     /// 게시 날짜
    private String boardContent;    /// 게시글 내용
    private int readCount;      /// 게시글 조회수


    public BoardDTO() {}

    public BoardDTO(String boardWriter, int boardNo, String boardTtile, Date boardDate, String boardContent, int readCount) {
        this.boardWriter = boardWriter;
        this.boardNo = boardNo;
        this.boardTtile = boardTtile;
        this.boardDate = boardDate;
        this.boardContent = boardContent;
        this.readCount = readCount;
    }

    public int getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }

    public String getBoardTtile() {
        return boardTtile;
    }

    public void setBoardTtile(String boardTtile) {
        this.boardTtile = boardTtile;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public Date getBoardDate() {
        return boardDate;
    }

    public void setBoardDate(Date boardDate) {
        this.boardDate = boardDate;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "boardNo=" + boardNo +
                ", boardTtile='" + boardTtile + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardDate=" + boardDate +
                ", boardContent='" + boardContent + '\'' +
                ", readCount=" + readCount +
                '}';
    }
}



