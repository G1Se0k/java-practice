package com.ohgiraffers.io.controller;

import java.io.*;
import java.util.Scanner;

public class FileController {

    private Scanner sc = new Scanner(System.in);

    /* 노트 새로 만들기 */
    public void fileSave() {

        StringBuilder sb = new StringBuilder();

        System.out.println("내용을 입력하세요.");
        System.out.println("입력을 끝내려면 exit를 입력하세요.");

        while (true) {

            String content = sc.nextLine();
            if (content.equalsIgnoreCase("exit")) {
                break;
            }
            sb.append(content).append("\n");
        }

        System.out.print("저장하시겠습니까? (y/n) : ");
        String save = sc.nextLine();

        if (save.equalsIgnoreCase("y")) {
            System.out.print("저장할 파일명을 입력하시오 : ");
            String fileName = sc.nextLine();
            BufferedWriter bw = null;

            try {
                bw = new BufferedWriter(new FileWriter(fileName + ".txt"));
                bw.write(sb.toString());
                System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
            } catch (IOException e) {

                e.printStackTrace();

            } finally {
                try {
                    if (bw != null) {
                        bw.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();}
            }

        } else {

            System.out.println("다시 메뉴로 돌아갑니다.");
        }
    }


    /* 노트 열기 */
    public void filOpen() {

        System.out.print("열기 할 파일명 : ");
        String fileName = sc.nextLine();

        BufferedReader br = null;

        String content = null;

        try {

            br = new BufferedReader(new FileReader(fileName + ".txt"));

            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }

        } catch (FileNotFoundException e) {

            System.out.println("파일을 찾을 수 없습니다.");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                if (br != null) {
                    br.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /* 노트 열어서 수정하기 */
    public void fileEdit() {

        System.out.print("수정할 파일명 : ");
        String fileName = sc.nextLine();

        BufferedReader br = null;
        BufferedWriter bw = null;

        StringBuilder sb = new StringBuilder();
        String content = null;

        try {

            /* 기존 파일 내용 읽기 */
            br = new BufferedReader(new FileReader(fileName + ".txt"));

            System.out.println("===== 기존 내용 =====");

            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }

            System.out.println("====================");

            /* 새 내용 입력 */
            System.out.println("추가할 내용을 입력하세요.");
            System.out.println("입력을 끝내려면 exit를 입력하세요.");

            while (true) {
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                sb.append(input).append("\n");
            }

            System.out.print("저장하시겠습니까? (y/n) : ");
            String save = sc.nextLine();

            if (save.equalsIgnoreCase("y")) {
                /* true -> 이어쓰기 */
                bw = new BufferedWriter(new FileWriter(fileName + ".txt", true));
                bw.write(sb.toString());
                System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");

            } else {
                System.out.println("다시 메뉴로 돌아갑니다.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
