package com.stackroute.spring.jdbc.model;

public class Movie
{
    private int movieId;
    private String movieName;
    private int  movieReleaseYear;
    private float movieRating;
    private Actor actor;

    public Movie()
    {

    }

    public Movie(int movieId, String movieName, int movieReleaseYear, float movieRating, Actor actor) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieReleaseYear = movieReleaseYear;
        this.movieRating = movieRating;
        this.actor = actor;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieReleaseYear() {
        return movieReleaseYear;
    }

    public void setMovieReleaseYear(int movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }

    public float getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(float movieRating) {
        this.movieRating = movieRating;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieReleaseYear=" + movieReleaseYear +
                ", movieRating=" + movieRating +
                ", actor=" + actor +
                '}';
    }
}
