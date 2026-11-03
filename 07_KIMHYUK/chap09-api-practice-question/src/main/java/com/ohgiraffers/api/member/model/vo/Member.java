package com.ohgiraffers.api.member.model.vo;

import java.time.LocalDate;

public class Member {

    private int memberNo;
    private String memberName;
    private int height;
    private int weight;
    private LocalDate birth;

    public Member() {
    }

    public Member(int memberNo, String memberName, int height, int weight, LocalDate birth) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.birth = birth;
    }

    public String information() {
        return "회원번호 : " + memberNo + ", 회원 이름 : " + memberName + ", 회원 키 : " + height +
                ", 회원 몸무게 : " + weight + ", 회원 생일 : " + birth;
    }
}
