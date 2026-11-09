package com.ohgiraffers.level02.normal.movie.model.dto;

import com.ohgiraffers.level02.normal.movie.model.Genre;

public class MovieDTO {

    private String title;
    private Genre genre;
    private double rating;
    private int audience;

    public MovieDTO(String title, Genre genre,
                    double rating, int audience) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.audience = audience;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public int getAudience() {
        return audience;
    }
}