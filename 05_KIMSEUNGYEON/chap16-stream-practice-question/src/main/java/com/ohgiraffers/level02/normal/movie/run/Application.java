package com.ohgiraffers.level02.normal.movie.run;

import com.ohgiraffers.level02.normal.movie.model.Genre;
import com.ohgiraffers.level02.normal.movie.model.dto.MovieDTO;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        // 1. 영화 6편 리스트
        List<MovieDTO> movies = List.of(
                new MovieDTO("질주하는 밤", Genre.ACTION, 8.1, 3200000),
                new MovieDTO("엉뚱한 이웃", Genre.COMEDY, 7.9, 1500000),
                new MovieDTO("겨울 편지", Genre.DRAMA, 9.2, 2600000),
                new MovieDTO("마지막 임무", Genre.ACTION, 7.6, 2800000),
                new MovieDTO("웃음 배달부", Genre.COMEDY, 8.4, 2100000),
                new MovieDTO("작은 정원", Genre.DRAMA, 8.8, 1900000)
        );

        // 2. 장르별 편수와 관객 합계
        for (Genre genre : Genre.values()) {

            long count = movies.stream()
                    .filter(movie -> movie.getGenre() == genre)
                    .count();

            int audienceSum = movies.stream()
                    .filter(movie -> movie.getGenre() == genre)
                    .mapToInt(MovieDTO::getAudience)
                    .sum();

            System.out.println(genre.getLabel() + " : " + count + "편, 관객 " + audienceSum + "명");
        }

        // 3. reduce로 최고 평점 영화 찾기
        MovieDTO bestMovie = movies.stream()
                .reduce((movie1, movie2) ->
                        movie1.getRating() >= movie2.getRating()
                                ? movie1
                                : movie2
                )
                .orElse(null);

        if (bestMovie != null) {
            System.out.println("최고 평점 : " + bestMovie.getTitle() + " (" + bestMovie.getRating() + ")");
        }
    }
}