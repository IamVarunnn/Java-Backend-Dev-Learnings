
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// package Try With Resource;


class InvalidAgeException extends Exception{

    public InvalidAgeException(){
        super();
    }
}

public class four {
    public static void main(String[] args) throws IOException {
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("Enter a age");
            int age = Integer.parseInt(br.readLine());

            if(age < 18){
                throw new InvalidAgeException();
            }
        }
        catch(Exception e){
            System.out.println("Invalid age");
        }
    }
}
