package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
    public static void main(String[] args) {
        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        String[] member = str.split("\\|");
        Member[] members = new Member[member.length];

        for(int i=0; i< member.length; i++){
            String[] fields = member[i].split(",");
            int memberNo = Integer.parseInt(fields[0]);
            String memberName = fields[1];
            int height = Integer.parseInt(fields[2]);
            int weight = Integer.parseInt(fields[3]);
            LocalDate birth = LocalDate.parse(
                    fields[4], DateTimeFormatter.ofPattern("yyyyMMdd")
            );

            members[i] = new Member(memberNo, memberName, height, weight, birth);
        }
        for(Member m : members){
            System.out.println(m.information());
        }
    }
}
