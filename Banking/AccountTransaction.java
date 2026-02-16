package Banking;

import java.io.*;
import java.util.*;

public class AccountTransaction extends BankAccount {

    public AccountTransaction(String accId) {
        super(accId, 0);
        loadBalance();
    }

    private void loadBalance() {
        try {
            File file = new File(filename);
            if (!file.exists()) return;

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(accId)) {
                    accBalance = Double.parseDouble(data[1]);
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean hasAccountId() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(accId)) {
                    br.close();
                    return true;
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void deposit(double amount) {
        accBalance += amount;
        updateFile();
    }

    public void withdraw(double amount) {
        if (accBalance >= amount) {
            accBalance -= amount;
            updateFile();
        }
    }

    public double checkBalance() {
        return accBalance;
    }

    private void updateFile() {
        try {
            File file = new File(filename);
            List<String> lines = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(accId)) {
                    lines.add(accId + "," + accBalance);
                } else {
                    lines.add(line);
                }
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

