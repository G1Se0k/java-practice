package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemeberDTO;

public class Application {
    public static void main(String[] args) {

        MemeberDTO memeberDTO = new MemeberDTO();
        System.out.println("id: "+memeberDTO.getId());
        System.out.println("pwd: "+memeberDTO.getPwd());
        System.out.println("name: "+memeberDTO.getName());
        System.out.println("age: "+memeberDTO.getName());
        System.out.println("gender: "+ memeberDTO.getGender());
        System.out.println("phone: "+ memeberDTO.getPhone());
        System.out.println("email: "+ memeberDTO.getEmail());

        memeberDTO.setId("user01");
        memeberDTO.setPwd("pass01");
        memeberDTO.setName("홍길동");
        memeberDTO.setAge(20);
        memeberDTO.setGender('M');
        memeberDTO.setPhone("010-1234-5678");
        memeberDTO.setEmail("hong123@greedy.com");

        System.out.println("변경 후 id: "+memeberDTO.getId());
        System.out.println("변경 후 pwd: "+memeberDTO.getPwd());
        System.out.println("변경 후 name: "+memeberDTO.getName());
        System.out.println("변경 후 age : "+memeberDTO.getName());
        System.out.println("변경 후 gender : "+ memeberDTO.getGender());
        System.out.println("변경 후 phone: "+ memeberDTO.getPhone());
        System.out.println("변경 후 email: "+ memeberDTO.getEmail());




    }
}
