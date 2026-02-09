package CoffeeShop;

public class Frappuccino extends Drink {
    private boolean whipped;

    public Frappuccino(char size, boolean whipped) {
        super("Frappuccino", 40,size);
        this.whipped = whipped;
    }

    @Override
    public double calculateFinalPrice() {
        double total = base_Price;
        if (whipped) {
            total += 15;
        }
        total += getSizeExtra();
        return total;
    }

    @Override
    public String toString() {
        String result = super.toString() + "\n";
        if (whipped) {
            result += "Add whipped 15 Baht\n";
        }
        result += "Total price = " + calculateFinalPrice() + " Baht";
        return result;
    }
}
