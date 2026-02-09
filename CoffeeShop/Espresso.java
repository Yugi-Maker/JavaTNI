package CoffeeShop;

public class Espresso extends Drink {
    private int shot;

    public Espresso(char size) {
        super("Espresso", 35, size);
        this.shot = 0;
    }

    public void addShot(int shot) {
        this.shot += shot;
    }

    @Override
    public double calculateFinalPrice() {
        return base_Price + (shot * 15) + getSizeExtra();
    }

    @Override
    public String toString() {
        String result = super.toString() + "\n";
        if (shot > 0) {
            result += "Added" + shot + " shot\n";
        }
        result += "Total price = " + calculateFinalPrice() + " Baht";
        return result;
    }
}
