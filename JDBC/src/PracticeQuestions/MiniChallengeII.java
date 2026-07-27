package PracticeQuestions;

import com.mysql.cj.protocol.x.ReusableOutputStream;

import java.sql.*;

public class MiniChallengeII {
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String pass = "your_password";

        String query = "SELECT * FROM student ";
        int count = 1;

        System.out.println("========== STUDENT REPORT ==========");

        try(Connection con = DriverManager.getConnection(url, user, pass)){

            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("Student " + count);
                System.out.println("-------------------------");
                System.out.println("ID     : " + rs.getString("id"));
                System.out.println("Name   : " + rs.getString("name"));
                System.out.println("Marks  : " + rs.getString("marks"));
                int marks = rs.getInt("marks");

                if (marks >= 35) {
                    System.out.println("Result : PASS");
                } else {
                    System.out.println("Result : FAIL");
                }
                System.out.println();
                count++;
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
