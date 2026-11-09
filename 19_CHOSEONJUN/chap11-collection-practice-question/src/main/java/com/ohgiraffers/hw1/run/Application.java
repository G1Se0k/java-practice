package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.view.BookMenu;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        // 메뉴실행
		new BookMenu().menu();
    }
}
