package com.demo.models;

import java.time.LocalDateTime;

public class Show {
    private LocalDateTime time;
    private String address;

    private String title;
    private String director;
    private double rating;

    public Show() {
    }

    public Show(LocalDateTime time, String address, String title, String director, double rating) {
        this.time = time;
        this.address = address;
        this.title = title;
        this.director = director;
        this.rating = rating;
    }
    public LocalDateTime getTime() {
        return time;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Show [time=" + time + ", address=" + address + ", title=" + title + ", director=" + director
                + ", rating=" + rating + "]";
    }

    

}
