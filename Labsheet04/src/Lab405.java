import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence;

        while (true) {
            System.out.print("Input some sentence: ");
            sentence = scan.nextLine();

            if (!sentence.endsWith(".")) {
                System.out.print("The sentence must end with full stop point: ");
                String answer = scan.nextLine();
            } else {
                break;
            }
        }

        sentence = sentence.substring(0, sentence.length() - 1);

        for (String w : sentence.split(" ")) {
            System.out.println(w);
        }

        scan.close();
    }
}

