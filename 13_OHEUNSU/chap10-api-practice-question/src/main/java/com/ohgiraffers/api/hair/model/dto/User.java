package com.ohgiraffers.api.hair.model.dto;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String birthday;
    private String reservationDate;
    private String reservationTime;
    private String createdAt;

    public User(int id, String firstName, String lastName, String email, String gender, String birthday, String reservationDate, String reservationTime, String createdAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", reservationDate='" + reservationDate + '\'' +
                ", reservationTime='" + reservationTime + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
