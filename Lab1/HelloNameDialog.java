package Lab1;// Example 2: FirstDialog.java
import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Nguyen Van Phu An - 20214982 - Please enter your name:");
        JOptionPane.showMessageDialog(null, "Toi la Nguyen Van Phu An - 20214982. Hi " + result + "!");
        System.exit(0);
    }
}
