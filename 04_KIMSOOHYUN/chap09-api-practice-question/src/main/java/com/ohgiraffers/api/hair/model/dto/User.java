package com.ohgiraffers.api.hair.model.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class User {

    int id;
    String firstName;
    String lastName;
    String email;
    String gender;
    LocalDate birthday;
    LocalDate reservationDate;
    LocalTime reservationTime;
    LocalDateTime createdAt;

    public User() {
    }

    public User(int id, String firstName, String lastName, String email, String gender, LocalDate birthday, LocalDate reservationDate, LocalTime reservationTime, LocalDateTime createdAt) {
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
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", reservationDate=" + reservationDate +
                ", reservationTime=" + reservationTime +
                ", createdAt=" + createdAt +
                '}';
    }



}
