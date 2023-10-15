package Lab1;

import javax.swing.*;
public class FirstDegreeEquation {
    public static void main(String[] args) {
        String strNum1, strNum2; double num1, num2;

        strNum1 = JOptionPane.showInputDialog(null,
                "Nguyen Van Phu An - 20214982 - Please input a: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);

        if (num1 == 0) {
            JOptionPane.showMessageDialog(null, "a cannot be zero!");
            System.exit(0);
        }

        strNum2 = JOptionPane.showInputDialog(null,
                "Nguyen Van Phu An - 20214982 - Please input b: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null,
                "Nguyen Van Phu An - 20214982 - The solution of " + strNum1 + "x + " + strNum2 + " = 0 is: " + (-num2 / num1),
                "Results",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
