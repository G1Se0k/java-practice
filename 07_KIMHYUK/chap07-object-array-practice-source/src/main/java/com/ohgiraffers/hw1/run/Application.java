package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO[] emp = new EmployeeDTO[3];

        emp[0] = new EmployeeDTO();
        emp[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        emp[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F',
                1000000, 0.01, "01011112222", "서울 마곡");

        System.out.println("emp[0] : " + emp[0].information());
        System.out.println("emp[1] : " + emp[1].information());
        System.out.println("emp[2] : " + emp[2].information());

        emp[0].setEmpNo(0);
        emp[0].setEmpName("김말똥");
        emp[0].setDept("영업부");
        emp[0].setJob("팀장");
        emp[0].setAge(30);
        emp[0].setGender('M');
        emp[0].setSalary(3000000);
        emp[0].setBonusPoint(0.2);
        emp[0].setPhone("01055559999");
        emp[0].setAddress("전라도 광주");

        System.out.println("=======================================================================");

        emp[1].setDept("기획부");
        emp[1].setJob("부장");
        emp[1].setSalary(4000000);
        emp[1].setBonusPoint(0.3);

        System.out.println("emp[0] : " + emp[0].information());
        System.out.println("emp[1] : " + emp[1].information());

        System.out.println("=======================================================================");

        int income1 = (int) ((emp[0].getSalary() + (emp[0].getSalary() * emp[0].getBonusPoint())) * 12);
        int income2 = (int) ((emp[1].getSalary() + (emp[1].getSalary() * emp[1].getBonusPoint())) * 12);
        int income3 = (int) ((emp[2].getSalary() + (emp[2].getSalary() * emp[2].getBonusPoint())) * 12);


        System.out.println("김말똥의 연봉 : " + income1 + "원");
        System.out.println("홍길동의 연봉 : " + income2 + "원");
        System.out.println("강말순의 연봉 : " + income3 + "원");

        System.out.println("=======================================================================");

        int avg = (income1 + income2 + income3) / 3;

        System.out.println("직원들의 연봉의 평균 : " + avg + "원");
    }
}
