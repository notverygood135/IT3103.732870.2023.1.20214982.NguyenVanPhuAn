package AimsProject.src.aims.media;

public class DigitalVideoDisc extends Media {
    //Nguyen Van Phu An 20214982
    private static int nbDigitalVideoDiscs = 1;
    private String director;
    private int length;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.setId(nbDigitalVideoDiscs);
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.length = length;
        this.setCost(cost);
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title) {
        this.setTitle(title);
    }

    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + director + " - " + length + ": " + getCost() + " $";
    }
}
