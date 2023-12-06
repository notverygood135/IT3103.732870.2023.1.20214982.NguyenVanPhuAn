package AimsProject.src.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media item1, Media item2) {
        int compareCostTitle = item1.getTitle().compareTo(item2.getTitle());
        if (compareCostTitle == 0) {
            return Float.compare(item1.getCost(), item2.getCost());
        }
        return compareCostTitle;
    }
}
