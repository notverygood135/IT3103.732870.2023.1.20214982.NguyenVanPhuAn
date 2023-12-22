package AimsProject.src.aims;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import AimsProject.src.aims.cart.Cart;
import AimsProject.src.aims.exception.DuplicatedItemException;
import AimsProject.src.aims.media.Book;
import AimsProject.src.aims.media.CompactDisc;
import AimsProject.src.aims.media.DigitalVideoDisc;
import AimsProject.src.aims.media.Media;
import AimsProject.src.aims.media.Track;
import AimsProject.src.aims.screen.CartScreen;
import AimsProject.src.aims.screen.StoreScreen;
import AimsProject.src.aims.store.Store;
public class Aims {

	private static Scanner sc;
	private static Store store;
	private static Cart cart;
	private static StoreScreen storeScreen;
	private static CartScreen cartScreen;

	public static void main(String[] args) {
		store = new Store();
		cart = new Cart();

		Media[] sampleMedia = new Media[] {
			new DigitalVideoDisc("a", "Sci-fi", "me", 125, 31.5f),
			new DigitalVideoDisc("b", "Romance", "mot nek", 91, 94.63f),
			new DigitalVideoDisc("c", "Horror", "not me", 96, 47.38f),
			new CompactDisc("d", "Pop", "Kim Evans", 15, 70.18f) {{
				addTrack(new Track("d1", 5));
				addTrack(new Track("fd2", 5));
				addTrack(new Track("d3d", 5));
			}},
			new CompactDisc("h", "Electronic", "Bruce Doty", 7, 93.03f) {{
				addTrack(new Track("h1", 3));
				addTrack(new Track("h2", 4));
			}},
			new Book("Rain Of The Mountain", 26.07f, new ArrayList<>()) {{
				addAuthor("Mark Castilleja");
			}},
			new Book("Scent Of Lust", 37.82f, new ArrayList<>()) {{
				addAuthor("Caroline Garcia");
				addAuthor("Liane Ferland");
			}},
			new CompactDisc("22", "Pop", "MONO", 8, 22.22f) {{
				addTrack(new Track("Intro", 1));
				addTrack(new Track("Em La", 3));
				addTrack(new Track("Waiting For You", 4));
			}},
			new Book("wallahi", 16, new ArrayList<>()) {{
				addAuthor("i'm dead");
			}}
		};
		//Nguyen Huy Hoang 20210373
		for (Media m : sampleMedia) {
			try {
				store.addMedia(m);
			} catch (DuplicatedItemException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		openStoreScreen();
	}

	public static Store getStore() {
		return store;
	}

	public static Cart getCart() {
		return cart;
	}

	public static StoreScreen getStoreScreen() {
		return storeScreen;
	}

	public static CartScreen getCartScreen() {
		return cartScreen;
	}
	
	public static void openStoreScreen() {
		storeScreen = new StoreScreen(store);
	}
	
	public static void closeStoreScreen() {
		storeScreen.setVisible(false);
		storeScreen = null;
	}
	
	public static void openCartScreen() {
		cartScreen = new CartScreen(cart);
	}
	
	public static void closeCartScreen() {
		cartScreen.setVisible(false);
		cartScreen = null;
	}
	
}
