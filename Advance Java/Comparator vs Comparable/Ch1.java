
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ch1 {
    public static void main(String[] args) {
        

        ArrayList<String> ls = new ArrayList<>();

        ls.add("Beeb");
        ls.add("Cando");
        ls.add("Christa");
        ls.add("Any");
        ls.add("Meccamelom");


        // Comparator<String> com = (String i, String j) ->{

        //     if(i.length() > j.length()){
        //         return 1;
        //     }
        //     else{
        //         return -1;
        //     }
        // };

        Comparator<String> com = (String i, String j) ->{

            return i.length() > j.length() ? 1 : -1;
              
        };

        Collections.sort(ls, com);

        System.out.println(ls);
    }
}
