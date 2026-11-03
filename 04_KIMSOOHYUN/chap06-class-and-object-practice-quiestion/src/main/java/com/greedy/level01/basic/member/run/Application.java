package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {

        //getter를 이용해서 필드의 초기값 확인
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("id : " + memberDTO.getId());
        System.out.println("pwd : " + memberDTO.getPwd());
        System.out.println("name : " + memberDTO.getName());
        System.out.println("age : " + memberDTO.getAge());
        System.out.println("gender : " + memberDTO.getGender());
        System.out.println("phone : " + memberDTO.getPhone());
        System.out.println("email : " + memberDTO.getEmail());

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
        System.out.println("변경 후 pwd : " + memberDTO.getPwd());
        System.out.println("변경 후 name : " + memberDTO.getName());
        System.out.println("변경 후 age : " + memberDTO.getAge());
        System.out.println("변경 후 gender : " + memberDTO.getGender());
        System.out.println("변경 후 phone : " + memberDTO.getPhone());
        System.out.println("변경 후 email : " + memberDTO.getEmail());

    }

}

//id : null
//pwd : null
//name : null
//age : 0
//gender :
//phone : null
//email : null
//변경 후 id : user01
//변경 후 pwd : pass01
//변경 후 name : 홍길동
//변경 후 age : 20
//변경 후 gender : M
//변경 후 phone : 010-1234-5678
//변경 후 email : hong123@greedy.com