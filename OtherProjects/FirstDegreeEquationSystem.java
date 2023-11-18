package OtherProjects;

import javax.swing.*;
public class FirstDegreeEquationSystem {
    public static void main(String[] args) {
        String a11Str, a12Str, a21Str, a22Str, b1Str, b2Str;
        double a11, a12, a21, a22, b1, b2;

        a11Str = JOptionPane.showInputDialog(null,
                "Please input a11: ", "Input a11", JOptionPane.INFORMATION_MESSAGE);
        a11 = Double.parseDouble(a11Str);

        a12Str = JOptionPane.showInputDialog(null,
                "Please input a12: ", "Input a12", JOptionPane.INFORMATION_MESSAGE);
        a12 = Double.parseDouble(a12Str);

        b1Str = JOptionPane.showInputDialog(null,
                "Please input b1: ", "Input b1", JOptionPane.INFORMATION_MESSAGE);
        b1 = Double.parseDouble(b1Str);

        a21Str = JOptionPane.showInputDialog(null,
                "Please input a21: ", "Input a21", JOptionPane.INFORMATION_MESSAGE);
        a21 = Double.parseDouble(a21Str);

        a22Str = JOptionPane.showInputDialog(null,
                "Please input a22: ", "Input a22", JOptionPane.INFORMATION_MESSAGE);
        a22 = Double.parseDouble(a22Str);

        b2Str = JOptionPane.showInputDialog(null,
                "Please input b2: ", "Input b2", JOptionPane.INFORMATION_MESSAGE);
        b2 = Double.parseDouble(b2Str);

        double determinant = a11 * a22 - a12 * a21;

        if (determinant == 0) {
            JOptionPane.showMessageDialog(null,
                    "No solutions",
                    "No solutions",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        double x = (b1 * a22 - b2 * a12) / determinant;
        double y = (b2 * a11 - b1 * a21) / determinant;

        JOptionPane.showMessageDialog(null,
                "The solution is: x = " + x + " and y = " + y,
                "Results",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
