package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.util.StringTokenizer;

public class Run {

    public static void main(String[] args) {


    String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

    StringTokenizer st = new StringTokenizer(str, "|");

    Member[] m = new Member[st.countTokens()];

    for (int i = 0; i < m.length; i++) {

    StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");

    int memberNo = Integer.parseInt(st2.nextToken());
    String memberName = st2.nextToken();
    int memberHeight = Integer.parseInt(st2.nextToken());
    int memberWeight = Integer.parseInt(st2.nextToken());

    String birthStr = st2.nextToken();

    int year = Integer.parseInt(birthStr.substring(0,4));
    int month = Integer.parseInt(birthStr.substring(4,6));
    int date = Integer.parseInt(birthStr.substring(6));

    LocalDate birth = LocalDate.of(year, month, date);

    Member member = new Member(memberNo,memberName,memberHeight,memberWeight, birth);

    m[i] = member;

    }
        for (Member mem : m) {
            System.out.println(mem.information());
        }
    }
}
