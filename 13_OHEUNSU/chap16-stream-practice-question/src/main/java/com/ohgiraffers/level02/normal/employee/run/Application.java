package com.ohgiraffers.level02.normal.employee.run;

import com.ohgiraffers.level02.normal.employee.model.dto.EmployeeDTO;

import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        List<EmployeeDTO> employeeList = List.of(
                new EmployeeDTO("김도현", "개발", 4200000),
                new EmployeeDTO("이서아", "기획", 3800000),
                new EmployeeDTO("박준호", "개발", 5100000),
                new EmployeeDTO("최하린", "디자인", 3600000),
                new EmployeeDTO("정민재", "개발", 4700000),
                new EmployeeDTO("윤지아", "기획", 4500000)
        );

        System.out.println("개발 부서 : " + employeeList.stream().
                filter(employee -> employee.getDept().equals("개발")).
                map(EmployeeDTO::getName).
                collect(Collectors.joining(", ", "[", "]")));
        System.out.println("개발 부서 급여 합 : " + employeeList.stream().
                filter(employee -> employee.getDept().equals("개발")).
                map(EmployeeDTO::getSalary).
                reduce(Integer::sum).get());
        System.out.println("최고 급여 : " + employeeList.stream().
                map(EmployeeDTO::getSalary).
                max(Integer::compareTo).get());
        System.out.println("급여 상위 3명 : " + String.join(", ", employeeList.stream().
                sorted((e1, e2) -> e2.getSalary() - e1.getSalary()).
                map(EmployeeDTO::getName).
                toList().
                subList(0, 3)));
    }
}
