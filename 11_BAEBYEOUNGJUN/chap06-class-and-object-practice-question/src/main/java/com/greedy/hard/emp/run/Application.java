package com.greedy.hard.emp.run;

import com.greedy.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDTO dto = new EmployeeDTO();
        System.out.println("number : ");
        int dtoNum = sc.nextInt();
        dto.setNumber(dtoNum);
        sc.nextLine();
        System.out.println("name : ");
        String dtoName = sc.nextLine();
        dto.setName(dtoName);
        System.out.println("dept : ");
        String dtoDept = sc.nextLine();
        dto.setDept(dtoDept);
        System.out.println("job : ");
        String dtoJob = sc.nextLine();
        dto.setJob(dtoJob);
        System.out.println("age : ");
        int dtoAge = sc.nextInt();
        dto.setAge(dtoAge);
        System.out.println("gender : ");
        char dtoGender = sc.next().charAt(0);
        dto.setGender(dtoGender);
        System.out.println("salary : ");
        int dtoSalary = sc.nextInt();
        dto.setSalary(dtoSalary);
        System.out.println("bonusPoint : ");
        double dtoBonus = sc.nextDouble();
        dto.setBonusPoint(dtoBonus);
        sc.nextLine();
        System.out.println("phone : ");
        String dtoPhone = sc.nextLine();
        dto.setPhone(dtoPhone);
        System.out.println("address : ");
        String dtoAddress = sc.nextLine();
        dto.setAddress(dtoAddress);


        System.out.println(dto.getNumber());
        System.out.println(dto.getName());
        System.out.println(dto.getDept());
        System.out.println(dto.getJob());
        System.out.println(dto.getAge());
        System.out.println(dto.getGender());
        System.out.println(dto.getSalary());
        System.out.println(dto.getBonusPoint());
        System.out.println(dto.getPhone());
        System.out.println(dto.getAddress());
    }
}
