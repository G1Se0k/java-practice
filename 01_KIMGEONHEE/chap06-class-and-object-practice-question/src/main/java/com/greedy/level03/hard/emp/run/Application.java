package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        String name=sc.next();
        String dept=sc.next();
        String job=sc.next();
        int age=sc.nextInt();
        char gender=sc.next().charAt(0);
        int salary=sc.nextInt();
        double bonusPoint=sc.nextDouble();
        String phone=sc.next();
        sc.nextLine();
        String address=sc.nextLine();

        EmployeeDTO employee = new EmployeeDTO();
        employee.setNumber(number);
        employee.setName(name);
        employee.setDept(dept);
        employee.setJob(job);
        employee.setAge(age);
        employee.setGender(gender);
        employee.setSalary(salary);
        employee.setBounusPoint(bonusPoint);
        employee.setPhone(phone);
        employee.setAddress(address);

        System.out.println(employee.getNumber());
        System.out.println(employee.getName());
        System.out.println(employee.getDept());
        System.out.println(employee.getJob());
        System.out.println(employee.getAge());
        System.out.println(employee.getGender());
        System.out.println(employee.getSalary());
        System.out.println(employee.getBounusPoint());
        System.out.println(employee.getPhone());
        System.out.println(employee.getAddress());



    }
}
