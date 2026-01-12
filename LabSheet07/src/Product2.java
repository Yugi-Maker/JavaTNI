public class Product2 {

        public String name;
        public double price = 0;
        public int quantity = 0;

        public void addStock(int amount) {
            if (amount > 0) {
                quantity += amount;
                System.out.println("Added " + amount + " item to stock");
            }
        }

        public void sell(int amount) {
            if (amount <= quantity) {
                quantity -= amount;
                System.out.println("Sold " + amount + " items");
            } else {
                System.out.println("Not enough item in stock...");
            }
        }

        public double stockValue() {
            return price * quantity;
        }

        public void showInfo() {
            System.out.println("Name  : " + name);
            System.out.println("Price : " + price + " Baht/Item");
            System.out.println("Stock : " + quantity + " Items");
            System.out.println("Stock Value : " + stockValue() + " Baht");
            System.out.println();
        }
    }
