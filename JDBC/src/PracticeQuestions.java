import java.sql.*;

public class PracticeQuestions {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String pass = "your_password";

//        String query = "SELECT name FROM student";
        String query = "SELECT id,name FROM student";
//        String query = "SELECT id FROM student";

        Connection con = DriverManager.getConnection(url, user, pass);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        rs.next();

//        String name = rs.getString("name");
//        String id = rs.getString("id");

        String name = rs.getString(2);
        String id = rs.getString(1);


        // PracticeQuestions.ExOne
        System.out.println("The student name is " + name);

        // ExTwo
        System.out.println("The name is " + name + " and the id is " + id);

        // ExThree
        System.out.println("The id is " + id);

        // ExFour
        System.out.println();
    }
}
