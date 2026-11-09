package com.ohgiraffers.io.member;

public class MemberObjectIOTest {
    public static void main(String[] args) {

        MemberManager memberManager = new MemberManager();

        // 1. members.ser 파일 읽어서 출력
        System.out.println("===== 기존 회원 =====");
        memberManager.readMembers();

        // 2. 새로운 회원 생성
        Member member = new Member(
                "user04",
                "1234",
                "신사임당",
                "sinsa@sh.org",
                300,
                '여',
                9000.0
        );

        // 회원 추가
        memberManager.addMember(member);

        // 3. 결과 확인
        System.out.println();
        System.out.println("===== 회원 추가 후 =====");

        memberManager.readMembers();
    }
}
