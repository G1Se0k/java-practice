package com.ohgiraffers.hw1.model.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class AscCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO first, BookDTO second) {
        return Integer.compare(first.getCategory(), second.getCategory());
    }
}
