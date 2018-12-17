package main.java.View;

import main.java.Controller.Controller;
import main.java.Model.MediaItems.MediaItem;

public class View {
    public void preview(MediaItem mediaItem) {
        // TODO: use mediaItem.preview to display mediaItem's data. Use getType to print length type
    }

    public void viewAllMediaItemsInLibrary() {
        for (MediaItem mediaItem : Controller.mediaItemsLibrary.getMediaItemsLibrary()) {
            System.out.println(mediaItem.preview());
        }
    }
}
