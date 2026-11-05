package com.ohgiraffers.api.member.model.vo;

import java.time.LocalDate;

public class Member {       // 어렵다..

    private int memberNo;
    private String memberName;
    private int height;
    private int weight;
    private LocalDate birth;

    public Member() {

    }

    public Member(int memberNo, String memberName, int height, int weight, LocalDate birth) {
        super();
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.birth = birth;
    }


//    다음과 같이 회원정보를 하나의 문자열로 존재한다.
//
//    각회원별 정보의 순서는 회원번호,이름,키,몸무게,생일(yyyyMMdd)이다.
//
//```
//        "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319"
//        ```
//- memberNo : int
//- memberName : String
//- height : int
//- weight : int
//- birth : LocalDate
//- information() : String
//    각각의 회원정보를 분리해서, 회원객체에 담고, 회원객체배열에 추가한다.


    public String information() {
        return memberNo + " " + memberName + " " + height + " " + weight + " " + birth;
    }


}
