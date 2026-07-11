// package Custom Exception;

class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String str){
        super(str);
    }
}

public class two {
    public static void main(String[] args) {
        
        double balance = 5000;
        double withdraw = 7000;
        
        try {
            
            if(withdraw > balance){
                throw new InsufficientBalanceException("Insufficient Balance");
            }

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
