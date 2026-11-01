package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    EmployeeDTO emp = new EmployeeDTO();

    System.out.print("사번을 입력하세요 : ");
    emp.setNumber(sc.nextInt());
    sc.nextLine();  // 줄바꾸기 목적, 질문 필요

    System.out.print("이름을 입력하세요 : ");
    emp.setName(sc.nextLine());

    System.out.print("부서를 입력하세요 : ");
    emp.setDept(sc.nextLine());

    System.out.print("직급을 입력하세요 : ");
    emp.setJob(sc.nextLine());

    System.out.print("나이를 입력하세요 : ");
    emp.setAge(sc.nextInt());

    System.out.print("성별을 입력하세요 : ");
    emp.setGender(sc.next().charAt(0));

    System.out.print("급여를 입력하세요 : ");
    emp.setSalary(sc.nextInt());

    System.out.print("보너스 포인트를 입력하세요 : ");
    emp.setBonusPoint(sc.nextDouble());
    sc.nextLine();

    System.out.print("전화번호를 입력하세요 : ");
    emp.setPhone(sc.nextLine());

    System.out.print("주소를 입력하세요 : ");
    emp.setAddress(sc.nextLine());

    System.out.println(emp.getNumber());
    System.out.println(emp.getName());
    System.out.println(emp.getDept());
    System.out.println(emp.getJob());
    System.out.println(emp.getAge());
    System.out.println(emp.getGender());
    System.out.println(emp.getSalary());
    System.out.println(emp.getBonusPoint());
    System.out.println(emp.getPhone());
    System.out.println(emp.getAddress());
    }
}
