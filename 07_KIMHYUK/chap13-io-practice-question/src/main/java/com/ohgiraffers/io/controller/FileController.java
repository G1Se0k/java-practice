package com.ohgiraffers.io.controller;

import java.io.*;

public class FileController {

    public void fileSave(StringBuilder sb, String fileName) {
        String fullName = formatFileName(fileName);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fullName))) {
            bw.write(sb.toString());
            System.out.println(fullName + " 파일에 성공적으로 저장 되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류가 발생했습니다 : " + e.getMessage());
        }
    }

    public StringBuilder fileOpen(String fileName) {
        String fullName = formatFileName(fileName);
        File file = new File(fullName);

        if (!file.exists()) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류가 발생했습니다 : " + e.getMessage());
        }

        return sb;
    }


    public void fileEdit(String fileName, StringBuilder sb) {
        fileSave(sb, fileName);
    }

    public String formatFileName(String fileName) {
        if (!fileName.endsWith(".txt")) {
            return fileName + ".txt";
        }
        return fileName;
    }
}
