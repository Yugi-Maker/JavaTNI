import java.util.Scanner;

public class Ex603 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many member in your group: ");
        int member = scanner.nextInt();

        String[] names = new String[member];

        for (int i=0; i<member; i++) {
            System.out.print("Enter member name " + (i+1) + ": ");
            names[i] = scanner.next();
        }

        System.out.println("List of membership");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
