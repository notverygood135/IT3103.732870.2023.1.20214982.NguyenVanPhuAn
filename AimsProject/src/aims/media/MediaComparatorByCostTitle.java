package AimsProject.src.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media item1, Media item2) {
        int compareCost = Float.compare(item1.getCost(), item2.getCost());
        if (compareCost == 0) {
            return item1.getTitle().compareTo(item2.getTitle());
        }
        return compareCost;
    }
}
