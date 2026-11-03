package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Run {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319", "|");
        Member[] members = new Member[st.countTokens()];

        int count = 0;

        while(st.hasMoreTokens()){
            StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");
            int memberNo = Integer.parseInt(st2.nextToken());
            String memberName = st2.nextToken();
            int height = Integer.parseInt(st2.nextToken());
            int weight = Integer.parseInt(st2.nextToken());
            String birth = st2.nextToken();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

            members[count++] = new Member(memberNo,memberName,height,weight, LocalDate.parse(birth, formatter));
        }

        for(Member member : members){
            System.out.println(member.information());
        }

        System.out.println();
    }
}
