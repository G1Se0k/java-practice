package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw2.model.dto.StudentDTO;
import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class ProductController {        //컨트롤러
    // 위의 클래스 다이어그램을 보고 필드 작성 o
    // 초기화 블럭을 이용하여 10개의 Product 배열 크기 할당
    private ProductDTO[] pro = new ProductDTO[10];
    Scanner sc = new Scanner(System.in);
    public int count;

    public void mainMenu() {        // 메인 메뉴

    // 메뉴 출력 --> do~while 문으로 반복 실행 처리함

    // ===== 제품 관리 메뉴 =====
    //        1. 제품 정보 추가   // productInput() 메소드 실행
    //        2. 제품 전체 조회   // productPrint() 메소드 실행
    //        9. 프로그램 종료

        do {
            System.out.println("\n===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("3. 제품 검색");
            System.out.println("4. 제품 수정");
            System.out.println("5. 제품 삭제");
            System.out.println("9. 프로그램 종료");
            int answer = sc.nextInt();

            if(answer == 1 ) {
                productInput();
            } else if(answer == 2 ) {
                productPrint();
            } else if (answer == 3) {
                productSearch();
            } else if (answer == 4)  {
                productEdit();
            } else if (answer == 5) {
                productDelete();
            } else {
                System.out.println("프로그램 종료");
                break;
            }
        } while (true);
    }

    public void productInput() {        // 인풋
        // 키보드로 도서 정보를 입력 받아 객체 생성
//        int i = 0;
        while(count < pro.length) {
            System.out.println("도서정보를 입력하세요.");
            System.out.println("제품번호 : ");
            int pld = sc.nextInt();
            System.out.println("제품명 : ");
            String pName = sc.next();
            System.out.println("제품가격 : ");
            int price = sc.nextInt();
            System.out.println("제품세금 : ");
            double tax = sc.nextDouble();
            sc.nextLine();
            // 현재 카운트 인덱스에 생성한 주소 저장
            pro[count] = new ProductDTO(pld, pName, price, tax);
            // -> Product 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가
            count++;
            System.out.println(count + "권 등록 완료!");
            if(count != 0) {
                System.out.println(count + "권 등록 완료!");
                System.out.println("메뉴로 돌아가기 o / x");
                char ox = sc.next().charAt(0);
                if(ox == 'o' || ox == 'O') {
                    mainMenu();
                }  else if(ox == 'x' || ox == 'X') {
                    continue;
                }
            }
        }
    }

    public void productPrint() {        // 출력
        // 현재까지 기록된 도서 정보 모두 출력
        System.out.println("정보 출력");
        System.out.println("번호 | 제품명 | 가격 | 세금");
        int i = 0;
        while(i < count) {
            System.out.println(pro[i].information());
            i++;
        }
//        System.out.println("메뉴로 돌아가기 o / x");
//            char ox = sc.next().charAt(0);
//            if(ox == 'o' || ox == 'O') {
//                mainMenu();
//            }  else if(ox == 'x' || ox == 'X') {
//                productPrint();
//            }

    }
    // 추가적으로 제품 삭제, 수정, 검색 등등의 메소드를 응용해서 추가해보세요~
    public void productSearch() {
        System.out.println("검색할 단어를 입력해주세요.");
        String pName = sc.next();

        int i = 0;
        boolean found = false;
        while(i < count) {
            if (pName.equals(pro[i].getPName())) {
                System.out.println(pro[i].information());
                found = true;
            }
            i++;
        }
        if(found == false) {
            System.out.println("다시 검색하세요.");
        }
    }

    public void productEdit() {
            System.out.println("번호 | 제품명 | 가격 | 세금");
            int i = 0;
            while(i < count) {
                System.out.println(pro[i].information());
                i++;
            }

            System.out.println("수정할 제품의 번호를 입력하세요.");
            // 번호 입력
            int pld = sc.nextInt();
            int j = 0;
            boolean found = false;
            while(j < count) {
                // 입력한 번호와 제품번호 비교
                if (pld == pro[j].getPld()) {
                    // 정보 수정
                    System.out.println("제품 정보를 수정하세요.");
                    System.out.println("제품번호 : ");
                    pro[j].setPld(sc.nextInt());
                    System.out.println("제품명 : ");
                    pro[j].setPName(sc.next());
                    System.out.println("제품가격 : ");
                    pro[j].setPrice(sc.nextInt());
                    System.out.println("제품세금 : ");
                    pro[j].setTax(sc.nextDouble());
                    System.out.println(pld +"번 제품이 수정되었습니다.");
                    found = true;
                    break;
                }
                j++;
            }
            if(found == false) {
                System.out.println("존재하지 않는 번호입니다.");
            }
        }

    public void productDelete() {
        System.out.println("번호 | 제품명 | 가격 | 세금");
        int i = 0;
        while(i < count) {
            System.out.println(pro[i].information());
            i++;
        }
        System.out.println("삭제할 제품번호를 입력하세요.");
        int pld = sc.nextInt();
        int j = 0;
        while(j < count) {
            if (pld == pro[j].getPld()) {
                int k = j;// 출력문
                while(k < count-1) {
                    pro[k] = pro[k + 1];        // 1번이면 1번에 2번 내용 넣고 2번에 3번 내용 넣는다. 반복
                    k++;
                }
                count--;                    // 현재 4라면 3으로 바꿈
                pro[count] = null;          // 3번에 있는건 null입니다
                System.out.println(pld +"번 제품이 삭제되었습니다.");
                break;
            }
            j++;
        }
    }

}