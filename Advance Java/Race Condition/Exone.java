
class BankAccount{
    int balance = 0;

    // public void deposit(){
    //     balance++;
    // }

    public synchronized void deposit(){
        balance++;
    }
}

public class Exone {
    public static void main(String[] args) {
        
        BankAccount ba = new BankAccount();
        
        Runnable obj1 = () ->{
            
            for(int i = 0; i < 10000; i++){

                ba.deposit();
            }
        };

        Runnable obj2 = () ->{
            
            for(int i = 0; i < 10000; i++){

                ba.deposit();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }

        System.out.println(ba.balance);

    }
}
