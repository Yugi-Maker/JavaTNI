package Banking;

import java.util.Scanner;
import Banking.AccountTransaction;

public class BankSystem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account ID: ");
        String accId = sc.nextLine();

        AccountTransaction account = new AccountTransaction(accId);

        if (!account.hasAccountId()) {
            System.out.println("Bank account not found...");
            return;
        }

        int choice;

        do {
            System.out.println("\n1=Deposit");
            System.out.println("2=Withdraw");
            System.out.println("3=Check Balance");
            System.out.println("4=Exit");
            System.out.print("Choose: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Deposit amount: ");
                    double dep = Double.parseDouble(sc.nextLine());
                    account.deposit(dep);
                    System.out.println("Current Balance: " + account.checkBalance());
                    break;

                case 2:
                    System.out.print("Withdraw amount: ");
                    double wd = Double.parseDouble(sc.nextLine());
                    account.withdraw(wd);
                    System.out.println("Current Balance: " + account.checkBalance());
                    break;

                case 3:
                    System.out.println("Current Balance: " + account.checkBalance());
                    break;

                case 4:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid Menu!!");
            }

        } while (choice != 4);
    }
}

