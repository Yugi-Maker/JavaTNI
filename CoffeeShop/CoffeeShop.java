package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    static Scanner sc = new Scanner(System.in);

    public static Espresso orderEspresso() {
        System.out.print("Enter a size: ");
        char size = sc.next().charAt(0);

        Espresso e = new Espresso(size);

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        char ans = sc.next().charAt(0);
        if (ans == 'y' || ans == 'Y') {
            System.out.print("How many shots for adding in Espresso: ");
            int shot = sc.nextInt();
            e.addShot(shot);
        }
        return e;
    }

    public static Frappuccino orderFrappuccino() {
        System.out.print("Enter a size: ");
        char size = sc.next().charAt(0);

        System.out.print("Do you would like to add whipped cream [y/Y]?");
        char ans = sc.next().charAt(0);
        boolean whipped = (ans == 'y' || ans == 'Y');

        return new Frappuccino(size, whipped);
    }

    public static void main(String[] args) {
        int espressoCount = 0;
        int frappuccinoCount = 0;
        double totalPrice = 0;

        while (true) {
            System.out.print("Press 1 for ordering Espresso" +
                             "\nPress 2 for ordering Frappuccino" +
                             "\nEnter an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                Espresso e = orderEspresso();
                System.out.println(e);
                espressoCount++;
                totalPrice += e.calculateFinalPrice();
            } else if (choice == 2) {
                Frappuccino f = orderFrappuccino();
                System.out.println(f);
                frappuccinoCount++;
                totalPrice += f.calculateFinalPrice();
            } else {
                break;
            }

            System.out.print("\nDo you want to order more [y/Y]? ");
            char more = sc.next().charAt(0);
            if (more != 'y' && more != 'Y') {
                break;
            }
        }

        System.out.println("\n----- Summary -----");
        System.out.println("Espresso orders: " + espressoCount);
        System.out.println("Frappuccino orders: " + frappuccinoCount);
        System.out.println("Total price: " + totalPrice + " Baht");
    }
}

