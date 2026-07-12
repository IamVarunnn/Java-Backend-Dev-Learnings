import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{

    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student st){
        if(this.age > st.age){
            return 1;
        }
        else{
            return -1;
        }
    }
    
}


// class Student{

//     int age;
//     String name;

//     public Student(int age, String name){
//         this.age = age;
//         this.name = name;
//     }

//     @Override
//     public String toString() {
//         return "Student [age=" + age + ", name=" + name + "]";
//     }
    
// }

class Main{
    public static void main(String[] args) {
        
        // Comparator<Integer> com = new Comparator<Integer>() {
            
        //     public int compare(Integer i, Integer j){
                
        //         if(i % 10 > j % 10){
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // };

        // Comparator<Integer> com = (Integer i, Integer j) ->{
                
        //         if(i % 10 > j % 10){
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
            
        // };



        // List<Integer> ls = new ArrayList<>();

        
        // ls.add(51);
        // ls.add(53);
        // ls.add(50);
        // ls.add(92);

        // // Collections.sort(ls);
        // Collections.sort(ls, com);
        
        // System.out.println(ls);


        List<Student> sts = new ArrayList<>();


        sts.add(new Student(19, "Alex"));
        sts.add(new Student(17, "Bob"));
        sts.add(new Student(26, "Carry"));
        sts.add(new Student(25, "John"));

        Comparator<Student> com = new Comparator<Student>() {
            
            public int compare(Student i, Student j){

                if(i.age > j.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        // Collections.sort(sts, (a, b) -> a.age - b.age);
        // Collections.sort(sts, com);
        Collections.sort(sts);

        for(Student s : sts){
            System.out.println(s);
        }
    }
}