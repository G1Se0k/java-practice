package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {

        MemberDTO memberDTO = new MemberDTO();

        memberDTO.getId();
        memberDTO.getPwd();
        memberDTO.getName();
        memberDTO.getAge();
        memberDTO.getGender();
        memberDTO.getPhone();
        memberDTO.getEmail();

        memberDTO.setId("user01");
        memberDTO.setPwd("pass01");
        memberDTO.setName("홍길동");
        memberDTO.setAge(20);
        memberDTO.setGender('M');
        memberDTO.setPhone("010-1234-5678");
        memberDTO.setEmail("hong123@greedy.com");

        memberDTO.getId();
        memberDTO.getPwd();
        memberDTO.getName();
        memberDTO.getAge();
        memberDTO.getGender();
        memberDTO.getPhone();
        memberDTO.getEmail();
    }
}
