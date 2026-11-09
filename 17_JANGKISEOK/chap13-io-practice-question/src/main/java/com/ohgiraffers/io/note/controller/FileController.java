package com.ohgiraffers.io.note.controller;

import java.io.*;
import java.util.Scanner;

public class FileController {

    private Scanner sc;

    public FileController() {
        sc = new Scanner(System.in);
    }

    public void fileSave(){
        StringBuilder sb = new StringBuilder();

        System.out.println("=========== 내용 입력 (exit 입력으로 종료) ==========");
        String input = null;
        while(true){
            input = sc.nextLine();
            if(input.equals("exit")) break;
            sb.append(input);
            sb.append('\n');
        }

        String path = "src/main/java/com/ohgiraffers/io/note";
        System.out.print("저장할 파일명을 입력하시오 : ");
        String fileName = sc.nextLine();


        System.out.print("파일을 저장하시겠습니까? (y 입력시 저장) : ");
        String save = sc.nextLine();
        if(save.equalsIgnoreCase("y")){
            BufferedWriter bw = null;
            try{
                bw = new BufferedWriter(new FileWriter(path + "/" + fileName + ".txt"));
                bw.write(sb.toString());
                bw.flush();
                System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(bw != null){
                    try {
                        bw.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        else {
            System.out.println("다시 메뉴로 돌아갑니다.");
        }
    }

    public void fileOpen(){
        String path = "src/main/java/com/ohgiraffers/io/note";

        System.out.print("열기 할 파일명 : ");
        String fileName = sc.nextLine();

        String content = null;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(path + "/" + fileName + ".txt"));

            while(true){
                content = br.readLine();
                if(content == null) break;
                System.out.println(content);
            }
        } catch (EOFException e) {
            System.out.println("파일의 끝 입니다.");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(br != null){
                try {
                    br.close();
                }catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void fileEdit(){
        String path = "src/main/java/com/ohgiraffers/io/note";

        System.out.print("수정 할 파일명 : ");
        String fileName = sc.nextLine();


        String content = null;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(path + "/" + fileName + ".txt"));

            while(true){
                content = br.readLine();
                if(content == null) break;
                System.out.println(content);
            }
        } catch (EOFException e) {
            System.out.println("파일의 끝 입니다.");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(br != null){
                try {
                    br.close();
                }catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        System.out.println("=========== 내용 입력 (exit 입력으로 종료) ==========");
        String input = null;
        while(true){
            input = sc.nextLine();
            if(input.equals("exit")) break;
            sb.append(input);
            sb.append('\n');
        }

        System.out.print("파일을 저장하시겠습니까? (y 입력시 저장) : ");
        String save = sc.nextLine();
        if(save.equalsIgnoreCase("y")){
            BufferedWriter bw = null;
            try{
                bw = new BufferedWriter(new FileWriter(path + "/" + fileName + ".txt", true));
                bw.write(sb.toString());
                bw.flush();
                System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(bw != null){
                    try {
                        bw.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        else {
            System.out.println("다시 메뉴로 돌아갑니다.");
        }
    }
}
