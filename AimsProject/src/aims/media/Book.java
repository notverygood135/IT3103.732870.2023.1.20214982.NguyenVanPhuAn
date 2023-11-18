package AimsProject.src.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book(int id, String title, float cost, List<String> authors) {
        this.setId(id);
        this.setTitle(title);
        this.setCost(cost);
        this.authors = authors;
    }

    public void addAuthor(String author) {
        if (!authors.contains(author)) authors.add(author);
    }

    public void removeAuthor(String author) {
        authors.remove(author);
    }
}
