package AimsProject.src.aims.cart;

import AimsProject.src.aims.exception.DuplicatedItemException;
import AimsProject.src.aims.media.Media;
import AimsProject.src.aims.media.MediaComparatorByCostTitle;
import AimsProject.src.aims.media.MediaComparatorByTitleCost;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.naming.LimitExceededException;
import java.util.ArrayList;

public class Cart {
    //Nguyen Van Phu An 20214982
    public static final int MAX_NUMBERS_ORDERED = 20; // Maximum number of discs in the cart
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList(); // Array list representing the discs in the cart

    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items");
        int id = 1;
        for (Media item : itemsOrdered) {
            System.out.println(id++ + ". " + item.toString());
        }
        System.out.println(calculateTotalCost());
        System.out.println("**************************************************");
    }

    public Media searchByID(int id) {
        for (Media item : itemsOrdered) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public Media searchByTitle(String title) {
        for (Media item : itemsOrdered) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public void sortByTitle() {
        itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCost() {
        itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
    }

    public void addMedia(Media media) throws LimitExceededException, DuplicatedItemException {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            throw new LimitExceededException("ERROR: The number of media has reached its limit.");
        }

        if (itemsOrdered.contains(media)) {
            throw new DuplicatedItemException("ERROR: Item already in cart.");
        }
        itemsOrdered.add(media);
    }

    public void removeMedia(Media item) {
        // Remove disc from cart if it exists in the cart and the cart isn't empty
        if (itemsOrdered.isEmpty()) {
            System.out.println("Cart is empty!");
        }
        else {
            if (itemsOrdered.remove(item)) {
                System.out.println("Item " + item.getTitle() + " removed from cart");
            }
            else {
                System.out.println("Item not found in cart!");
            }
        }
    }

    public float calculateTotalCost() {
        float total = 0f;
        for (Media item : itemsOrdered) {
            total += item.getCost();
        }
        return total;
    }

    public void cartDetails() {
        System.out.println("DVDs in cart:");
        for (Media item : itemsOrdered) {
            System.out.println(item.getId() + " " + item.getTitle());
        }
        System.out.println("Total cost: " + calculateTotalCost());
    }

    public float totalCost() {
        float total = 0.0f;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return totalCost();
    }

    public void placeOrder() {
        itemsOrdered.clear();
    }
}