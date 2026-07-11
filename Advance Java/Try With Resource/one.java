
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// package Try With Resource;

public class one {
    public static void main(String[] args) throws IOException {
        


        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("Enter a name");
            String s = br.readLine();
            System.out.println("Welcome " + s);
        }
    }
}
