import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");

        double height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height (cm.):"));

        int male = JOptionPane.showConfirmDialog(null,
                "Are you biological gender is Male?", "Gender",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (male == JOptionPane.YES_OPTION) {
            double male_weight = height - 100;
            JOptionPane.showMessageDialog(null,"Hello,Mr." + name +
                    "\nIf your height is " + height + " cm." +
                    "\nYour weight should be " + male_weight + " kg.");
        } else {
            int female = JOptionPane.showConfirmDialog(null,
                    "Are you biological gender is Female?", "Gender",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (female == JOptionPane.YES_OPTION) {
                double female_weight = height - 110;
                JOptionPane.showMessageDialog(null,"Hello,Ms." + name +
                        "\nIf your height is " + height + " cm." +
                        "\nYour weight should be " + female_weight + " kg.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "You can use BMI to measure you weight and height");
            }
        }

    }
}
