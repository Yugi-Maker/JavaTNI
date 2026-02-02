public class BirthdayCake extends Bakery {
    private String message;
    private int pound;

    public BirthdayCake(String flavor, String message, int pound, double pricePerPound) {
        super(flavor, pricePerPound);
        this.message = message;
        this.pound = pound;
    }

    public String changeMessage() {
        return "\nThank you for your order!";
    }

    @Override
    public double getPackingCost() {
        if (pound >= 3) {
            return 10;
        }
        return super.getPackingCost();
    }

    @Override
    public double calculateTotalPrice() {
        return (unitPrice * pound) + getPackingCost();
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + flavor + " birthday cake (message= " + message + ")\n"
                + "Total price of Birthday Cake = " + calculateTotalPrice();
    }
}

