package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDTO employeeDTO = new EmployeeDTO();

        System.out.print(" number : ");
        employeeDTO.setNumber(sc.nextInt());
        System.out.print(" name : ");
        employeeDTO.setName(sc.next());
        System.out.print(" dept : ");
        employeeDTO.setDept(sc.next());
        System.out.print(" job : ");
        employeeDTO.setJob(sc.next());
        System.out.print(" age :  ");
        employeeDTO.setAge(sc.nextInt());
        System.out.print(" gender : ");
        employeeDTO.setGender(sc.next().charAt(0));
        System.out.print(" salary : ");
        employeeDTO.setSalary(sc.nextInt());
        System.out.print(" bonusPoint : ");
        employeeDTO.setBonusPoint(sc.nextDouble());
        System.out.print(" phone : ");
        employeeDTO.setPhone(sc.next());
        sc.nextLine();
        System.out.print(" address : ");
        employeeDTO.setAddress(sc.nextLine());

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
