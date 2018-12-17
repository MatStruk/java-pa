package main.java.Controller;

import main.java.Data.MediaItemsLibrary;
import main.java.Model.MediaItems.Book;
import main.java.Model.MediaItems.Movie;
import main.java.Model.MediaItems.Music;
import main.java.Model.Users.Manager;
import main.java.Model.Users.User;
import main.java.View.View;

import java.util.Date;

public class Controller {
    public static MediaItemsLibrary mediaItemsLibrary = new MediaItemsLibrary();

    public Controller() {
        init();
    }

    public void init(){
        // Example use
        Manager manager = new Manager();
        View view = new View();
        Book book = new Book("Title of Book", "Author of Book", "Name of Publisher", new Date(1990, 12, 22), "Genre of Book", 666, true);
        Movie movie = new Movie("Title of Movie", "Author of Movie", "Name of Publisher", new Date(1995, 10, 12), "Genre of Movie", 666, true);
        Music music = new Music("Title of Music", "Author of Music", "Name of Publisher", new Date(2015, 3, 29), "Genre of Music", 666, true);
        mediaItemsLibrary.addMediaItemToLibrary(book);
        mediaItemsLibrary.addMediaItemToLibrary(movie);
        mediaItemsLibrary.addMediaItemToLibrary(music);
        view.viewAllMediaItemsInLibrary();

        manager.editMediaItem(book, "To juz sie nazywa inaczej", null, null, null, null, -1, true);
        manager.addMediaItemToLibrary(music);
        manager.addMediaItemToLibrary(movie);
        view.viewAllMediaItemsInLibrary();

        manager.removeMediaItemFromLibrary(book);
        view.viewAllMediaItemsInLibrary();
    }
}
