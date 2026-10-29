package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //스캐너를 이용해서 모든 직원 정보를 입력 받아
        System.out.println("============== 직원 정보를 입력하세요 ==============");

        System.out.print("사번 : ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("부서 : ");
        String dept = sc.nextLine();

        System.out.print("직책 : ");
        String job = sc.nextLine();

        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("급여 : ");
        int salary = sc.nextInt();
        sc.nextLine();

        System.out.print("보너스 배율 : ");
        double boundPoint = sc.nextDouble();
        sc.nextLine();

        System.out.print("연락처 : ");
        String phone = sc.nextLine();

        System.out.print("주소 : ");
        String address = sc.nextLine();

        //기본 생성자로 인스턴스 생성 후 setter를 이용하여 필드 값 변경 후

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setNumber(num);
        employeeDTO.setDept(dept);
        employeeDTO.setJob(job);
        employeeDTO.setAge(age);
        employeeDTO.setGender(gender);
        employeeDTO.setSalary(salary);
        employeeDTO.setBonusPoint(boundPoint);
        employeeDTO.setPhone(phone);
        employeeDTO.setAddress(address);

        //getter를 이용하여 모든 필드 값 출력
        System.out.println("============== 직원 정보 ==============");

        System.out.println(employeeDTO.getNumber());
        System.out.println(employeeDTO.getDept());
        System.out.println(employeeDTO.getJob());
        System.out.println(employeeDTO.getAge());
        System.out.println(employeeDTO.getGender());
        System.out.println(employeeDTO.getSalary());
        System.out.println(employeeDTO.getBonusPoint());
        System.out.println(employeeDTO.getPhone());
        System.out.println(employeeDTO.getAddress());
    }
}
