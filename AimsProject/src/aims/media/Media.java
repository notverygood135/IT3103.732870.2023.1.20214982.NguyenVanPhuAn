package AimsProject.src.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbDigitalVideoDiscs = 1;

    public Media(String title, String category, float cost) {
        this.id = nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
