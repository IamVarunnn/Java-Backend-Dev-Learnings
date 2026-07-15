// package Constructor Reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int age;

    public Student(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        

        List<String> names = Arrays.asList("Alex", "Bob", "Carry");

        List<Student> students = new ArrayList<>();


        // for(String name : names){
        //     students.add(new Student(name));
        // }

        // students = names.stream()
        //             .map(name -> new Student(name))
        //             .toList();

        students = names.stream()
                    .map(Student :: new)
                    .toList();

        System.out.println(students);
    }
}
