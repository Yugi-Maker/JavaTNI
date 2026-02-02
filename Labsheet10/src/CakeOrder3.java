import javax.swing.JOptionPane;

public class CakeOrder3 {
    public static void main(String[] args) {
        String flavor = JOptionPane.showInputDialog("Enter a flavor birthday cake:");
        String message = JOptionPane.showInputDialog("Enter a message on cake:");
        int pound = Integer.parseInt(JOptionPane.showInputDialog("How many pounds do you want?"));

        BirthdayCake cake = new BirthdayCake(flavor, message, pound, 400);

        while (true) {
            int confirm = JOptionPane.showConfirmDialog(null,
                    cake.toString() + "\nConfirm this order?");

            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, cake.toString());
                break;
            } else {
                message = JOptionPane.showInputDialog("Enter a new message for changing:");
                cake = new BirthdayCake(flavor, message, pound, 400);
            }
        }
    }
}

