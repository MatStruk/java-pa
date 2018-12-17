package main.java.Model.MediaItems;

import java.util.Date;

public abstract class MediaItem {
    private String title;
    private String author;
    private String publisher;
    private Date date;
    private String genre;
    private int Length;
    private boolean availability;

    public MediaItem(String title, String author, String publisher, Date date, String genre, int length, boolean availability) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.date = date;
        this.genre = genre;
        Length = length;
        this.availability = availability;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public abstract LengthType getLengthType();
}
