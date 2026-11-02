package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.util.StringTokenizer;

public class Run {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319", "|");
        Member[] members = new Member[st.countTokens()];

        while(st.hasMoreTokens()){
            StringTokenizer st2 = new StringTokenizer(st.nextToken(), " ");

            int memberNo = Integer.parseInt(st2.nextToken());
            String memberName = st2.nextToken();
            int height = Integer.parseInt(st2.nextToken());
            int weight = Integer.parseInt(st2.nextToken());
//            LocalDate birth = new LocalDate(1990,9,5).get();
            st2.nextToken();
        }

        System.out.println();
    }
}
