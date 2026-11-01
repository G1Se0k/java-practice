package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
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

        sc.nextLine();
        System.out.print("gender : ");
        char gender = sc.nextLine().charAt(0);

        System.out.print("salary : ");
        int salary = sc.nextInt();

        System.out.print("bonusPoint : ");
        float bonusPoint = sc.nextFloat();

        System.out.print("phone : ");
        String phone = sc.next();

        System.out.print("address : ");
        String address = sc.next();




        EmployeeDTO emp1 = new EmployeeDTO();
        emp1.setNumber(number);
        emp1.setName(name);
        emp1.setDept(dept);
        emp1.setJob(job);
        emp1.setAge(age);
        emp1.setGender(gender);
        emp1.setSalary(salary);
        emp1.setBonusPoint(bonusPoint);
        emp1.setPhone(phone);
        emp1.setAddress(address);


        System.out.println(emp1.getNumber());
        System.out.println(emp1.getName());
        System.out.println(emp1.getDept());
        System.out.println(emp1.getJob());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getGender());
        System.out.println(emp1.getSalary());
        System.out.println(emp1.getBonusPoint());
        System.out.println(emp1.getPhone());
        System.out.println(emp1.getAddress());





    }
}
