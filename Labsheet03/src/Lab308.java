import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many number to input: ");
        int number = scan.nextInt();

        int max = 0;
        int min = 0;
        int evenCount = 0;
        int oddCount = 0;
        int currentNumber;

        for (int i = 1; i <= number; i++) {
            System.out.print("Enter number " + i + ": ");
            currentNumber = scan.nextInt();

            if (i == 1) {
                max = currentNumber;
                min = currentNumber;
            }
            if (currentNumber > max) {
                max = currentNumber;
            }
            if (currentNumber < min) {
                min = currentNumber;
            }
            if (currentNumber % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }
        System.out.println("\nMaximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Even number = " + evenCount);
        System.out.println("Odd number = " + oddCount);
    }
}
