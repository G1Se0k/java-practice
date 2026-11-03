package com.ohgiraffers.api.hair.model.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private LocalDate birthday;
    private LocalDate reservation_date;
    private LocalTime reservation_time;
    private LocalDateTime created_at;

    public User(int id, String firstName, String lastName, String email, String gender, LocalDate birthday, LocalDate reservation_date, LocalTime reservation_time, LocalDateTime created_at) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.reservation_date = reservation_date;
        this.reservation_time = reservation_time;
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", reservation_date=" + reservation_date +
                ", reservation_time=" + reservation_time +
                ", created_at=" + created_at +
                '}';
    }
}
