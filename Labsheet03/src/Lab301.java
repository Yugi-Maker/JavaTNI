 import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an Integer number: ");
        int num1 = scan.nextInt();

        if (num1 == 0) {
            System.out.println("This is Zero number.");
        } else {
            String evenOdd = (num1 % 2 == 0) ? "Even":"Odd";

            String posNeg = (num1 > 0) ? "Positive":"Negative";

            System.out.println("This number is " + evenOdd + " and " + posNeg + " number");
        }
    }
}