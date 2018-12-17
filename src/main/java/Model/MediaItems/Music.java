package main.java.Model.MediaItems;

import main.java.Model.Interfaces.Listenable;

import java.util.Date;

public class Music extends MediaItem implements Listenable {
    public Music(String title, String author, String publisher, Date date, String genre, int length, boolean availability) {
        super(title, author, publisher, date, genre, length, availability);
    }

    @Override
    public LengthType getLengthType() {
        return LengthType.minutes;
    }

    @Override
    public void listen() {

    }
}
