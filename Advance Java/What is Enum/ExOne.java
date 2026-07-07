// package What is Enum;

enum Role{
    ADMIN,
    CUSTOMER,
    SELLER;
}

class User{

    String name;
    Role role;

    public User(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Role : " + role);
    }

    
}

public class ExOne {
    public static void main(String[] args) {
        
        User admin = new User("Raj", Role.ADMIN);
        User user = new User("Rahul", Role.CUSTOMER);

        // System.out.println(admin);
        admin.display();
    }
}
