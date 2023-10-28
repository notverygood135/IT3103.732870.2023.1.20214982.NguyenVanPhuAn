package Lab1;

import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Nguyen Van Phu An - 20214982- Do you want to change the first class ticket?");
        JOptionPane.showMessageDialog(null, "Nguyen Van Phu An - 20214982- You've chosen: "
                + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
