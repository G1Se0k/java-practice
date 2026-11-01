package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {

    public static void main(String[] args) {

        // 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력

        EmployeeDTO[] earr = new EmployeeDTO[3];
        earr[0] = new EmployeeDTO();
        ;
        earr[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        earr[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");


        for (EmployeeDTO emp : earr) {
            System.out.println("emp[" + emp.getEmpNo() + "] : " + emp.information());
        }

        System.out.println("==============================================");

        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
        earr[0].setEmpNo(0);
        earr[0].setEmpName("김말똥");
        earr[0].setDept("영업부");
        earr[0].setJob("팀장");
        earr[0].setAge(30);
        earr[0].setGender('M');
        earr[0].setSalary(3000000);
        earr[0].setBonusPoint(0.2);
        earr[0].setPhone("01055559999");
        earr[0].setAddress("전라도 광주");

        earr[1].setDept("기획부");
        earr[1].setJob("부장");
        earr[1].setSalary(4000000);
        earr[1].setBonusPoint(0.3);
        earr[1].setAddress("서울 잠실");

        System.out.println("emp[" + earr[0].getEmpNo() + "] : " + earr[0].information());
        System.out.println("emp[" + earr[1].getEmpNo() + "] : " + earr[1].information());

        System.out.println("==============================================");

        // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        int salary1 = (int) ((earr[0].getSalary()) * 12 * (1 + earr[0].getBonusPoint()));
        int salary2 = (int) ((earr[1].getSalary()) * 12 * (1 + earr[1].getBonusPoint()));
        int salary3 = (int) ((earr[2].getSalary()) * 12 * (1 + earr[2].getBonusPoint()));
        System.out.println(earr[0].getEmpName() + "의 연봉 : " + salary1 + "원");
        System.out.println(earr[1].getEmpName() + "의 연봉 : " + salary2 + "원");
        System.out.println(earr[2].getEmpName() + "의 연봉 : " + salary3 + "원");

        System.out.println("==============================================");

        // 연봉 = (급여 + (급여 * 보너스포인트)) * 12
        // 3명의 직원의 연봉 평균을 구하여 출력

        int avg = (salary1 + salary2 + salary3) / 3;
        System.out.println("직원들의 연봉의 평균 : " + avg + "원");

    }
}
