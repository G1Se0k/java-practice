package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO[] emp = new EmployeeDTO[3];
        emp[0] = new EmployeeDTO();
        emp[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        emp[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for(int i = 0; i < 3; i++){
            System.out.println("emp[" + i + "] : " +emp[i].information());
        }
        emp[0] = new EmployeeDTO(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        emp[1] = new EmployeeDTO(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");
        System.out.println("================================================================================");
        for(int i = 0; i < 2; i++){
            System.out.println("emp[" + i + "] : " +emp[i].information());
        }
        System.out.println("================================================================================");
        int totalSalary = 0;
        for(EmployeeDTO employeeDTO: emp){
            String[] arr = employeeDTO.information().split(", ");

            int salary = Integer.parseInt(arr[6]);
            double bonusPoint = Double.parseDouble(arr[7]);
            int total = (int) ((salary + (salary * bonusPoint)) * 12);
            totalSalary += total;
            System.out.println(arr[1] + "의 연봉 : " + total + "원");
        }
        System.out.println("================================================================================");
        System.out.println("직원들의 연봉의 평균 : " + (totalSalary / 3) + "원");
    }
}
