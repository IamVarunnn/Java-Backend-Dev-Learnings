

import java.util.Map;
import java.util.TreeMap;

public class AA {
    public static void main(String[] args) {
        
        Map<String, Integer> mpp = new TreeMap<>();
        

        mpp.put("Navin", 67);
        mpp.put("Kiran", 70);
        mpp.put("Harsh", 75);
        mpp.put("Sushil", 68);

        // System.out.println(mpp.get("Harsh"));

        mpp.put("Harsh", 80);

        // System.out.println(mpp.get("Harsh"));

        
        System.out.println(mpp.keySet());
        
        for(String name : mpp.keySet()){
            System.out.println(name);
        }
    }
}
