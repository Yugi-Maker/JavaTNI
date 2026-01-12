import java.util.Scanner;

public class ProductMain_Java2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product2 product1 = new Product2();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;

        Product2 product2 = new Product2();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        int choice;

        do {
            System.out.println("Welcome to Mini Shop");
            System.out.println("---------------------------------------");
            System.out.println("Press [1] to buy Pen");
            System.out.println("Press [2] to buy Notebooks");
            System.out.println("Enter a number: ");

            choice = sc.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.print("Invalid number! Enter a number, again: ");
                choice = sc.nextInt();
            }

        } while (choice != 1 && choice != 2);

        System.out.println("------------------------");

        if (choice == 1) {
            product1.showInfo();
            System.out.println("-------------------------");

            System.out.print("How many Pens do you want to buy? ");
            int amount = sc.nextInt();

            product1.sell(amount);

            System.out.println("------------------------");
            product1.showInfo();

        } else if (choice == 2) {
            product2.showInfo();
            System.out.println("-------------------------");

            System.out.print("How many Pens do you want to buy? ");
            int amount = sc.nextInt();

            product2.sell(amount);

            System.out.println("------------------------");
            product2.showInfo();

        }
    }
}
