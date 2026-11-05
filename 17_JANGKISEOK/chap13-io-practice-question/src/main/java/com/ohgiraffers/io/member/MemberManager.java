package com.ohgiraffers.io.member;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MemberManager {
    private List<Member> members;

    public MemberManager() {
        members = new ArrayList<>();
    }

    public void readMembers(){
        String path = "src/main/java/com/ohgiraffers/io/member";
        String fileName = "member.ser";
        members.clear();
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path + "/" + fileName)))) {
//            String userId = objectInputStream.readUTF();
//            String userPwd = objectInputStream.readUTF();
//            String userName = objectInputStream.readUTF();
//            String email = objectInputStream.readUTF();
//            int age = objectInputStream.readInt();
//            char gender = objectInputStream.readChar();
//            double point = objectInputStream.readDouble();

            while(true){
                Member readMember = (Member) objectInputStream.readObject();
                members.add(readMember);
            }
//            members = (ArrayList<Member>) objectInputStream.readObject();
//            Member readMember = new Member(userId,userPwd,userName,email,age,gender,point);

        } catch (EOFException e){
            System.out.println("====================================");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("등록된 회원이 없습니다.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Member member : members){
            System.out.println(member);
        }
    }
    public void addMember(Member member){
        members.add(member);

        String path = "src/main/java/com/ohgiraffers/io/member";
        String fileName = "member.ser";
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path + "/" + fileName)))) {
//            objectOutputStream.writeObject(members);
            for(Member mem : members){
                objectOutputStream.writeObject(mem);

            }
//            for(Member mem : members){
//                objectOutputStream.writeUTF(mem.getUserId());
//                objectOutputStream.writeUTF(mem.getUserPwd());
//                objectOutputStream.writeUTF(mem.getUserName());
//                objectOutputStream.writeUTF(mem.getEmail());
//                objectOutputStream.writeInt(mem.getAge());
//                objectOutputStream.writeChar(mem.getGender());
//                objectOutputStream.writeDouble(mem.getPoint());
//            }

            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
