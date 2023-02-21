package com.niit.domain;

import java.util.Objects;

public class Movie {
    private String movieName;
    private String movieRating;
    private String movieBoxOffice;
    private int movieId;

    public Movie() {
    }

    public Movie(String movieName, String movieRating, String movieBoxOffice, int movieId) {
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.movieBoxOffice = movieBoxOffice;
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieBoxOffice() {
        return movieBoxOffice;
    }

    public void setMovieBoxOffice(String movieBoxOffice) {
        this.movieBoxOffice = movieBoxOffice;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return getMovieId() == movie.getMovieId() && Objects.equals(getMovieName(), movie.getMovieName()) && Objects.equals(getMovieRating(), movie.getMovieRating()) && Objects.equals(getMovieBoxOffice(), movie.getMovieBoxOffice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMovieName(), getMovieRating(), getMovieBoxOffice(), getMovieId());
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieRating='" + movieRating + '\'' +
                ", movieBoxOffice='" + movieBoxOffice + '\'' +
                ", movieId=" + movieId +
                '}';
    }
}