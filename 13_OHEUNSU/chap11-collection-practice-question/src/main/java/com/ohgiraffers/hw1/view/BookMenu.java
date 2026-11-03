package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    private Scanner sc;
    private BookManager bm;
    private int cnt;

    {
        sc = new Scanner(System.in);
        bm = new BookManager();
        cnt = 1;
    }

    public BookMenu() {
    }

    public void menu(){
        int num = 0;

        while(num != 6){
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("원하는 메뉴의 번호를 입력해주세요. ");
            num = sc.nextInt();
            sc.nextLine();
            switch (num){
                case 1: {
                    bm.addBook(inputBook());
                    break;
                }
                case 2: {
                    int way = 0;
                    while(way != 1 && way != 2){
                        System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2. 내림차순) ");
                        way = sc.nextInt();
                        sc.nextLine();
                        if(way != 1 && way != 2) System.out.println("번호를 잘못입력하였습니다.");
                        else bm.printBookList(bm.sortedBookList(way));
                    }
                    break;
                }
                case 3:{
                    System.out.print("삭제할 도서의 번호를 입력해주세요. ");
                    bm.deleteBook(sc.nextInt());
                    sc.nextLine();
                    break;
                }
                case 4:{
                    int idx = bm.searchBook(inputBookTitle());
                    if(idx == -1) System.out.println("조회한 도서가 존재하지 않음");
                    else bm.printBook(idx);
                    break;
                }
                case 5:{
                    bm.displayAll();
                    break;
                }
                case 6: break;
                default:
                    System.out.println("유효하지 않은 번호입니다.");
            }
        }
        return;
    }

    public BookDTO inputBook(){
        System.out.print("도서 제목 : ");
        String title = sc.nextLine();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 저자 : ");
        String author = sc.nextLine();
        return new BookDTO(cnt++, category, title, author);
    }

    public String inputBookTitle(){
        System.out.print("도서 제목 : ");
        return sc.nextLine();
    }
}
