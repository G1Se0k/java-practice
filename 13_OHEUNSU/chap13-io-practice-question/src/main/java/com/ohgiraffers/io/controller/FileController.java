package com.ohgiraffers.io.controller;

import java.io.*;
import java.util.Scanner;

public class FileController {

    private Scanner sc;

    {
        sc = new Scanner(System.in);
    }

    public void fileSave(){

        StringBuilder sb = new StringBuilder();

        String strIn;
        System.out.print("작성할 내용을 입력하세요('exit' 입력 시 작성 종료): ");

        while (!(strIn = sc.nextLine()).equals("exit")){
            sb.append(strIn + '\n');
        }

        System.out.print("저장하시려면 y를 입력해주세요: ");
        String save = sc.nextLine();

        if (save.equalsIgnoreCase("y")) {
            System.out.print("저장할 파일명을 입력하시오 : ");
            String fileName = sc.nextLine();

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/io/note/" + fileName + ".txt"))) {
                bw.write(sb.toString());
                bw.flush();
                System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else System.out.println("다시 메뉴로 돌아갑니다.");

    }

    public void fileOpen(){
        System.out.print("열기 할 파일명 : ");
        String fileName = sc.nextLine();

        String content;
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/io/note/" + fileName + ".txt"))) {

            while((content = br.readLine()) != null){
                System.out.println(content);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileEdit(){

        System.out.print("수정할 파일명 : ");
        String fileName = sc.nextLine();

        String content;
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/io/note/" + fileName + ".txt"))) {

            while((content = br.readLine()) != null){
                System.out.println(content);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder sb = new StringBuilder();

        String strIn;
        System.out.print("이어서 작성할 내용을 입력하세요('exit' 입력 시 작성 종료): ");

        while (!(strIn = sc.nextLine()).equals("exit")){
            sb.append(strIn + '\n');
        }

        System.out.print("저장하시려면 y를 입력해주세요: ");
        String save = sc.nextLine();

        if (save.equalsIgnoreCase("y")){
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/io/note/" + fileName + ".txt", true))) {
                bw.write(sb.toString());
                bw.flush();
                System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else System.out.println("다시 메뉴로 돌아갑니다.");
    }
}
