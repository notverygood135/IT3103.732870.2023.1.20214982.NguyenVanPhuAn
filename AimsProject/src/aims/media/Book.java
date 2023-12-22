package AimsProject.src.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    // Nguyen Van Phu An 20214982
    private List<String> authors = new ArrayList<String>();

    public Book(String title, float cost, List<String> authors) {
        super(title, title, cost);
        this.authors = authors;
    }

    public void addAuthor(String author) {
        if (!authors.contains(author)) authors.add(author);
    }

    public void removeAuthor(String author) {
        authors.remove(author);
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String toString() {
        return "Book - " + getTitle() + " - " + getCost() + " $";
    }
}
