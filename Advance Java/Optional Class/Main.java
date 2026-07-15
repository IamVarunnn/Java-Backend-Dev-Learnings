import java.util.Arrays;
import java.util.List;

class Main{

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Ales", "Bob", "Carry", "Dawin");

        // Optional<String> name = names.stream()
        //                 .filter(s -> s.contains("x"))
        //                 .findFirst();


        // System.out.println(name.orElse("Not Found"));

        String name = names.stream()
                        .filter(s -> s.contains("x"))
                        .findFirst()
                        .orElse("Not Found");


        System.out.println(name);
    }
}