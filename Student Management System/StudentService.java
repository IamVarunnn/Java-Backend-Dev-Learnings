import java.util.ArrayList;
import java.util.List;

public class StudentService {
    
    List<Student> ls;

    public StudentService(){
        ls = new ArrayList<>();
    }
    
    public void addStudent(Student stu){

        if(stu.getMarks() < 0 || stu.getMarks() > 100){
            System.out.println("Invalid Marks");
            return;
        }

        for(Student s : ls){
            if(s.getId() == stu.getId()){
                System.out.println("ID already exists");
                return;
            }
        }

        ls.add(stu);
        System.out.println("Student Added Successfully");
    }

    public void viewStudents(){

        if(ls.isEmpty()){
            System.out.println("No Students Found");
            return;
        }
        for(Student st : ls){
           
           
            System.out.println("Student Id" + st.getId());
            System.out.println("Student Name" + st.getName());
            System.out.println("Student Marks" + st.getMarks());
             
        }
    }

    public void searchById(int id){

       

        for(Student s : ls){

            if(s.getId() == id){
                System.out.println("ID : " + s.getId());
                System.out.println("Name : " + s.getName());
                System.out.println("Marks : " + s.getMarks());
                return;
            }
             
        }
        System.out.println("Student Not Found");
    }

    public void delStudent(int id){

         

        for(int i = 0; i < ls.size(); i++){

            if(ls.get(i).getId() == id){
                ls.remove(i);
                System.out.println("Student Deleted Successfully");
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public void updateDetails(int id, Student st){

        if(st.getMarks() < 0 || st.getMarks() > 100){
            System.out.println("Invalid Marks");
            return;
        }

        for(Student s : ls){

            if(s.getId() == id){

                s.setName(st.getName());
                s.setMarks(st.getMarks());

                System.out.println("Updated Successfully");
                return;
            }
        }

        System.out.println("Student Not Found");
    }


}
