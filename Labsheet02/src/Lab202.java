import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = scan.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = scan.nextInt();

        int summation = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        double division = (double) number1 / number2;
        int modulus = number1 % number2;

        System.out.println("\nSummation = " + summation);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Modulus = " + modulus);
    }
}
