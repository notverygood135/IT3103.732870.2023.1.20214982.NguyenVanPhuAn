package OtherProjects;

import javax.swing.JOptionPane;
public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2; double num1, num2;

        strNum1 = JOptionPane.showInputDialog(null,
                "Nguyen Van Phu An - 20214982 - Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null,
                "Nguyen Van Phu An - 20214982 - Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null,
                        "Nguyen Van Phu An - 20214982\n" +
                        "The sum of those two numbers is:" + (num1 + num2) + "\n" +
                        "The difference of those two numbers is:" + (num1 - num2) + "\n" +
                        "The product of those two numbers is:" + (num1 * num2) + "\n" +
                        "The quotient of those two numbers is:" + (num1 / num2) + "\n",
                "Results",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
