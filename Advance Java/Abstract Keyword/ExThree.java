
abstract class BankAccount{

    protected double balance;

    

    abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount{
    
    public void withdraw(double amount){

        if(balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println("Insuffient Balance");
        }
    }
}

class CurrentAccount extends BankAccount{



    public void withdraw(double amount) {
        if(balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println("Insuffient Balance");
        }
    }
}

public class ExThree {
    public static void main(String[] args) {
        
    }
}
