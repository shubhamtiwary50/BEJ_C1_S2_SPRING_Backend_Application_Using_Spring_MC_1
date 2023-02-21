package com.niit.domain;

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
}