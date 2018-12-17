package main.java.Model.MediaItems;

import java.util.Date;

public abstract class MediaItem {
    private String title;
    private String author;
    private String publisher;
    private Date date;
    private String genre;
    private int length;
    private boolean available;

    public MediaItem(String title, String author, String publisher, Date date, String genre, int length, boolean available) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.date = date;
        this.genre = genre;
        this.length = length;
        this.available = available;
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
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract LengthType getLengthType();

    public String preview() {
        StringBuilder preview = new StringBuilder();
        preview.append("Title: " + title + "\n");
        preview.append("Author: " + author + "\n");
        preview.append("Publisher: " + publisher + "\n");
        preview.append("Release: " + date + "\n");
        preview.append("Genre: " + genre + "\n");
        preview.append("Length: " + length + " " + getLengthType() + "\n");
        return preview.toString();
    }
}
