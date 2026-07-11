
import java.util.HashMap;
import java.util.Map;

// package Map;

public class Main {
    public static void main(String[] args) {
        

        Map<String, Integer> students = new HashMap<>();

        students.put("Navin", 56);
        students.put("Karan", 54);
        students.put("Sushil", 89);
        students.put("Kiran", 14);
        students.put("Kiran", 74);


        // System.out.println(students.get("Kiran"));

        for(String name : students.keySet()){

            System.out.println(name + " " + students.get(name));
        }
    }


}
