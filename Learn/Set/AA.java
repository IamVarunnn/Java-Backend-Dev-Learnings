import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class AA{
    public static void main(String[] args) {
        

        Set<Integer> nums = new TreeSet<>();

        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);

        Iterator<Integer> values = nums.iterator();

        // System.out.println(values.next());

        // System.out.println(nums);
        
        while(values.hasNext()){
            System.out.println(values.next());
        }

    }
}