// package Custom Exception;


class MyException extends Exception{

    public MyException(){

    }

    public MyException(String str){
        super(str);
    }
}

public class Main {
    public static void main(String[] args) {
        

        int i = 20;
        int j = 0;

        try {
            j = 18 / i;

            if(j == 0){
                throw new MyException();
            }
        } catch (MyException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }

    }   
}
