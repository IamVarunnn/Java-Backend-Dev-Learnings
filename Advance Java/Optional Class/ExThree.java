import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExThree {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alex", "Bob", "Carry");


        Optional<String> name = names.stream()
                                .filter(s -> s.length() > 10)
                                .findFirst();

        System.out.println(name.orElse("Not Available"));

        String word = names.stream()
                        .filter(s -> s.length() > 10)
                        .findFirst()
                        .orElse("Unavailable");

        System.out.println(word);
    }
}
