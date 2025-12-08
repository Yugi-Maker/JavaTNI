import javax.swing.*;

public class Lab403 {
    public static void main(String[] args) {
        final String USERNAME = "admin";
        final String PASSWORD = "Admin1234";

        while (true) {
            String user = JOptionPane.showInputDialog(null, "Enter username:");
            if (user == null) return;

            String pass = JOptionPane.showInputDialog(null, "Enter password:");
            if (pass == null) return;

            if (user.equalsIgnoreCase(USERNAME) && pass.equals(PASSWORD)) {
                JOptionPane.showMessageDialog(null, "Login Success!!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Login Fail...","Incorrect username and password",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
