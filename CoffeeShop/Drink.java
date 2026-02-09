package CoffeeShop;

public abstract class Drink implements Priceable {
    protected String drink_Name;
    protected double base_Price;
    protected char size;

    public Drink(String drink_Name, double base_Price, char size) {
        this.drink_Name = drink_Name;
        this.base_Price = base_Price;
        this.size = Character.toUpperCase(size);
    }

    public double getBase_Price() {
        return base_Price;
    }

    public double getSizeExtra() {
        switch (size) {
            case 'S': return 0;
            case 'M': return 10;
            case 'L': return 15;
            default: return -1;
        }
    }

    @Override
    public String toString() {
        return "Your order: " + drink_Name + " (Size: " + size + ")";
    }
}
