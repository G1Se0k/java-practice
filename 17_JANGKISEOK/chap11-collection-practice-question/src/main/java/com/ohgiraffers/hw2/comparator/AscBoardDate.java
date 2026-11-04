package com.ohgiraffers.hw2.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;

public class AscBoardDate  implements Comparator<BoardDTO> {
    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {
        if(o1.getBoardDate() == o2.getBoardDate()) return 0;
        return (o1.getBoardDate().getTime() > o2.getBoardDate().getTime()) ? 1 : -1;
    }
}
