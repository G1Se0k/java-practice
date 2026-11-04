package com.ohgiraffers.hw2.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;
import java.util.Date;

public class DescBoardDate implements Comparator<BoardDTO> {
    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {
        if(o1.getBoardDate() == o2.getBoardDate()) return 0;
        return (o2.getBoardDate().getTime() > o1.getBoardDate().getTime()) ? 1 : -1;
    }
}
