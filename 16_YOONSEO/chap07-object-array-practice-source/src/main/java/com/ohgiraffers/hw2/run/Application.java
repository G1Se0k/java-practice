package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        StudentDTO[] arr = new StudentDTO[10];

        // while문을 사용하여 학생들의 정보를 계속 입력 받고 한 명씩 추가 될 때마다 카운트함
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        int count = 0;
        do{
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            arr[count] = new StudentDTO(grade,classroom,name,kor,eng,math);
            count++;
            System.out.print("계속 입력하시겠습니까? ");
            char ch =sc.next().charAt(0);
            if(ch!='y' && ch!= 'Y'){
                break;
            }

        }while(true);


        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        int arr2[] = new int[count];
        for(int i=0;i<count;i++){
            StudentDTO sdto = arr[i];
            arr2[i]= (sdto.getKor()+sdto.getEng()+sdto.getMath())/3;
        }

        // 학생들의 정보를 모두 출력 (평균 포함)
        for(int i=0;i<count;i++){
            StudentDTO s4 = arr[i];
            System.out.println(s4.information()+" "+arr2[i]);
        }
    }
}
