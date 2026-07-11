
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// package Try With Resource;

public class Main {
    public static void main(String[] args) throws IOException {
        

        // int num = 0;

        // BufferedReader br = null;

        // try {
        //     // InputStreamReader in = new InputStreamReader(System.in);
        //     // br = new BufferedReader(in);

        //     br = new BufferedReader(new InputStreamReader(System.in));

        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);

            
        // }
        // finally{
        //     br.close();
        // }

        int num = 0;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
         
    }
}
