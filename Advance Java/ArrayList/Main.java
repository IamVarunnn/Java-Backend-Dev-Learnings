
import java.util.ArrayList;
import java.util.List;

// package ArrayList;



public class Main {
    public static void main(String[] args) {
        
        // Collection<Integer> nums = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();

        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);

        
        for(int n : nums){
            System.out.println(n);
        }

        // System.out.println(nums);
        System.out.println(nums.indexOf(9));
    }
}
