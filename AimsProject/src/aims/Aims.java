package AimsProject.src.aims;

import AimsProject.src.aims.cart.Cart;
import AimsProject.src.aims.media.DigitalVideoDisc;
import AimsProject.src.aims.media.Media;
import AimsProject.src.aims.media.Playable;
import AimsProject.src.aims.store.Store;

import java.util.Scanner;

public class Aims {
    // Nguyen Van Phu An 20214982
    private static Scanner scanner  = new Scanner(System.in);
    private static int option;
    private static Store store = new Store();
    private static Cart cart = new Cart();
    public static void main(String[] args) {
        handleMainMenu();
    }

    public static int handleOption(int optionMax) {
        do {
            option = scanner.nextInt();
            scanner.nextLine();
        }
        while (option < 0 || option > optionMax);
        return option;
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void updateStoreMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to store");
        System.out.println("2. Remove from store");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        option = handleOption(2);
        switch (option) {
            case 1:

                break;
            case 2:
                break;
            default:
                break;
        }
    }

    public static void handleMainMenu() {
        showMenu();
        option = handleOption(3);
        switch (option) {
            case 1:
                handleStoreMenu();
                break;
            case 2:
                handleUpdateStoreMenu();
                break;
            case 3:
                handleCartMenu();
                break;
            default:
                break;
        }
    }

    public static void handleStoreMenu() {
        storeMenu();
        option = handleOption(4);
        switch (option) {
            case 1:
                seeMediaDetails();
                break;
            case 2:
                addMediaToCart();
                break;
            case 3:
                playMedia();
                break;
            case 4:
                store.printStore();
                break;
            default:
                break;
        }
    }

    private static void playMedia() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        Media item = store.findMedia(title);
        if (item instanceof Playable) {
            ((Playable) item).play();
        }
    }

    private static void addMediaToCart() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        Media item = store.findMedia(title);
        if (item != null) {
            cart.addMedia(item);
        }
    }

    private static void seeMediaDetails() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        Media item = store.findMedia(title);
        if (item != null) {
            System.out.println(item);
        }
    }

    public static void handleCartMenu() {
        cart.printCart();
        cartMenu();
        option = handleOption(5);
        switch (option) {
            case 1:
                filterCart();
                break;
            case 2:
                sortCart();
                break;
            case 3:
                removeMediaFromCart();
                break;
            case 4:
                playCartMedia();
                break;
            case 5:
                placeOrder();
            default:
                break;
        }
    }

    private static void placeOrder() {
        cart.printCart();
    }

    private static void playCartMedia() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        Media item = cart.searchByTitle(title);
        if (item instanceof Playable) {
            ((Playable) item).play();
        }
    }

    private static void removeMediaFromCart() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        Media item = cart.searchByTitle(title);
        if (item != null) {
            cart.removeMedia(item);
        }
    }

    private static void sortCart() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Sort by title");
        System.out.println("2. Sort by cost");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        option = handleOption(2);
        switch (option) {
            case 1:
                cart.sortByTitle();
                break;
            case 2:
                cart.sortByCost();
                break;
            default:
                break;
        }
    }

    private static void filterCart() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter by id");
        System.out.println("2. Filter by title");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        option = handleOption(2);
        int id;
        String title;
        Media item;
        switch (option) {
            case 1:
                System.out.print("Enter id: ");
                id = scanner.nextInt();
                item = cart.searchByID(id);
                if (item != null) {
                    System.out.println(item);
                }
                break;
            case 2:
                System.out.print("Enter title: ");
                title = scanner.nextLine();
                item = cart.searchByTitle(title);
                if (item != null) {
                    System.out.println(item);
                }
                break;
            default:
                break;
        }
    }

    public static void handleUpdateStoreMenu() {

    }
}