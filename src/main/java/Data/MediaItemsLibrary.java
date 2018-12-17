package main.java.Data;

import main.java.Model.MediaItems.MediaItem;

import java.util.ArrayList;
import java.util.List;

public class MediaItemsLibrary {

    public List<MediaItem> mediaItemsLibrary = new ArrayList<>();

    public List<MediaItem> getMediaItemsLibrary() {
        return mediaItemsLibrary;
    }

    public void addMediaItemToLibrary(MediaItem mediaItem) {
        mediaItemsLibrary.add(mediaItem);
    }

    public void removeMediaItemFromLibrary(MediaItem mediaItem) {
        mediaItemsLibrary.remove(mediaItem);
    }
}
