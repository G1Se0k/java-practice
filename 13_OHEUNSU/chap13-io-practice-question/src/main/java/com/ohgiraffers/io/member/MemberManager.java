package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {

    private Member[] members;
    private int count;

    {
        members = new Member[10];
        count = 0;
    }

    public void readMembers(){

        try(ObjectInputStream oi = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/io/member/members.ser")))) {

            members = new Member[10];
            count = 0;
            Member member = (Member) oi.readObject();
            while (member != null) {
                members[count++] = member;
                System.out.println(member);
                member = (Member) oi.readObject();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void addMember(Member member){

        if (member != null) {
            members[count++] = member;
            try (ObjectOutputStream oo = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/io/member/members.ser")))) {

                for (Member mem: members){
                    oo.writeObject(mem);
                }
                oo.flush();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
