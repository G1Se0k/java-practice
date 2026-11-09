package com.ohgiraffers.io.note.view;

import com.ohgiraffers.io.controller.FileController;

import java.util.Scanner;

public class NoteMenu {

    private Scanner sc = new Scanner(System.in);
    private FileController fc = new FileController();

    public void viewMenu() {

        while(true) {
            System.out.println("****** MyNote ******");
            System.out.println("1. 노트 새로 만들기");
            System.out.println("2. 노트 열기");
            System.out.println("3. 노트 열어서 수정하기");
            System.out.println("4. 끝내기");
            System.out.print("번호를 입력하세요 : ");

            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    fileSave();
                    break;
                case 2:
                    fileOpen();
                    break;
                case 3:
                    fileEdit();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }
    }

    public void fileSave() {
        StringBuilder sb = new StringBuilder();

        System.out.println("파일에 저장할 내용을 입력하세요.");
        System.out.println("('exit' 입력 시 입력 종료)");

        while (true) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }
            sb.append(line).append("\n");
        }
        System.out.print("저장할 파일명을 입력하세요 : ");
        String fileName = sc.nextLine();

        fc.fileSave(sb, fileName);
    }

    public void fileOpen() {
        System.out.print("열어볼 파일명을 입력하세요 : ");
        String fileName = sc.nextLine();

        StringBuilder sb = fc.fileOpen(fileName);

        if (sb != null) {
            System.out.println(sb);
        } else {
            System.out.println("요청하신 파일은 존재하지 않습니다.");
        }
    }

    public void fileEdit() {
        System.out.print("수정할 파일명을 입력하세요 : ");
        String fileName = sc.nextLine();

        StringBuilder sb = fc.fileOpen(fileName);

        if (sb == null) {
            System.out.println("요청하신 파일은 존재하지 않습니다.");
            return;
        }

        System.out.println("====== 기존 내용 ======");
        System.out.print(sb);
        System.out.println("======================");

        System.out.println("추가할 내용을 입력하세요.");
        System.out.println("('exit' 입력 시 입력 종료)");

        while (true) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }
            sb.append(line).append("\n");
        }

        fc.fileEdit(fileName, sb);
    }
}
