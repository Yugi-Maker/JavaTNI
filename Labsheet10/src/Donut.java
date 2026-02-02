public class Donut extends Bakery {
    private int quantity;

    public Donut(String flavor, int quantity, double unitPrice) {
        super(flavor, unitPrice);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String glazeType() {
        return "Sugar Glaze";
    }

    @Override
    public double calculateTotalPrice() {
        return (unitPrice * quantity) + 8;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Donut (" + flavor + ", " + glazeType() + "), qty=" + quantity + "\n"
                + "Total price of Donut = " + calculateTotalPrice();
    }
}


