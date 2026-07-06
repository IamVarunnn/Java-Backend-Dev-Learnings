// package Interface;

interface Payment{

    public void pay(double amount);
}

class UPI implements Payment{
    public void pay(double amount){
        System.out.println("Amounted debited Successfully!");
    }
}

public class ExOne {
    
}
