package AimsProject.src.test.cart;

import AimsProject.src.aims.exception.DuplicatedItemException;
import AimsProject.src.aims.media.Book;
import AimsProject.src.aims.media.CompactDisc;
import AimsProject.src.aims.media.DigitalVideoDisc;
import AimsProject.src.aims.cart.Cart;

import javax.naming.LimitExceededException;
import java.util.ArrayList;
import java.util.Arrays;

public class CartTest {
    public static void main(String[] args) throws DuplicatedItemException, LimitExceededException {
        System.out.println("Nguyen Van Phu An 20214982");
        Cart cart = new Cart();

        DigitalVideoDisc dvd = new DigitalVideoDisc("DVD one", "Film", "me", 100, 4.5f);
        Book book = new Book("Book two", 5.5f, new ArrayList<>(Arrays.asList("me", "not me")));
        CompactDisc cd = new CompactDisc("CD three", "Documentary", "probably me", 300, 6.5f);

        cart.addMedia(dvd);
        cart.addMedia(book);
        cart.addMedia(cd);

        System.out.println(dvd.toString());
        System.out.println(book.toString());
        System.out.println(cd.toString());
    }
}