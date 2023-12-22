package AimsProject.src.test;

import AimsProject.src.aims.media.DigitalVideoDisc;
import AimsProject.src.aims.screen.StoreScreen;
import AimsProject.src.aims.store.Store;

public class Aims {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD one", "Film", "me", 100, 4.5f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD two", "Biography", "not me", 200, 5.5f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD three", "Documentary", "probably me", 300, 6.5f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("DVD four", "Film", "me", 100, 4.5f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("DVD five", "Biography", "not me", 200, 5.5f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("DVD six", "Documentary", "probably me", 300, 6.5f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("DVD seven", "Film", "me", 100, 4.5f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("DVD eight", "Biography", "not me", 200, 5.5f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("DVD nine", "Documentary", "probably me", 300, 6.5f);

        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(dvd5);
        store.addMedia(dvd6);
        store.addMedia(dvd7);
        store.addMedia(dvd8);
        store.addMedia(dvd9);
        new StoreScreen(store);
    }
}
