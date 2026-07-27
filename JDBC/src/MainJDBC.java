
import java.sql.*;

public class MainJDBC {
    public static void main(String[] args) throws Exception {


        /*
            import package
            load and register
            create connections
            create statement
            execute statement
            process the results
            close connection
         */

//        Class.forName("com.mysql.cj.jdbc.Driver");

//        String url = "jdbc:mysql://localhost:3306/your_database";
//        String user = "your_username";
//        String pass = "your_password";
//
////        String query = "SELECT name FROM student where id = 1";
//        String query = "SELECT * FROM student";
//
//        Connection con = DriverManager.getConnection(url, user, password);
//        System.out.println("Connection established");

//        Statement st = con.createStatement();
//
//        ResultSet resultSet = st.executeQuery(query);
//
////        resultSet.next();
////
////        String name =  resultSet.getString("name");
////        System.out.println("Name of a student is " + name);
//
//
////        while(resultSet.next()){
////            System.out.println("The id is " + resultSet.getString("id"));
////            System.out.println("The name is " + resultSet.getString("name"));
////            System.out.println("The marks are " + resultSet.getString("marks"));
////            System.out.println();
////        }
//
//        while(resultSet.next()){
//            System.out.print(resultSet.getString("id") + " ");
//            System.out.print(resultSet.getString("name") + " ");
//            System.out.println(resultSet.getString("marks") + " ");
//            System.out.println();
//        }
//
//        con.close();
//        System.out.println("Connection Closed!");

//        String url = "jdbc:mysql://localhost:3306/your_database";
//String user = "your_username";
//String pass = "your_password";
//
//
////        String query = "INSERT INTO student VALUES (5, 'John', 59)";
////        String query = "UPDATE student SET name = 'Max' where id = 5";
//        String query = "DELETE FROM student WHERE id = 5;";
//
//        Connection con = DriverManager.getConnection(url, user, password);
//        System.out.println("Connection established");
//        Statement st = con.createStatement();
//
//
//        st.execute(query);
//
//
//
//        con.close();
//        System.out.println("Connection Closed!");


//        String url = "jdbc:mysql://localhost:3306/your_database";
//String user = "your_username";
//String pass = "your_password";
//
//        int id = 9;
//        String name = "Vix";
//        int marks = 89;
//
//        String query = "INSERT INTO student VALUES ( " + id + ",' " + name + " ', " + marks + " ) ";
//
//        Connection con = DriverManager.getConnection(url, user, password);
//        System.out.println("Connection established");
//        Statement st = con.createStatement();


        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String pass = "your_password";

        int id = 8;
        String name = "Vox";
        int marks = 98;

        String query = "INSERT INTO student VALUES (?, ?, ?)";

        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection established");



        PreparedStatement st = con.prepareStatement(query);

        st.setInt(1, id);
        st.setString(2, name);
        st.setInt(3, marks);


        st.execute();

        con.close();
        System.out.println("Connection Closed!");
    }
}
