package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {
        // 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
        EmployeeDTO[] emp = new EmployeeDTO[3];
        emp[0] = new EmployeeDTO();
        emp[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        emp[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
        for (int i = 0; i < emp.length; i++) {
            EmployeeDTO e = emp[i];
            System.out.println(e.information());
        }

        System.out.println("=================================================================");
        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
        EmployeeDTO e = emp[0];
        e.setEmpName("김말똥");
        e.setDept("영업부");
        e.setJob("팀장");
        e.setAge(30);
        e.setGender('M');
        e.setSalary(3000000);
        e.setBonusPoint(0.2);
        e.setPhone("01055559999");
        e.setAddress("전라도 광주");

        e = emp[1];
        e.setDept("기획부");
        e.setJob("부장");
        e.setSalary(4000000);
        e.setBonusPoint(0.3);

        for (int i = 0; i < 2; i++) {
            EmployeeDTO employeeDTO = emp[i];
            System.out.println(employeeDTO.information());
        }
        System.out.println("=================================================================");
    // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
    // 연봉 = (급여 + (급여 * 보너스포인트)) * 12
        double sum = 0;
        for(EmployeeDTO edto : emp){
            double money = ((double)edto.getSalary()+(edto.getBonusPoint()*edto.getSalary()))*12;
            sum += money;
            System.out.println(edto.getEmpName()+ "의 연봉  : "+money+"원" );
        }
        System.out.println("=================================================================");
        System.out.println("직원들의 연봉의 평균 : " +(int)sum/3+"원");

    }
}
