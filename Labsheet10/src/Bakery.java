public class Bakery {
    protected String flavor;
    protected double unitPrice;
    protected double packingCost = 5.0;

    public Bakery(String flavor, double unitPrice) {
        this.flavor = flavor;
        this.unitPrice = unitPrice;
    }

    public double getPackingCost() {
        return packingCost;
    }

    public double calculateTotalPrice() {
        return getPackingCost();
    }

    @Override
    public String toString() {
        return "Thank you for your order!";
    }
}

