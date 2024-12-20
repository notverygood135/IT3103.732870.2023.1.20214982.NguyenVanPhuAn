package AimsProject.src.aims;

import AimsProject.src.aims.cart.Cart;
import AimsProject.src.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        System.out.println("Nguyen Van Phu An 20214982");
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD one", "Film", "me", 100, 4.5f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD two", "Biography", "not me", 200, 5.5f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD three", "Documentary", "probably me", 300, 6.5f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("DVD four", "Anime", "definitely me", 900, 7.5f);

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd4);

        cart.printCart();
        cart.addDigitalVideoDisc(dvd3);
        cart.removeDigitalVideoDisc(dvd1);
        cart.printCart();
    }
}