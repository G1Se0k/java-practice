package com.greedy.level03.hard.emp.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;
import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //스캐너를 이용해서 모든 직원 정보를 입력 받아
        Scanner sc = new Scanner(System.in);
        System.out.println("number :");
        int number = sc.nextInt();
        System.out.println("name :");
        String name = sc.next();
        System.out.println("dept :");
        String dept = sc.next();
        System.out.println("job :");
        String job = sc.next();
        System.out.println("age :");
        int age = sc.nextInt();
        System.out.println("gender :");
        char gender = sc.next().charAt(0);
        System.out.println("salary :");
        int salary = sc.nextInt();
        System.out.println("bonus point :");
        double bonusPoint = sc.nextDouble();
        sc.nextLine();
        System.out.println("phone :");
        String phone = sc.nextLine();
        System.out.println("adress :");
        String adress = sc.nextLine();

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
        employeeDTO.setAdress(adress);

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
        System.out.println(employeeDTO.getAdress());

    }
}


//200
//홍길동
//영업부
//과장
//20
//남
//2000000
//0.5
//010-1234-5678
//서울시 서초구 서초동