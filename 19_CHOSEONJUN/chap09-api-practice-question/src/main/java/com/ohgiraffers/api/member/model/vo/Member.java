package com.ohgiraffers.api.member.model.vo;

import java.time.LocalDate;

public class Member {
    int memberNo;
    String memberName;
    int height;
    int weight;
    LocalDate birth;

    public Member(int memberNo, String memberName, int height, int weight, LocalDate birth) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.birth = birth;
    }

    public String information() {
        return "memberNo=" + memberNo +
                ", memberName='" + memberName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", birth=" + birth +
                '}';

    }
}
