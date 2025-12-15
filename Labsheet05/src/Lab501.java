import javax.swing.*;

public class Lab501 {
    public static double cal_bmi (double weight, double height_cm) {
        double height_m = height_cm / 100;
        return weight / (height_m * height_m);
    }

    public static String check_bmi (double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Healthy Weight";
        } else if (bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obase";
        }
    }

    public static void main(String[] args) {
        while (true) {
            int choice = JOptionPane.showConfirmDialog(null,
                    "Do you want to check your BMI",
                    "Check BMI",
                    JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null,
                        "END PROGRAM!");
                break;
            }

            double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight (kg.)"));

            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (cm.)"));

            double bmi = cal_bmi(weight, height);
            String result = check_bmi(bmi);

            JOptionPane.showMessageDialog(null,
                    String.format("Your BMI = %.2f\nYour BMI result = %s", bmi, result));
        }
    }
}
