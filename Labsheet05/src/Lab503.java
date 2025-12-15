import java.util.Scanner;

public class Lab503 {
    public static int count_vowel (String message, char letter) {
        int count = 0;
        message = message.toUpperCase();
        letter = Character.toUpperCase(letter);

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the message: ");
        String msg = scan.nextLine();

        char[] vowels = {'A', 'E', 'I', 'O', 'U'};

        System.out.println("\nList of vowel in \"" + msg + "\"");
        for (char v : vowels) {
            int total = count_vowel(msg, v);
            System.out.println("The letter '" + v + "' appear " + total + " time(s).");
        }
    }
}
