package AimsProject.src.aims.cart;

import AimsProject.src.aims.media.DigitalVideoDisc;

import java.util.LinkedList;

public class Cart {
    //Nguyen Van Phu An 20214982
    public static final int MAX_ITEM = 20; // Maximum number of discs in the cart
    LinkedList<DigitalVideoDisc> digitalVideoDiscs = new LinkedList<>(); // Linked list representing the discs in the cart
    public int discCount = 0; // Current number of discs in the cart

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items");
        int id = 1;
        for (DigitalVideoDisc disc : digitalVideoDiscs) {
            System.out.println(id++ + ". " + disc.toString());
        }
        System.out.println(calculateTotalCost());
        System.out.println("**************************************************");
    }

    public DigitalVideoDisc searchByID(int id) {
        for (DigitalVideoDisc disc : digitalVideoDiscs) {
            if (disc.getId() == id) {
                return disc;
            }
        }
        return null;
    }

    public DigitalVideoDisc searchByTitle(String title) {
        for (DigitalVideoDisc disc : digitalVideoDiscs) {
            if (disc.getTitle().equals(title)) {
                return disc;
            }
        }
        return null;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // Add disc to cart if the cart is not full
        if (discCount < MAX_ITEM) {
            digitalVideoDiscs.add(disc);
            discCount++;
            System.out.println("Disc " + disc.getTitle() + " added to cart");
        }
        else {
            System.out.println("Cart is already full!");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        // Remove disc from cart if it exists in the cart and the cart isn't empty
        if (discCount == 0) {
            System.out.println("Cart is empty!");
        }
        else {
            if (digitalVideoDiscs.remove(disc)) {
                discCount--;
                System.out.println("Disc " + disc.getTitle() + " removed from cart");
            }
            else {
                System.out.println("Disc not found in cart!");
            }
        }
    }

    public float calculateTotalCost() {
        float total = 0f;
        for (DigitalVideoDisc disc : digitalVideoDiscs) {
            total += disc.getCost();
        }
        return total;
    }

    public void cartDetails() {
        System.out.println("DVDs in cart:");
        for (DigitalVideoDisc disc : digitalVideoDiscs) {
            System.out.println(disc.getId() + " " + disc.getTitle());
        }
        System.out.println("Total cost: " + calculateTotalCost());
    }
}