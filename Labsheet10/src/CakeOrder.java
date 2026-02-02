import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a message: ");
        String msg = sc.nextLine();
        System.out.print("Flavor: ");
        String flavor1 = sc.nextLine();
        System.out.print("Pound: ");
        int pound = sc.nextInt();

        BirthdayCake order1 = new BirthdayCake(flavor1, msg, pound, 350);
        System.out.println(order1);

        System.out.print("\nCupcake flavor: ");
        sc.nextLine();
        String flavor2 = sc.nextLine();
        System.out.print("Pieces: ");
        int piece = sc.nextInt();

        Cupcake order2 = new Cupcake(flavor2, piece, 65);
        System.out.println(order2);

        Donut order3 = new Donut("Chocolate", 5, 40);
        System.out.println(order3);

        double total = order1.calculateTotalPrice()
                + order2.calculateTotalPrice()
                + order3.calculateTotalPrice();

        System.out.println("\nTotal All Orders = " + total);
    }
}

