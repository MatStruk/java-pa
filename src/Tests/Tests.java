package Tests;

import main.java.Controller.Controller;
import main.java.Data.MediaItemsLibrary;
import main.java.Model.MediaItems.Book;
import main.java.Model.MediaItems.Movie;
import main.java.Model.MediaItems.Music;
import main.java.Model.Users.Manager;
import org.junit.Test;
import org.junit.Before;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class Tests {
    private MediaItemsLibrary mediaItemsLibrary = Controller.mediaItemsLibrary;
    private Manager manager = new Manager();
    private Book book = new Book("Title of Book", "Author of Book", "Name of Publisher", new Date(1990, 12, 22), "Genre of Book", 666, true);
    private Movie movie = new Movie("Title of Movie", "Author of Movie", "Name of Publisher", new Date(1995, 10, 12), "Genre of Movie", 666, true);
    private Music music = new Music("Title of Music", "Author of Music", "Name of Publisher", new Date(2015, 3, 29), "Genre of Music", 666, true);

    @Before
    public void init() {
        mediaItemsLibrary.getMediaItemsLibrary().clear(); // clears changes applied by previous tests
        mediaItemsLibrary.addMediaItemToLibrary(book);
        mediaItemsLibrary.addMediaItemToLibrary(movie);
        mediaItemsLibrary.addMediaItemToLibrary(music);
    }

    @Test
    public void testEditMediaItem() {
        int indexOfBook = mediaItemsLibrary.getMediaItemsLibrary().indexOf(book);
        manager.editMediaItem(book, "NOT Title of NOT BOOK", null, null, null, null, -1, true);
        assertEquals("NOT Title of NOT BOOK", mediaItemsLibrary.getMediaItemsLibrary().get(indexOfBook).getTitle());
    }

    @Test
    public void testSkipEditingIfNull() {
        int indexOfBook = mediaItemsLibrary.getMediaItemsLibrary().indexOf(book);
        manager.editMediaItem(book, null, null, null, null, null, -1, true);
        assertEquals("Title of Book", mediaItemsLibrary.getMediaItemsLibrary().get(indexOfBook).getTitle());
        assertEquals("Author of Book", mediaItemsLibrary.getMediaItemsLibrary().get(indexOfBook).getAuthor());
        assertEquals("Name of Publisher", mediaItemsLibrary.getMediaItemsLibrary().get(indexOfBook).getPublisher());
        assertEquals(new Date(1990, 12, 22), mediaItemsLibrary.getMediaItemsLibrary().get(indexOfBook).getDate());
        assertEquals("Genre of Book", mediaItemsLibrary.getMediaItemsLibrary().get(indexOfBook).getGenre());
        assertEquals(666, mediaItemsLibrary.getMediaItemsLibrary().get(indexOfBook).getLength());
    }

    @Test
    public void testAddMediaItem() {
        manager.addMediaItemToLibrary(book);
        assertEquals(4, mediaItemsLibrary.getMediaItemsLibrary().size());
    }

    @Test
    public void testRemoveMediaItem() {
        manager.removeMediaItemFromLibrary(book);
        assertEquals(2, mediaItemsLibrary.getMediaItemsLibrary().size());
    }
}
