package Banking;

public class BankAccount {
    protected String accId;
    protected double accBalance;
    protected String filename = "src/Banking/user_account.txt";

    public BankAccount(String accId, double accBalance) {
        this.accId = accId;
        this.accBalance = accBalance;
    }

    public String getAccId() {
        return accId;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return accId + "," + accBalance;
    }
}
