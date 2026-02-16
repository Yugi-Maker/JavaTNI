package Banking;

import java.util.Scanner;
import Banking.OpenNewAccount;

public class BankSystem1 {

    public static String input_account_id() {
        Scanner sc = new Scanner(System.in);
        String accId;

        while (true) {
            System.out.print("Enter Account ID (10 characters): ");
            accId = sc.nextLine();

            if (accId.length() == 10) {
                return accId;
            }
            System.out.println("Invalid Account ID!!");
        }
    }

    public static double input_initial_balance() {
        Scanner sc = new Scanner(System.in);
        double balance;

        while (true) {
            try {
                System.out.print("Enter Initial Balance: ");
                balance = Double.parseDouble(sc.nextLine());
                return balance;
            } catch (Exception e) {
                System.out.println("Invalid Data!!");
            }
        }
    }

    public static void main(String[] args) {

        String account_bank = input_account_id();
        double initial_balance = input_initial_balance();

        OpenNewAccount account = new OpenNewAccount(account_bank, initial_balance);
        System.out.println(account.recordAccount());
    }
}

