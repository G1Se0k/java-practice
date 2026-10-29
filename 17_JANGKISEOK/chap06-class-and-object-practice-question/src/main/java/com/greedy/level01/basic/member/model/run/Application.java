package com.greedy.level01.basic.member.model.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {
        MemberDTO memberDTO = new MemberDTO();

        //getter를 이용해서 필드의 초기값 확인
        System.out.println("id : " + memberDTO.getId());
        System.out.println("pwd : " + memberDTO.getId());
        System.out.println("name : " + memberDTO.getId());
        System.out.println("age : " + memberDTO.getId());
        System.out.println("gender : " + memberDTO.getId());
        System.out.println("phone : " + memberDTO.getId());
        System.out.println("email : " + memberDTO.getId());

        //setter를 이용해서 필드 값 변경
        memberDTO.setId("user01");
        memberDTO.setPwd("pass01");
        memberDTO.setName("홍길동");
        memberDTO.setAge(20);
        memberDTO.setGender('M');
        memberDTO.setPhone("010-1234-5678");
        memberDTO.setEmail("hong123@greedy.com");

        //getter를 이용해서 변경된 필드값 확인
        System.out.println("변경 후 id : " + memberDTO.getId());
        System.out.println("변경 후 pwd : " + memberDTO.getId());
        System.out.println("변경 후 name : " + memberDTO.getId());
        System.out.println("변경 후 age : " + memberDTO.getId());
        System.out.println("변경 후 gender : " + memberDTO.getId());
        System.out.println("변경 후 phone : " + memberDTO.getId());
        System.out.println("변경 후 email : " + memberDTO.getId());
    }
}
