package OtherProjects;

import javax.swing.JOptionPane;

public class QuadraticEquation {
    public static void main(String[] args) {
        String inputA = JOptionPane.showInputDialog("Nguyen Van Phu An - 20214982 - Enter a:");
        double a = Double.parseDouble(inputA);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Nguyen Van Phu An - 20214982 - a cannot be zero!");
            System.exit(0);
        }

        String inputB = JOptionPane.showInputDialog("Nguyen Van Phu An - 20214982 - Enter b:");
        double b = Double.parseDouble(inputB);

        String inputC = JOptionPane.showInputDialog("Nguyen Van Phu An - 20214982 - Enter c:");
        double c = Double.parseDouble(inputC);

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            String output = "2 real solutions:\nx1 = " + x1 + "\nx2 = " + x2;
            JOptionPane.showMessageDialog(null, output);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            String output = "Nguyen Van Phu An - 20214982 - 1 real solution:\nx1 = x2 = " + x;
            JOptionPane.showMessageDialog(null, output);
        } else {
            JOptionPane.showMessageDialog(null, "Nguyen Van Phu An - 20214982 - No real roots (complex roots).");
        }
        System.exit(0);
    }
}
