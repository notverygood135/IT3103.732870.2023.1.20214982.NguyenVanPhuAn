//Nguyen Van Phu An 20214982
package AimsProject.src.aims.screen;

import java.io.IOException;

import javax.swing.JFrame;

import AimsProject.src.aims.cart.Cart;
import AimsProject.src.aims.screen.fxml.CartScreenController;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CartScreen extends JFrame {
	private Cart cart;

	public CartScreen(Cart cart) {
		super();

		this.cart = cart;

		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);

		this.setTitle("Cart");
		this.setBounds(100, 0, 1024, 768);
		this.setVisible(true);
		
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/hedspi/aims/screen/fxml/cart.fxml"));
					CartScreenController controller = new CartScreenController(cart);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
