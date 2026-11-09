package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Random;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc;
    private BookManager bm;

    public BookMenu() {
        sc = new Scanner(System.in);
        bm = new BookManager();
    }
    public void menu(){
        while(true){
            System.out.println("*** 도서 관리 프로그램***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 번호 선택 : ");

            int input = sc.nextInt();
            sc.nextLine();

            switch(input){
                case 1: bm.addBook(inputBook()); break;
                case 2: {
                    System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2. 내림차순) : ");
                    int sortType = sc.nextInt();
                    sc.nextLine();
                    if (sortType == 1 || sortType == 2) {
                        for(BookDTO b : bm.sortedBookList(sortType)){
                            System.out.println(b);
                        }
                    }
                    else {
                        System.out.println("번호를 잘못 입력하였습니다.");
                    }
                    break;
                }
                case 3: {
                    System.out.print("삭제할 도서 번호를 입력하세요 : ");
                    int select = sc.nextInt();
                    sc.nextLine();
                    bm.deleteBook(select);
                    break;
                }
                case 4: {
                    System.out.print("검색할 도서 제목을 입력하세요 : ");
                    int searchNum = bm.searchBook(inputBookTitle());

                    if(searchNum == -1) System.out.println("조회한 도서가 존재하지 않음");
                    else bm.printBook(searchNum);

                    break;
                }
                case 5: {
                    bm.displayAll();
                    break;
                }
                case 6: return;
            }
        }
    }
    public BookDTO inputBook(){
        Random rand = new Random();

        int bNum = rand.nextInt(0, Integer.MAX_VALUE);
        System.out.println("도서 번호 : " + bNum);
        System.out.print("도서 제목 : ");
        String bTitle = inputBookTitle();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(bNum,category,bTitle,author);
    }
    public String inputBookTitle(){
        return sc.nextLine();
    }
}
