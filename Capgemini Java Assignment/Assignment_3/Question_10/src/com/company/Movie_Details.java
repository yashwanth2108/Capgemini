package com.company;

public class Movie_Details {
    private String movie_Name;
    private String lead_actor;
    private String lead_actress;
    private String genre;

    public Movie_Details(String movie_Name, String lead_actor, String lead_actress, String genre) {
        this.movie_Name = movie_Name;
        this.lead_actor = lead_actor;
        this.lead_actress = lead_actress;
        this.genre = genre;
    }

    public String getMovie_Name() {
        return movie_Name;
    }

    public void setMovie_Name(String movie_Name) {
        this.movie_Name = movie_Name;
    }

    public String getLead_actor() {
        return lead_actor;
    }

    public void setLead_actor(String lead_actor) {
        this.lead_actor = lead_actor;
    }

    public String getLead_actress() {
        return lead_actress;
    }

    public void setLead_actress(String lead_actress) {
        this.lead_actress = lead_actress;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie_Details{" +
                "movie_Name='" + movie_Name + '\'' +
                ", lead_actor='" + lead_actor + '\'' +
                ", lead_actress='" + lead_actress + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
