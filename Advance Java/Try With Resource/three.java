
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// package Try With Resource;

public class three {
    public static void main(String[] args) throws IOException {
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("Enter a value");
            int n = Integer.parseInt(br.readLine());

            if(n < 0){
                throw new IllegalArgumentException("Negative numbers not allowed");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
