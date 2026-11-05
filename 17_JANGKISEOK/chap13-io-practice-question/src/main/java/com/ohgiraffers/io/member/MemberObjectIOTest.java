package com.ohgiraffers.io.member;

public class MemberObjectIOTest {
    public static void main(String[] args) {
        MemberManager memberManager = new MemberManager();
        //@실습문제
        // 1.members.ser r파일읽어서 출력하기
        memberManager.readMembers();
        // 2.회원추가 : MemberManager#addMember(Member):void
        // Member객체를 Member[]에 추가후, Member[]를 members.ser파일에 출력 작업
        Member member = new Member("user04", "1234", "신사임당", "sinsa@sh.org",
                300, '여', 9000.0);
        memberManager.addMember(member);
        // 3. 결과확인 : 추가된 회원까지 확인
        memberManager.readMembers();
    }
}