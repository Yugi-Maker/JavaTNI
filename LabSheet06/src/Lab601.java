import java.util.Scanner;

public class Lab601 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int i = 0;

        while (i < 5) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("The number must be positive! Enter number again: ");
            } else {
                numbers[i] = num;
                i++;
            }
        }

        System.out.print("\nList of even number: ");
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.print("\nList of odd number: ");
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
