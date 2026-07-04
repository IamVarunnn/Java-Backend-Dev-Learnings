
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// package Comparator & Comp;

class Student implements Comparable<Student>{
    

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that){

        if(this.age > that.age){
            return 1;
        }
        else{
            return -1;
        }
    }

    
}

public class AA {
    public static void main(String[] args) {
        
        // Comparator<Integer> com = new Comparator<Integer>(){

        //     public int compare(Integer i, Integer j){

        //         if(i % 10 > j % 10){
        //             return  1;
        //         }
        //         return -1;

        //     }
        // };

        // List<Integer> ls = new ArrayList<>();

        // ls.add(42);
        // ls.add(53);
        // ls.add(90);
        // ls.add(07);

        // Collections.sort(ls, com);

        // // System.out.println(ls);

        // printString();


        // Comparator<Student> com = new Comparator<Student>() {
            
        //     public int compare(Student i, Student j){

        //         if(i.age > j.age){
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // };

        Comparator<Student> com = (Student i, Student j)->{

            return i.age > j.age ? 1 : -1;
        };

        List<Student> st = new ArrayList<>();

        st.add(new Student(13, "Navun"));
        st.add(new Student(12, "John"));
        st.add(new Student(18, "Alex"));
        st.add(new Student(20, "Bob"));

        Collections.sort(st, com);

        // Collections.sort(st);
        
        for(Student s : st){
            System.out.println(s);
        }
    }

    public static void printString(){

        Comparator<String> com = new Comparator<String>() {
            
            public int compare(String i, String j){

                if(i.length() > j.length()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };


        List<String> ls = new ArrayList<>();

        ls.add("Sushil");
        ls.add("Navin");
        ls.add("Raj");
        ls.add("Ajay");
        ls.add("a");


        Collections.sort(ls, com);

        System.out.println(ls);
    }
    
}
