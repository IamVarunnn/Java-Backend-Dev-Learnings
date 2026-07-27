package PracticeQuestions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MiniChallenge {
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String pass = "your_password";

        String query = "SELECT * FROM student";
        int count = 1;

        try(Connection con = DriverManager.getConnection(url, user, pass)){

            Statement st = con.createStatement();

            ResultSet resultSet = st.executeQuery(query);

            System.out.println("------ Student Details ------");
            while(resultSet.next()){

                System.out.println("Student  " + count);
                System.out.println("ID     : " + resultSet.getString("id"));
                System.out.println("Name   : " + resultSet.getString("name"));
                System.out.println("Marks  : " + resultSet.getString("marks"));
                System.out.println("-----------------------------");
                System.out.println();
                count++;
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
