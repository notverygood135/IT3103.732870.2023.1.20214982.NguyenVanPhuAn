package AimsProject.src.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
    private String director;
    private int length;
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) tracks.add(track);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getArtist() {
        return artist;
    }
}
