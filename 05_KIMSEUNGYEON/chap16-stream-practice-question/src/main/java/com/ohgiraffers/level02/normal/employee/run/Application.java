package com.ohgiraffers.level02.normal.employee.run;

import com.ohgiraffers.level02.normal.employee.model.dto.EmployeeDTO;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        // 1. 직원 6명의 리스트
        List<EmployeeDTO> employees = List.of(
                new EmployeeDTO("김도현", "개발", 4200000),
                new EmployeeDTO("이서아", "기획", 3800000),
                new EmployeeDTO("박준호", "개발", 5100000),
                new EmployeeDTO("최하린", "디자인", 3600000),
                new EmployeeDTO("정민재", "개발", 4700000),
                new EmployeeDTO("윤지아", "기획", 4500000)
        );

        // 2. 개발 부서 직원 이름
        List<String> developers = employees.stream()
                .filter(employee -> employee.getDept().equals("개발"))
                .map(EmployeeDTO::getName)
                .toList();

        System.out.println("개발 부서 : " + developers);

        // 3. 개발 부서 급여 합
        int devSalarySum = employees.stream()
                .filter(employee -> employee.getDept().equals("개발"))
                .mapToInt(EmployeeDTO::getSalary)
                .sum();

        System.out.println("개발 부서 급여 합 : " + devSalarySum + "원");

        // 4. 전체 직원 최고 급여
        int maxSalary = employees.stream()
                .mapToInt(EmployeeDTO::getSalary)
                .max()
                .orElse(0);

        System.out.println("최고 급여 : " + maxSalary + "원");

        // 5. 급여 상위 3명
        String top3 = employees.stream()
                .sorted(
                        Comparator.comparingInt(EmployeeDTO::getSalary)
                                .reversed()
                )
                .limit(3)
                .map(EmployeeDTO::getName)
                .collect(Collectors.joining(", "));

        System.out.println("급여 상위 3명 : " + top3);
    }
}