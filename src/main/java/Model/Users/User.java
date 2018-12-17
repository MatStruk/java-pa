package main.java.Model.Users;

import main.java.Model.MediaItems.MediaItem;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<MediaItem> rentedMediaItems = new ArrayList<>();
    List<MediaItem> reservedMediaItems = new ArrayList<>();

    public List<MediaItem> searchForMediaItems(String pharse) {
        // TODO: convert pharse to lowerCase, create temporary List<MediaItem> and add there all matching single items.
        // Consider creating method mediaItemKeywords which will convert all data into for example lowerCase String, then
        // use contains
        List<MediaItem> temporary = new ArrayList<>();
        return temporary;
    }

    public void previewMediaItem() {
        // TODO
    }

    public void rentMediaItem(MediaItem mediaItem) {
        // TODO
    }

    public void returnMediaItem(MediaItem mediaItem) {
        // TODO
    }

    public void reserveMediaItem(MediaItem mediaItem) {
        // TODO
    }

    public boolean checkWhetherMediaItemIsAvailable(MediaItem mediaItem) {
        // TODO
        return false;
    }
}
