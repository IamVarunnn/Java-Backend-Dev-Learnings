import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{

    int id;
    String name;
    double salary;

    public int compareTo(Employee emp){

        if(this.salary > emp.salary){
            return 1;
        }
        else{
            return -1;
        }
    }

}


class Worker{

    int id;
    String name;
    double salary;

    public Worker(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class ExThree {
    public static void main(String[] args) {

        
        List<Worker> ls = new ArrayList<>();

        ls.add(new Worker(1, "Rachan", 20000));
        ls.add(new Worker(2, "KRA", 2000));
        ls.add(new Worker(3, "SAN", 10000));

        Comparator<Worker> com = new Comparator<Worker>(){

            public int compare(Worker ii, Worker jj){

                if(ii.name.length() > jj.name.length()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        

    }    
}
