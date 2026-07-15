
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// package Constructor Reference;

class Employee{
    String name;

    public Employee(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + "]";
    }
}

public class ExOne {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alex", "Bob", "John");   


        List<Employee> ls = new ArrayList<>();

        ls = names.stream()
                    .map(Employee :: new)
                    .toList();

        System.out.println(ls);
    }
}
