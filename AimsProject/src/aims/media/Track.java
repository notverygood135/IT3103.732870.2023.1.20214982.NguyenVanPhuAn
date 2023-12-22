package AimsProject.src.aims.media;

import AimsProject.src.aims.exception.PlayerException;

public class Track implements Playable{
    private String title;
    private int length;
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public void play() throws PlayerException {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    public boolean equals(Track track){
        return (this.getTitle().equals(track.getTitle()) && this.getLength() == track.getLength());
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
