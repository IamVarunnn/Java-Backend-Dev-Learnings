// package Abstract and Anonymous;

abstract class BankAccount{
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    
    abstract void withdraw(double amount);
}

public class ExTwo {
    public static void main(String[] args) {
        
        BankAccount ba = new BankAccount(100000){

            public void withdraw(double amount){
                
                if(balance >= amount){
                    balance -= amount;
                    System.out.println("Withdraw Successful. Available Funds -> " + balance);
                }
                else{
                    System.out.println("Insufficient Funds");
                }
            }
        };

        ba.withdraw(5000);


    }
}
