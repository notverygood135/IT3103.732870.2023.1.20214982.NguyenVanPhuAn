package AimsProject.src.aims.media;

import AimsProject.src.aims.exception.PlayerException;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    // Nguyen Van Phu An 20214982
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

    @Override
    public void play() throws PlayerException {
        StringBuilder sb = new StringBuilder();

        if (getLength() <= 0) {
            throw new PlayerException("ERROR: CD length is non-positive!");
        } else {
            sb.append("Playing CD: " + this.getTitle() + (this.getArtist().equals("") ? "" : " by " + this.getArtist())
                    + "\n");
            sb.append("CD total length: " + this.getLength() + "\n");
            JOptionPane.showMessageDialog(null, sb.toString(), "Play CD", JOptionPane.INFORMATION_MESSAGE);
            for (Track t : tracks) {
                try {
                    t.play();
                } catch (PlayerException e) {
                    throw e;
                }
            }
        }
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

    public List<Track> getTracks() {
        return tracks;
    }

    public String toString() {
        return "CD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + " $";
    }
}
