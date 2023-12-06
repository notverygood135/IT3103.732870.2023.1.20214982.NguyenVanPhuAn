package AimsProject.src.aims.store;

import AimsProject.src.aims.media.DigitalVideoDisc;
import AimsProject.src.aims.media.Media;

import java.util.ArrayList;

public class Store {
    //Nguyen Van Phu An 20214982
    public static final int MAX_ITEM = 100005; // Maximum number of discs in the store
    ArrayList<Media> itemsInStore = new ArrayList<>(); // Array representing the discs in the store

    public void printStore() {
        System.out.println("***********************CART***********************");
        System.out.println("Items in store");
        int id = 1;
        for (Media item : itemsInStore) {
            System.out.println(id++ + ". " + item.toString());
        }
        System.out.println("**************************************************");
    }

    public Media findMedia(String title) {
        for (Media item : itemsInStore) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public void addMedia(Media item) {
        // Add disc to store if the store is not full
        if (itemsInStore.size() < MAX_ITEM) {
            itemsInStore.add(item);
            System.out.println("Item " + item.getTitle() + " added to store");
        }
        else {
            System.out.println("Store is already full!");
        }
    }

    public void removeMedia(Media item) {
        // Remove disc from store if it exists in the store and the store isn't empty
        if (itemsInStore.isEmpty()) {
            System.out.println("Store is empty!");
        }
        else {
            if (itemsInStore.remove(item)) {
                System.out.println("Item " + item.getTitle() + " removed from store");
            }
            else {
                System.out.println("Item not found in store!");
            }
        }
    }
}
