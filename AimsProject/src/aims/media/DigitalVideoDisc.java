package AimsProject.src.aims.media;

import AimsProject.src.aims.exception.PlayerException;

import javax.swing.*;

public class DigitalVideoDisc extends Disc implements Playable {
    //Nguyen Van Phu An 20214982
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    @Override
    public void play() throws PlayerException {
        if (getLength() <= 0) {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Playing DVD: " + this.getTitle() + "\n");
            sb.append("DVD length: " + this.getLength() + "\n");
            JOptionPane.showMessageDialog(null, sb.toString(), "Play DVD", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + " $";
    }
}
