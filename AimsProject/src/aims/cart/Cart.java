package AimsProject.src.aims.cart;

import AimsProject.src.aims.media.Media;
import AimsProject.src.aims.media.MediaComparatorByCostTitle;
import AimsProject.src.aims.media.MediaComparatorByTitleCost;

import java.util.ArrayList;

public class Cart {
    //Nguyen Van Phu An 20214982
    public static final int MAX_ITEM = 20; // Maximum number of discs in the cart
    private ArrayList<Media> itemsOrdered = new ArrayList<>(); // Array list representing the discs in the cart

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

    public void addMedia(Media item) {
        // Add disc to cart if the cart is not full
        if (itemsOrdered.size() < MAX_ITEM) {
            itemsOrdered.add(item);
            System.out.println("Item " + item.getTitle() + " added to cart");
        }
        else {
            System.out.println("Cart is already full!");
        }
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
}