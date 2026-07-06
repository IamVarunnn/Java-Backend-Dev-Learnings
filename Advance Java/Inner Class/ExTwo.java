// package Inner Class;


class Company{
    String name;

    public Company(String name) {
        this.name = name;
    }

    class Employee{
        int employeeId;
        String employeeName;
        double salary;

        public Employee(int employeeId, String employeeName, double salary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.salary = salary;
        }

        

        public void showDetails(){

            System.out.println(name);
            System.out.println("Employee Id" + this.employeeId + "Employee Name" + this.employeeName + "Salary" + this.salary);
        }
    }
    
}

public class ExTwo {
    public static void main(String[] args) {
        

        Company X = new Company("X");

        Company.Employee raj = X.new Employee(1, "Vaj", 8000.00);

        raj.showDetails();
    }
}
