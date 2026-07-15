import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExOne {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ales", "Bob", "Carry", "Dawin");

        Optional<String> name = names.stream()
                                .filter(s -> s.contains("o"))
                                .findFirst();
        
        System.out.println(name.orElse("No Name Found"));


        String word = names.stream()
                        .filter(s -> s.contains("o"))
                        .findFirst()
                        .orElse("No Name Found");

        System.out.println(word);

    }
}
