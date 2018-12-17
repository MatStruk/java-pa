package main.java.Model.MediaItems;

import main.java.Model.Interfaces.Listenable;
import main.java.Model.Interfaces.Watchable;

import java.util.Date;

public class Movie extends MediaItem implements Listenable, Watchable {
    public Movie(String title, String author, String publisher, Date date, String genre, int length, boolean availability) {
        super(title, author, publisher, date, genre, length, availability);
    }

    @Override
    public LengthType getLengthType() {
        return LengthType.minutes;
    }

    @Override
    public void listen() {

    }

    @Override
    public void watch() {

    }
}
