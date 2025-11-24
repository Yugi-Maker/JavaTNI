import javax.swing.*;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
        final int custumer_price = 299;
        final double percent = 7;

        DecimalFormat frm = new DecimalFormat("#,###.00");

        int custumer = Integer.parseInt(
                JOptionPane.showInputDialog("How many custumer?"));

        double totalprice_net = custumer_price * custumer * (1 + percent / 100);

        double coupon = Integer.parseInt(
                JOptionPane.showInputDialog("Price with NET is " + frm.format(totalprice_net) + " baht." +
                        "\nHow much of discount (%) on you coupon"));

        double totalprice_coupon = totalprice_net * (1 - coupon / 100);

        int totalprice = Integer.parseInt(
                JOptionPane.showInputDialog("Total price is " + frm.format(totalprice_coupon) + " baht." +
                        "\nEnter the amount the customer paid"));

        double change = totalprice - totalprice_coupon;

        JOptionPane.showMessageDialog(null,
                "Total price is " + frm.format(totalprice_coupon) + " baht." +
                "\nCustumer paid " + frm.format(totalprice) + " baht." +
                "\nGet change " + frm.format(change) + " baht.");
    }
}
