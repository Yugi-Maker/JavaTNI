import java.util.Scanner;

public class CakeOrder2 {

    public static String selectFlavor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\nPress 1 for Chocolate" +
                    "\nPress 2 for Vanilla" +
                    "\nPress 3 for Strawberry" +
                    "\nPress 4 for Lemon" +
                    "\nPress 5 for Red Velvet" +
                    "\nEnter a flavor number: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: return "Chocolate";
                case 2: return "Vanilla";
                case 3: return "Strawberry";
                case 4: return "Lemon";
                case 5: return "Red Velvet";
                default:
                    System.out.println("Wrong option!! Try again!!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 to order Birthday Cake" +
                "\nPress 2 to order CupCake" +
                "\nPress 3 to order Donut" +
                "\nEnter an option: ");
        int option = sc.nextInt();

        if (option == 1) {
            String flavor = selectFlavor();
            sc.nextLine();
            System.out.print("\nEnter a Message: ");
            String msg = sc.nextLine();
            System.out.print("How many Pound: ");
            int pound = sc.nextInt();

            BirthdayCake cake = new BirthdayCake(flavor, msg, pound, 350);
            System.out.println(cake);

        } else if (option == 2) {
            String flavor = selectFlavor();
            System.out.print("\nHow many Pieces: ");
            int piece = sc.nextInt();

            Cupcake cup = new Cupcake(flavor, piece, 70);
            System.out.println(cup);

        } else if (option == 3) {
            String flavor = selectFlavor();
            System.out.print("How many Quantity: ");
            int qty = sc.nextInt();

            Donut donut = new Donut(flavor, qty, 45); // กำหนดราคา/ชิ้น เช่น 45
            System.out.println(donut);

        } else {
            System.out.println("Wrong option!! Try again!!");
        }
    }
}

