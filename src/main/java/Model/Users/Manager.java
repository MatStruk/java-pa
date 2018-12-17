package main.java.Model.Users;

import main.java.Controller.Controller;
import main.java.Model.MediaItems.Book;
import main.java.Model.MediaItems.MediaItem;

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
            book.setAvailable(availability);
        }
    }

    private boolean isValidLength(int length){
        return length >= 5; // let's assume that 5 is a minimum length of a book
    }

    public void addMediaItemToLibrary(MediaItem mediaItem) {
        Controller.mediaItemsLibrary.addMediaItemToLibrary(mediaItem);
    }

    public void removeMediaItemFromLibrary(MediaItem mediaItem) {
        Controller.mediaItemsLibrary.removeMediaItemFromLibrary(mediaItem);
    }
}
