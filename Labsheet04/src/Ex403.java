import javax.swing.*;

public class Ex403 {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Enter your Gmail:");

        while (email.toUpperCase().endsWith("@GMAIL.COM")==false) {
            JOptionPane.showInputDialog("Please enter your Gmail again:");
        }

        JOptionPane.showMessageDialog(null,"Your mail is " + email);
    }
}
