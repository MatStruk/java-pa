package main.java.Model.MediaItems;

import java.util.Date;
import main.java.Model.Interfaces.Readable;

public class Book extends MediaItem implements Readable {
    public Book(String title, String author, String publisher, Date date, String genre, int length, boolean availability) {
        super(title, author, publisher, date, genre, length, availability);
    }

    @Override
    public LengthType getLengthType() {
        return LengthType.minutes;
    }

    @Override
    public void read() {

    }
}
