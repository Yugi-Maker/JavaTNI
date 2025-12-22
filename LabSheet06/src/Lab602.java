import java.util.Scanner;

public class Lab602 {
    public static int find_rank(double[] scores, double targetScore) {
        int rank = 1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > targetScore) {
                rank++;
            }
        }
        return rank;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] movies = {"Me Before You", "Titanic", "Before Sunrise", "The Holiday", "A Walk to Remember"};

        double[] rate_scores = {4.2, 4.9, 4.4, 3.7, 4.3};

        System.out.print("Enter a movie title: ");
        String title = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < movies.length; i++) {
            if (title.equalsIgnoreCase(movies[i])) {

                int rank = find_rank(rate_scores, rate_scores[i]);

                System.out.println("The rating score of \"" + movies[i] + "\" is " + rate_scores[i]);
                System.out.println("Ranking: " + rank);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Cannot found this movie title");
        }
    }
}
