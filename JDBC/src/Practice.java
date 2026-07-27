import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Practice {
    public static void main(String[] args) throws Exception {


        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String pass = "your_password";

//        String sqlQuery = "SELECT name FROM student where id = 1";
        String sqlQuery = "SELECT * FROM student";

        Connection con = DriverManager.getConnection(url, user, pass);
        System.out.println("Connection established");

        Statement st = con.createStatement();
        ResultSet resultSet =  st.executeQuery(sqlQuery);

//        System.out.println(resultSet.next());

        resultSet.next();

        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");

        System.out.println("The Student name is " + name + " and ths id is " + id);


        con.close();
        System.out.println("Connection Closed");



    }
}
