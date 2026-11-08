package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {


    public static void main(String[] args) {

        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";


        String[] people = str.split("\\|");

        Member[] members = new Member[people.length];

        for (int i = 0; i < people.length; i++) {
            // 3. ,를 기준으로 각 정보 분리
            String[] info = people[i].split(",");

            // 4. 각 값을 변수에 저장
            int number = Integer.parseInt(info[0]);
            String name = info[1];
            int height = Integer.parseInt(info[2]);
            int weight = Integer.parseInt(info[3]);
            String birth = info[4];
            LocalDate date = LocalDate.parse(birth, DateTimeFormatter.BASIC_ISO_DATE);


            // 5. 객체를 생성하며 멤버변수에 저장
            members[i] = new Member(number, name, height, weight, date);
        }
        for (Member member : members) {
            System.out.println(member.information());
        }


    }
}
