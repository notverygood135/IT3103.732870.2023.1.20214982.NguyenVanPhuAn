package OtherProjects;

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        String[] options = new String[] {"Yes", "No", "Maybe", "Cancel"};
        int option = JOptionPane.showOptionDialog(null,
                "Nguyen Van Phu An - 20214982- Do you want to change the first class ticket?", "Title",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        JOptionPane.showMessageDialog(null, "Nguyen Van Phu An - 20214982- You've chosen: "
                + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
