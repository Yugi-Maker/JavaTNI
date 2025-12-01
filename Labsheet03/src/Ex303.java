import java.util.Scanner;

public class Ex303 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = Integer.parseInt(scan.next());
        System.out.print("Enter number 2: ");
        int num2 = Integer.parseInt(scan.next());
        System.out.print("Enter number 3: ");
        int num3 = Integer.parseInt(scan.next());

        if (num1 == num2 && num2 == num3) {
            System.out.println("\nAll number are the same.");
        } else {
            System.out.println("\nAll number are NOT the same.");
        }

        System.out.println(num1 == num2 && num2 == num3 ? "All number are the same." : "All number are NOT the same.");
        System.out.println("All number are " + (num1 == num2 && num2 == num3 ? "the same." : "NOT the same."));
    }
}
