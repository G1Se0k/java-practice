package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        int num,age, salary;
        double bonus;
        char gender;
        String name, dept, job, phone,address;

        System.out.print("번호 : ");
        num = sc.nextInt();
        System.out.print("이름 : ");
        name = sc.next();
        System.out.print("부서 : ");
        dept = sc.next();
        System.out.print("직업 : ");
        job = sc.next();
        System.out.print("나이 : ");
        age = sc.nextInt();
        System.out.print("성별 : ");
        gender = sc.next().charAt(0);
        System.out.print("급여 : ");
        salary = sc.nextInt();
        System.out.print("보너스 : ");
        bonus = sc.nextDouble();
        System.out.print("핸드폰 : ");
        phone = sc.next();
        sc.nextLine();
        System.out.print("주소 : ");
        address = sc.nextLine();
        sc.nextLine();

        employeeDTO.setNumber(num);
        employeeDTO.setName(name);
        employeeDTO.setDept(dept);
        employeeDTO.setJob(job);
        employeeDTO.setAge(age);
        employeeDTO.setGender(gender);
        employeeDTO.setSalary(salary);
        employeeDTO.setBnousPoint(bonus);
        employeeDTO.setPhone(phone);
        employeeDTO.setAddress(address);

        employeeDTO.getNumber();
        employeeDTO.getName();
        employeeDTO.getDept();
        employeeDTO.getJob();
        employeeDTO.getAge();
        employeeDTO.getGender();
        employeeDTO.getSalary();
        employeeDTO.getBnousPoint();
        employeeDTO.getPhone();
        employeeDTO.getAddress();



    }
}
