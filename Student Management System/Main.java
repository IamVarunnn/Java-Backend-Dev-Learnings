public class Main {
    public static void main(String[] args) {
        

        Student st1 = new Student(101, "Varun", 92); 
        Student st2 = new Student(102, "Arjun", 95); 
        Student st3 = new Student(103, "Karn", 82); 
        Student st4 = new Student(104, "Veer", 72);  


        StudentService service = new StudentService();
        service.addStudent(st1);
        service.addStudent(st2);
        service.addStudent(st3);
        service.addStudent(st4);

        // service.viewStudents();
        // service.searchById(101);

        Student st = new Student(104, "Veeru", 95);
        service.updateDetails(104, st);


    }
}
