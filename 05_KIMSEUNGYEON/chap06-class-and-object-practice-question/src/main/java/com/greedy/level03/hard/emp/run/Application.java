package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //스캐너를 이용해서 모든 직원 정보를 입력 받아
        Scanner sc = new Scanner(System.in);
        System.out.println("사번을 입력하세요.");
        int number = sc.nextInt();
        System.out.println("이름을 입력하세요.");
        String name = sc.next();
        System.out.println("부서를 입력하세요.");
        String dept = sc.next();
        System.out.println("직급을 입력하세요.");
        String job = sc.next();
        System.out.println("나이를 입력하세요.");
        int age = sc.nextInt();
        System.out.println("성별을 입력하세요.");
        char gender = sc.next().charAt(0);
        System.out.println("급여를 입력하세요.");
        int salary = sc.nextInt();
        System.out.println("보너스포인트를 입력하세요.");
        double bonusPoint = sc.nextDouble();
        System.out.println("연락처를 입력하세요.");
        String phone = sc.next();
        System.out.println("주소를 입력하세요.");
        sc.nextLine();
        String address = sc.nextLine();

        //기본 생성자로 인스턴스 생성 후 setter를 이용하여 필드 값 변경 후
        EmployeeDTO employee = new EmployeeDTO();
        employee.setNumber(number);
        employee.setName(name);
        employee.setDept(dept);
        employee.setJob(job);
        employee.setAge(age);
        employee.setGender(gender);
        employee.setSalary(salary);
        employee.setBonusPoint(bonusPoint);
        employee.setPhone(phone);
        employee.setAddress(address);

        //getter를 이용하여 모든 필드 값 출력
        System.out.println(employee.getNumber());
        System.out.println(employee.getName());
        System.out.println(employee.getDept());
        System.out.println(employee.getJob());
        System.out.println(employee.getAge());
        System.out.println(employee.getGender());
        System.out.println(employee.getSalary());
        System.out.println(employee.getBonusPoint());
        System.out.println(employee.getPhone());
        System.out.println(employee.getAddress());
    }
}
