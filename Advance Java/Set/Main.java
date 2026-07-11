
import java.util.HashSet;
import java.util.Set;



class Main{
    public static void main(String[] args) {
        
        Set<Integer> nums = new HashSet<>();

        
        nums.add(8);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(8);
        nums.add(8);
        nums.add(2);

        for(int n : nums){
            System.out.println(n);
            
        }
    }
}