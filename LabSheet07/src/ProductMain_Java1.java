import javax.swing.*;

public class ProductMain_Java1 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "Welcome to Product Stock System");

        String name = JOptionPane.showInputDialog(
                "Enter product name:");

        double price = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Enter product price per item"));

        int quantity = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Enter product stock:"));

        Product product = new Product(name, price, quantity);

        product.showInfo();

        int addOption = JOptionPane.showConfirmDialog(null,
                "Do you want to add more item?",
                "Select an Option",
                JOptionPane.YES_NO_CANCEL_OPTION);

        if (addOption == JOptionPane.YES_OPTION) {
            int addAmount = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "How many item to add in stock?"));
            product.addStock(addAmount);
        }

        int priceOption = JOptionPane.showConfirmDialog(null,
                "Do you want to change price?",
                "Select an Option",
                JOptionPane.YES_NO_CANCEL_OPTION);

        if (priceOption == JOptionPane.YES_OPTION) {
            double newPrice = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "How much is the new price per item?"));
            product.changePrice(newPrice);
        }

        product.showInfo();
    }
}
