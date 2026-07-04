
import java.util.ArrayList;
import java.util.Collection;





public class AA {
    public static void main(String[] args) {
        
        Collection nums = new ArrayList();

        nums.add(5);
        nums.add(8);
        nums.add(3);
        nums.add(9);
        nums.add("3");



        for(Object it : nums){
            System.out.println(it);
        }

        // for(int it : nums){
        //     System.out.println(it);
        // }

        System.out.println(nums);
    }
}
