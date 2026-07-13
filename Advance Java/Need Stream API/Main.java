import java.util.Arrays;
import java.util.List;

class Main{
    public static void main(String[] args) {
        
        // List<Integer> nums = Arrays.asList(3, 4, 5, 7, 6);

        // int sum = 0;

        // for(int n : nums){

        //     if(n % 2 == 0){
        //         n = n * 2;
        //         sum += n;
        //     }
        // }

        // System.out.println(sum);

        // List<Integer> nums = Arrays.asList(3, 4, 5, 7, 6);

        // for(int i = 0; i < nums.size(); i++){
        //     System.out.println(nums.get(i));
        // }

        // List<Integer> nums = Arrays.asList(3, 4, 5, 7, 6);

        // for(int n : nums){
        //     System.out.println(n);
        // }

        List<Integer> nums = Arrays.asList(3, 4, 5, 7, 6);

        nums.forEach(n -> System.out.println(n));




        
    }
}