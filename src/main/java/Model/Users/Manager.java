package main.java.Model.Users;

import main.java.Controller.Controller;
import main.java.Model.MediaItems.Book;

import java.util.Date;

public class Manager {
    public void editMediaItem(Book book, String title, String author, String publisher, Date date, String genre, int length, boolean availability) {
        if (book != null) {
            if (title != null) {
                book.setTitle(title);
            }
            if (author != null) {
                book.setAuthor(author);
            }
            if (publisher != null) {
                book.setPublisher(publisher);
            }
            if (date != null) {
                book.setDate(date);
            }
            if (genre != null) {
                book.setGenre(genre);
            }
            if (length != -1) {
                if (isValidLength(length)) {
                    book.setLength(length);
                }
            }
            book.setAvailability(availability);
        }
    }

    public boolean isValidLength(int length){
        return length >= 5;
    }

    public void addMediaItemToLibrary(Book book) {
        Controller.mediaItemsLibrary.addMediaItemToLibrary(book);
    }

    public void removeMediaItemFromLibrary(Book book) {
        Controller.mediaItemsLibrary.removeMediaItemFromLibrary(book);
    }
}
