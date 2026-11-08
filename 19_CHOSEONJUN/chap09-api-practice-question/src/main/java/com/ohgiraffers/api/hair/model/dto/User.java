package com.ohgiraffers.api.hair.model.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class User {

    int id;
    String first_name;
    String last_name;
    String email;
    String gender;
    LocalDate birthday;
    LocalDate reservation_date;
    LocalTime reservation_time;
    LocalDateTime created_at;

    public User(int id, String first_name, String last_name, String email, String gender
            , LocalDate birthday, LocalDate reservation_date, LocalTime reservation_time
            , LocalDateTime created_at) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
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
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", reservation_date='" + reservation_date + '\'' +
                ", reservation_time='" + reservation_time + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }
}
