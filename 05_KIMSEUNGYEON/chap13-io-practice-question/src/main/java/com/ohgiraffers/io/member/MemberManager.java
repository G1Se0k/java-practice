package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {
    private Member[] members;

    private final String FILE_PATH = "src/main/java/com/ohgiraffers/io/member/members.ser";

    /* members.ser 파일 읽기 */
    public void readMembers() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {

            members = (Member[]) ois.readObject();

            for (Member member : members) {
                System.out.println(member);
            }

        } catch (FileNotFoundException e) {

            System.out.println("members.ser 파일을 찾을 수 없습니다.");

        } catch (IOException e) {

            e.printStackTrace();

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    }


    /* 회원 추가 */
    public void addMember(Member member) {

        /* members가 아직 로딩되지 않은 경우 */
        if (members == null) {

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {

                members = (Member[]) ois.readObject();

            } catch (IOException | ClassNotFoundException e) {

                members = new Member[0];
            }
        }

        /* 기존 배열보다 하나 큰 배열 생성 */
        Member[] newMembers = new Member[members.length + 1];

        /* 기존 회원 복사 */
        for (int i = 0; i < members.length; i++) {
            newMembers[i] = members[i];
        }

        /* 마지막 위치에 새 회원 추가 */
        newMembers[newMembers.length - 1] = member;

        /* 필드 변경 */
        members = newMembers;


        /*
         * 이어쓰기하지 않고
         * Member[] 전체를 덮어쓰기
         */
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {

            oos.writeObject(members);
            System.out.println("회원 추가 완료");

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
