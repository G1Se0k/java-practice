package com.ohgiraffers.level02.normal.movie.run;

import com.ohgiraffers.level02.normal.movie.model.Genre;
import com.ohgiraffers.level02.normal.movie.model.dto.MovieDTO;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        List<MovieDTO> movies = List.of(
                new MovieDTO("질주하는 밤", Genre.ACTION, 8.1, 3200000),
                new MovieDTO("엉뚱한 이웃", Genre.COMEDY, 7.9, 1500000),
                new MovieDTO("겨울 편지", Genre.DRAMA, 9.2, 2600000),
                new MovieDTO("마지막 임무", Genre.ACTION, 7.6, 2800000),
                new MovieDTO("웃음 배달부", Genre.COMEDY, 8.4, 2100000),
                new MovieDTO("작은 정원", Genre.DRAMA, 8.8, 1900000)
        );

        Map<Genre, List<MovieDTO>> moviesByGenre = movies.stream()
                .collect(Collectors.groupingBy(MovieDTO::getGenre));

        for (Genre genre : Genre.values()) {
            List<MovieDTO> genreMovies = moviesByGenre.getOrDefault(genre, List.of());

            long count = genreMovies.size();
            long totalAudience = genreMovies.stream()
                    .mapToLong(MovieDTO::getAudience)
                    .sum();

            System.out.println(genre.getLabel() + " : " + count + "편, 관객 " + totalAudience + "명");
        }

        movies.stream()
                .reduce((m1, m2) -> m1.getRating() >= m2.getRating() ? m1 : m2)
                .ifPresent(topMovie -> System.out.println(
                        "최고 평점 : " + topMovie.getTitle() + " (" + topMovie.getRating() + ")"
                ));

    }
}
