import javax.swing.*;
import java.time.Duration;

public class Lab205 {
    public static void main(String[] args) {
        int min = Integer.parseInt(
                JOptionPane.showInputDialog("Input minute: "));

        long hours =  min / 60;
        long minutes =  min % 60;

        JOptionPane.showMessageDialog(null,
                min + " minutes is " + hours + " hour " + minutes + " minute");


    }
}
