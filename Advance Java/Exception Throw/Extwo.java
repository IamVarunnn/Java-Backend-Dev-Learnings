


class Extwo{
    public static void main(String[] args) {
        
        double balance = 5000;
        double withdraw = 7000;

        try {
            if(withdraw > balance){
               throw new ArithmeticException(); 
            }
        } catch (Exception e) {
            System.out.println("Insufficient Balance");
        }
    }
}