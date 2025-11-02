package com.kaankaplan.movieService.entity.dto;

import com.kaankaplan.movieService.entity.Actor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;

@Data
@NoArgsConstructor
@Builder
public class MovieResponseDto implements Serializable {

    private int movieId;
    private String movieName;
    private String description;
    private int duration;
    private Date releaseDate;
    private boolean isDisplay;

    private int categoryId;
    private String categoryName;

    private String movieImageUrl;
    private String movieTrailerUrl;

    private String directorName;

//    private List<Actor> actors;


    public MovieResponseDto(int movieId, String movieName, String description, int duration, Date releaseDate, boolean isDisplay, int categoryId, String categoryName, String movieImageUrl, String movieTrailerUrl, String directorName) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.description = description;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.isDisplay = isDisplay;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.movieImageUrl = movieImageUrl;
        this.movieTrailerUrl = movieTrailerUrl;
        this.directorName = directorName;
    }
}
