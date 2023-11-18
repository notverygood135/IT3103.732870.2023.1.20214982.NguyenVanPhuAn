package AimsProject.src.aims.store;

import AimsProject.src.aims.media.DigitalVideoDisc;

public class Store {
    //Nguyen Van Phu An 20214982
    public static final int MAX_ITEM = 100005; // Maximum number of discs in the store
    DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEM]; // Array representing the discs in the store
    public int discCount = 0; // Current number of discs in the store

    public void printStore() {
        System.out.println("***********************CART***********************");
        System.out.println("Items in Store");
        int id = 1;
        for (int i = 0; i < discCount; i++) {
            System.out.println(id++ + ". " + itemsInStore[i].toString());
        }
        System.out.println("**************************************************");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // Add disc to store if the store is not full
        if (discCount < MAX_ITEM) {
            itemsInStore[discCount] = disc;
            discCount++;
            System.out.println("Disc " + disc.getTitle() + " added to store");
        }
        else {
            System.out.println("store is already full!");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        // Remove disc from store if it exists in the store and the store isn't empty
        if (discCount == 0) {
            System.out.println("store is empty!");
        }
        else {
            for (DigitalVideoDisc storeDisc : itemsInStore) {
                if (storeDisc == disc) {
                    discCount--;
                    System.out.println("Disc " + disc.getTitle() + " removed from store");
                    return;
                }
            }
            System.out.println("Disc not found in store!");
        }
    }
}
