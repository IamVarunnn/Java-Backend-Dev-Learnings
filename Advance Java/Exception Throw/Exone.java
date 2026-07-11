// package Exception Throw;

public class Exone {
    public static void main(String[] args) {
        

        int marks = 120;

        try {
            
            if(marks >= 0 && marks <= 100){
                System.out.println(marks);
            }

            if(marks < 0 || marks > 100){
                throw new IllegalArgumentException(" Marks cannot be like this");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Marks" + e.getMessage());
        }
        
    }
}
