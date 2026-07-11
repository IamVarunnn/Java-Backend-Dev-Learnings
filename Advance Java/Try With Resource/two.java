
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// package Try With Resource;

public class two {
    public static void main(String[] args) throws IOException {
        

        try(BufferedReader br = new BufferedReader(new InputStreamReader((System.in)))){

            System.out.println("Enter first number");
            int a = Integer.parseInt(br.readLine());

            System.out.println("Enter Second number");
            int b = Integer.parseInt(br.readLine());

            System.out.println("The sum is " + (a + b));
        }
    }
}
