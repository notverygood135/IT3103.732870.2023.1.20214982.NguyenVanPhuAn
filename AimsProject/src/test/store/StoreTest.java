package AimsProject.src.test.store;

import AimsProject.src.aims.media.DigitalVideoDisc;
import AimsProject.src.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        System.out.println("Nguyen Van Phu An 20214982");
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD one", "Film", "me", 100, 4.5f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD two", "Biography", "not me", 200, 5.5f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD three", "Documentary", "probably me", 300, 6.5f);

        store.addMedia(dvd1);
        store.addMedia(dvd2);

        store.addMedia(dvd3);
        store.removeMedia(dvd1);
        store.printStore();
    }
}
