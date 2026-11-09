package com.ohgiraffers.api.hair.model.dto;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class User {

    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private Calendar birthday;
    private Calendar reservation_date;
    private Calendar reservation_time;
    private Calendar created_at;

    public User() {
    }

    public User(int id, String first_name, String last_name, String email, String gender, Calendar birthday, Calendar reservation_date, Calendar reservation_time, Calendar created_at) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public Calendar getReservation_date() {
        return reservation_date;
    }

    public void setReservation_date(Calendar reservation_date) {
        this.reservation_date = reservation_date;
    }

    public Calendar getReservation_time() {
        return reservation_time;
    }

    public void setReservation_time(Calendar reservation_time) {
        this.reservation_time = reservation_time;
    }

    public Calendar getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Calendar created_at) {
        this.created_at = created_at;
    }

    private String format(Calendar c, String pattern) {
        if (c == null) {
            return null;
        }
        return new SimpleDateFormat(pattern).format(c.getTime());
    }





}
