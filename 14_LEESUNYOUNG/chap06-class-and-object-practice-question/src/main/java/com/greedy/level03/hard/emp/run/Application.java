package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String dept = sc.nextLine();
        String job = sc.nextLine();
        int age = sc.nextInt();
        char gender = sc.next().charAt(0);
        int salary = sc.nextInt();
        double bonusPoint = sc.nextDouble();
        sc.nextLine();
        String phone = sc.nextLine();
        String address = sc.nextLine();

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setNumber(number);
        employeeDTO.setName(name);
        employeeDTO.setDept(dept);
        employeeDTO.setJob(job);
        employeeDTO.setAge(age);
        employeeDTO.setGender(gender);
        employeeDTO.setSalary(salary);
        employeeDTO.setBonusPoint(bonusPoint);
        employeeDTO.setPhone(phone);
        employeeDTO.setAddress(address);
        System.out.println("사번 : " + employeeDTO.getNumber());
        System.out.println("이름 : " + employeeDTO.getName());
        System.out.println("부서 : " + employeeDTO.getDept());
        System.out.println("직급 : " + employeeDTO.getJob());
        System.out.println("나이 : " + employeeDTO.getAge());
        System.out.println("성별 : " + employeeDTO.getGender());
        System.out.println("급여 : " + employeeDTO.getSalary());
        System.out.println("보너스 포인트 : " + employeeDTO.getBonusPoint());
        System.out.println("전화번호 : " + employeeDTO.getPhone());
        System.out.println("주소 : " + employeeDTO.getAddress());
    }
}
