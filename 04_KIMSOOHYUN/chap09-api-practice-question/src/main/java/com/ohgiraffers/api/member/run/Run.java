package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Run {

    public static void main(String[] args) {


        String info = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        StringTokenizer tokenizer = new StringTokenizer(info, "|");         // 토큰만들어서 |빼기

        String[] infoArr = new String[tokenizer.countTokens()];     // 토크나이저는 스트링으로 받아줘야함
        int num = 0;    // 반복문에서 올릴 숫자

        while (tokenizer.hasMoreTokens()) {     // 토큰 있으면?
            while(num < infoArr.length) {       // 넘버0 < 전체3
                infoArr[num] = tokenizer.nextToken();       // 토큰 하나씩 스트링배열에 넣어줌
                num++;
            }
        }

        Member member[] = new Member[tokenizer.countTokens()];      // 멤버 객체
        for (int i = 0; i < infoArr.length; i++) {
            String[] infoSplit = infoArr[i].split(",");         // 스트링배열에서 ,을 스플릿해서 하나하나 분리해서 새 스트링배열에 넣어줌
            member[i] = new Member(Integer.parseInt(infoSplit[0]), infoSplit[1], Integer.parseInt(infoSplit[2]),
                    Integer.parseInt(infoSplit[3]),
                    LocalDate.parse(infoSplit[4], DateTimeFormatter.ofPattern("yyyyMMdd")));
        }
        for (Member m :  member) {
            System.out.println(m.information());
        }
    }
}
