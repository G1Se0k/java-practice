package com.ohgiraffers.hw2.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;
import java.util.Date;

public class DescBoardTitle implements Comparator<BoardDTO> {
    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {
        return o2.getBoardTitle().compareTo(o1.getBoardTitle());
    }
}