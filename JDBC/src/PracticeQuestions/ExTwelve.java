package PracticeQuestions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExTwelve {
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String pass = "your_password";

        String query = "SELECT COUNT(*) AS total FROM student";


        try(Connection con = DriverManager.getConnection(url, user, pass)){

            Statement st = con.createStatement();

            ResultSet resultSet = st.executeQuery(query);


            while(resultSet.next()){

                System.out.println(resultSet.getString("total"));
                System.out.println();

            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
