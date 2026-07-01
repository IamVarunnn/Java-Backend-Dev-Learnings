 
class MyException extends Exception{

    public MyException(String str) {
        super(str);
    }

    
}

public class Mainn {
    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;

        try{
            j = 18 / i;

            if(j == 0){
                throw new MyException("Its my own exception");
            }
        }
        catch(MyException e){
            j = 18 / 1;
            // System.out.println("Cannot div by zero");
            System.out.println("Thats the default output " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
