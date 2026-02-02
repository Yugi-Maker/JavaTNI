public class Cupcake extends Bakery {
    private int piece;

    public Cupcake(String flavor, int piece, double pricePerPiece) {
        super(flavor, pricePerPiece);
        this.piece = piece;
    }

    public boolean isPackingBox() {
        return piece >= 6;
    }

    public int getBoxNumber() {
        return piece / 6;
    }

    public int getBagNumber() {
        return piece % 6 > 0 ? 1 : 0;
    }

    @Override
    public double getPackingCost() {
        if (!isPackingBox()) return 0;
        return getBoxNumber() * super.getPackingCost();
    }

    @Override
    public double calculateTotalPrice() {
        return (unitPrice * piece) + getPackingCost() + (getBagNumber() * 2);
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Cup cake (" + flavor + ") with "
                + (isPackingBox() ? getBoxNumber() + " Box " : "")
                + getBagNumber() + " Bag\n"
                + "Total price of Cup Cake = " + calculateTotalPrice();
    }
}
