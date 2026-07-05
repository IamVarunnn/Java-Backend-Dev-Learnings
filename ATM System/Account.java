public class Account {
    private int accountNumber;
    private String holderName;
    private double balance;

    public Account(int accountNumber, double balance, String holderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
    }

    @Override
    public String toString() {
        return "Account Number : " + accountNumber +
            "\nHolder Name : " + holderName +
            "\nBalance : " + balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
