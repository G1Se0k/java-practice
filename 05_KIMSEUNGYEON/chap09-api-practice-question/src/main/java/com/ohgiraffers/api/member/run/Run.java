package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;

public class Run {

    public static void main(String[] args) {

        // memberNo, memberName, height, weight, birth 순
        String memberInfos = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        String[] memberInfoArray = memberInfos.split("\\|");

        for(String memberInfo : memberInfoArray) {
            String[] memberInfoSplit = memberInfo.split(",");

            int memberNo = Integer.parseInt(memberInfoSplit[0]);
            String memberName = memberInfoSplit[1];
            int height = Integer.parseInt(memberInfoSplit[2]);
            int weight = Integer.parseInt(memberInfoSplit[3]);
            String birthStr = memberInfoSplit[4];

            int year = Integer.parseInt(birthStr.substring(0, 4));
            int month = Integer.parseInt(birthStr.substring(4, 6));
            int day = Integer.parseInt(birthStr.substring(6, 8));

            LocalDate birth = LocalDate.of(year, month, day);

            Member member = new Member(memberNo, memberName, height, weight, birth);

            System.out.println(member.information());
        }
    }
}
