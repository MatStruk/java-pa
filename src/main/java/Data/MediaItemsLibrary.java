package main.java.Data;

import main.java.Model.MediaItems.Book;
import main.java.Model.MediaItems.MediaItem;

import java.util.ArrayList;
import java.util.List;

public class MediaItemsLibrary {

    public List<MediaItem> mediaItemsLibrary = new ArrayList<>();

    public List<MediaItem> getMediaItemsLibrary() {
        return mediaItemsLibrary;
    }

    public void setMediaItemsLibrary(List<MediaItem> mediaItemsLibrary) {
        this.mediaItemsLibrary = mediaItemsLibrary;
    }

    public void addMediaItemToLibrary(Book book) {
        mediaItemsLibrary.add(book);
    }

    public void removeMediaItemFromLibrary(Book book) {
        mediaItemsLibrary.remove(book);
    }
}
