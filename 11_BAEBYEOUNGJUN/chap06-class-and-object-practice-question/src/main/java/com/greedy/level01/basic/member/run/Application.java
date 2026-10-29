package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args){

        MemberDTO dto = new MemberDTO();
        dto.getId();
        System.out.println("ID : " + dto.getId());
        dto.getPwd();
        System.out.println("PWD : " + dto.getPwd());
        dto.getName();
        System.out.println("NAME : " + dto.getName());
        dto.getAge();
        System.out.println("AGE : " + dto.getAge());
        dto.getGender();
        System.out.println("GENDER : " + dto.getGender());
        dto.getPhone();
        System.out.println("PHONE : " + dto.getPhone());
        dto.getEmail();
        System.out.println("Email : " + dto.getEmail());

        dto.setId("user01");
        System.out.println("변경 후 ID : " + dto.getId());
        dto.setPwd("pass01");
        System.out.println("변경 후 PWD : " + dto.getPwd());
        dto.setName("홍길동");
        System.out.println("변경 후 NAME : " + dto.getName());
        dto.setAge(20);
        System.out.println("변경 후 AGE : " + dto.getAge());
        dto.setGender('M');
        System.out.println("변경 후 GENDER : " + dto.getGender());
        dto.setPhone("010-1234-5678");
        System.out.println("변경 후 PHONE : " + dto.getPhone());
        dto.setEmail("hong123@greedysoutv");
        System.out.println("변경 후 EMAIL : " + dto.getEmail());

    }
}
