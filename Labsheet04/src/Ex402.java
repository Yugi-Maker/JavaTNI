import java.util.Scanner;

public class Ex402 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter thr first message: ");
        String msg1 = scan.nextLine();
        System.out.print("Enter thr second message: ");
        String msg2 = scan.nextLine();

        System.out.print("Sensitive comparison: ");
        if (msg1.equals(msg2)) {
            System.out.println("Both message are the same");
        } else {
            System.out.println("Both message are NOT the same");
        }

        System.out.print("Insensitive comparison: ");
        if (msg1.equalsIgnoreCase(msg2)) {
            System.out.println("Both message are the same");
        } else {
            System.out.println("Both message are NOT the same");
        }

    }
}
