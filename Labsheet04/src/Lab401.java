import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
       while (true) {
           String fullname = JOptionPane.showInputDialog("Enter your full name:");
           if (fullname == null) return;

           fullname = fullname.trim();

           int spacecount = 0;
           for (int i = 0; i < fullname.length(); i++) {
               if (fullname.charAt(i) == ' ') {
                   spacecount++;
               }
           }

           if (spacecount == 1) {

               String[] parts = fullname.split(" ");
               if (parts.length == 2) {
                   String first = parts[0];
                   String last = parts[1];

                   boolean firstOK = Character.isUpperCase(first.charAt(0)) && first.substring(1).equals(first.substring(1).toLowerCase());

                   boolean lastOK = last.equals(last.toUpperCase());

                   if (firstOK && lastOK) {
                       JOptionPane.showMessageDialog(null,
                               "Welcome, " + first + " " + last);
                       break;
                   }
               }
           }
           JOptionPane.showMessageDialog(null,
                   "Incorrect name. Please input again.");
       }
    }
}
