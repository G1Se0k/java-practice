package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {


        EmployeeDTO employeeDTO1 = new EmployeeDTO();
        EmployeeDTO employeeDTO2 = new EmployeeDTO(1,"홍길동",19,'M',"0102223333");
        EmployeeDTO employeeDTO3 = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        EmployeeDTO[] employeeDTOS = new EmployeeDTO[3];
        employeeDTOS[0] = employeeDTO1;
        employeeDTOS[1] = employeeDTO2;
        employeeDTOS[2] = employeeDTO3;

        int cnt =0;
        for(EmployeeDTO em: employeeDTOS){
            System.out.println("emp["+cnt+"] : "+em.information());
            cnt++;
        }

        System.out.println("=================================================================");
        employeeDTO1.setEmpNo(0); employeeDTO1.setDept("영업부");
        employeeDTO1.setJob("팀장"); employeeDTO1.setAge(30);
        employeeDTO1.setGender('M'); employeeDTO1.setSalary(300000);
        employeeDTO1.setBonusPoint(0.2); employeeDTO1.setPhone("01055559999");
        employeeDTO1.setAddress("전라도 광주");

         employeeDTO2.setDept("기획부");
        employeeDTO2.setJob("부장"); employeeDTO2.setAge(19);
        employeeDTO2.setGender('M'); employeeDTO2.setSalary(400000);
        employeeDTO2.setBonusPoint(0.3);

        cnt =0;
        for(EmployeeDTO em: employeeDTOS){
            System.out.println("emp["+cnt+"] : "+em.information());
            cnt++;
            if(cnt ==2){break;}
        }

        System.out.println("=================================================================");

        int total = 0;

        for(int i =0; i<employeeDTOS.length; i++){

            String n =employeeDTOS[i].getEmpName();
            int sal = employeeDTOS[i].getSalary();
            double b= employeeDTOS[i].getBonusPoint();

            int result = (int) (sal +(sal*(b))*12);
            total +=result;

            System.out.println(n+"의 연봉 : " + result + "원");

        }

        System.out.println("=================================================================");
        System.out.println("직원들의 연봉의 평균 : " + total/3 + "원");

    }
}
