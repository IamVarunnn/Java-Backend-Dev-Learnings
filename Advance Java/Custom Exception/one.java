// package Custom Exception;


class InvalidException extends Exception{

    public InvalidException(String str){
        super(str);
    }
}

public class one {
    public static void main(String[] args) {
        
        int age = 15;

        try {
            if(age < 18){
                throw new InvalidException("Not eligible to vote");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
