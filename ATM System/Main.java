public class Main {

    public static void main(String[] args) {

        BankService bank = new BankService();

        Account a1 = new Account(101, 1000, "Varun");
        Account a2 = new Account(102, 2000, "Rahul");
        Account a3 = new Account(103, 20000, "Priya");

        System.out.println("===== CREATE ACCOUNTS =====");
        bank.createAccount(a1);
        bank.createAccount(a2);
        bank.createAccount(a3);

        System.out.println("\n===== VIEW ACCOUNTS =====");
        bank.viewAccounts();

        System.out.println("\n===== SEARCH ACCOUNT =====");
        bank.searchAccount(102);
        bank.searchAccount(999);

        System.out.println("\n===== DEPOSIT =====");
        bank.deposit(101, 500);
        bank.checkBalance(101);

        System.out.println("\n===== WITHDRAW =====");
        bank.withdraw(101, 200);
        bank.checkBalance(101);

        System.out.println("\n===== INSUFFICIENT BALANCE =====");
        bank.withdraw(101, 10000);

        System.out.println("\n===== DELETE ACCOUNT =====");
        bank.deleteAccount(103);

        System.out.println("\n===== VIEW ACCOUNTS AFTER DELETE =====");
        bank.viewAccounts();

        System.out.println("\n===== ACCOUNT NOT FOUND =====");
        bank.searchAccount(103);
    }
}