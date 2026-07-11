
import java.io.IOException;
import java.util.Scanner;

// package BuffReader and Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        

        System.out.println("Enter a number");

         
        // int num = System.in.read();
        // System.out.println(num - 48);
        
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in);

        // int n = Integer.parseInt(br.readLine());

        // System.out.println(n);

        // br.close();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n);
         
    }
}
