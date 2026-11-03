package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {

    public static void main(String[] args) {

        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        String[] strArr = str.split("\\|");
        Member[] members = new Member[strArr.length];

        for(int i = 0; i < strArr.length; i++){
            String[] info = strArr[i].split(",");
            if(info.length != 5){
                System.out.println("It's Impossible!!");
                break;
            }
            int memberNo = Integer.parseInt(info[0]);
            String memberName = info[1];
            int height = Integer.parseInt(info[2]);
            int weight = Integer.parseInt(info[3]);
            LocalDate birth = LocalDate.parse(info[4], DateTimeFormatter.ofPattern("yyyyMMdd"));

            members[i] = new Member(memberNo, memberName, height, weight, birth);
        }
        for(Member member: members){
            System.out.println(member.information());
        }
    }
}
