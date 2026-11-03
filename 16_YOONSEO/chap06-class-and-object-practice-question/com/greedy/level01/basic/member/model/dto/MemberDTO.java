package com.greedy.level01.basic.member.model.dto;

public class MemberDTO {
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;

    public MemberDTO() {
    } // 기본 생성자

    // getters: 필드값 리턴용 메서드, setter : 필드 수정용 메서드
    public String getId() {
        System.out.println(id);
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        System.out.println(pwd);
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        System.out.println(gender);
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        System.out.println(phone);
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        System.out.println(email);
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
