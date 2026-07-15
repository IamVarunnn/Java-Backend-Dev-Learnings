import java.util.Arrays;
import java.util.List;

public class ExOne {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("alex", "bob", "john");

        List<String> list = names.stream()
                            .map(String :: toUpperCase)
                            .toList();

        list.forEach(System.out :: println);

        List<String> list2 = names.stream()
                            .map(String :: toLowerCase)
                            .toList();

        list2.forEach(System.out :: println);

        List<Integer> list3 = names.stream()
                            .map(String :: length)
                            .toList();

        list3.forEach(System.out :: println);

    }
}
