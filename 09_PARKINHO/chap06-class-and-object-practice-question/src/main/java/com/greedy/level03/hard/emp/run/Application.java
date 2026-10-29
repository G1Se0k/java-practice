package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //스캐너를 이용해서 모든 직원 정보를 입력 받아
        Scanner sc = new Scanner(System.in);
        System.out.print("number : ");
        int number = sc.nextInt();
        System.out.print("name : ");
        String name = sc.next();
        System.out.print("dept : ");
        String dept = sc.next();
        System.out.print("job : ");
        String job = sc.next();
        System.out.print("age : ");
        int age = sc.nextInt();
        System.out.print("gender : ");
        char gender = sc.next().charAt(0);
        System.out.print("salary : ");
        int salary = sc.nextInt();
        System.out.print("bonusPoint : ");
        double bonusPoint = sc.nextDouble();
        System.out.print("phone : ");
        String phone = sc.next();
        System.out.print("address : ");
        String address = sc.next();

        //기본 생성자로 인스턴스 생성 후 setter를 이용하여 필드 값 변경 후
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


        //getter를 이용하여 모든 필드 값 출력
        System.out.println(employeeDTO.getNumber());
        System.out.println(employeeDTO.getName());
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
