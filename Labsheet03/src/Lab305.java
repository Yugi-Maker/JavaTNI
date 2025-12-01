import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scan.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
