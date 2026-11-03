package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {
        // 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
        EmployeeDTO[] employees = new EmployeeDTO[3];
        employees[0] = new EmployeeDTO();
        employees[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        employees[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for(EmployeeDTO employee : employees) {
            System.out.println(employee.information());
        }


        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
        employees[0].setEmpNo(0);
        employees[0].setEmpName("김말똥");
        employees[0].setDept("영업부");
        employees[0].setJob("팀장");
        employees[0].setAge(30);
        employees[0].setGender('M');
        employees[0].setSalary(3000000);
        employees[0].setBonusPoint(0.2);
        employees[0].setPhone("01055559999");
        employees[0].setAddress("전라도 광주");

        employees[1].setDept("기획부");
        employees[1].setJob("부장");
        employees[1].setSalary(4000000);
        employees[1].setBonusPoint(0.3);
        System.out.println("=========================================================");
        System.out.println(employees[0].information());
        System.out.println(employees[1].information());

        // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        // 연봉 = (급여 + (급여 * 보너스포인트)) * 12
        System.out.println("=========================================================");
        int totalAnnualSalary = 0;
        for (EmployeeDTO employee : employees) {
            totalAnnualSalary += employee.getAnnualSalary();
            System.out.println(employee.getEmpName() + "의 연봉: " + employee.getAnnualSalary() +"원");
        }

        // 3명의 직원의 연봉 평균을 구하여 출력
        System.out.println("=========================================================");
        int averageAnnualSalary = totalAnnualSalary / employees.length;
        System.out.println("직원들의 연봉의 평균 : " + averageAnnualSalary + "원");
    }
}
