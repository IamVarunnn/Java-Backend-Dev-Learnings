package com.telusko.SpringJDBCEx.repo;

import com.telusko.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student s){

        String query = "insert into student (rollNo, name, marks) values (?, ?, ?)";

        int rows = jdbcTemplate.update(query, s.getRollNo(), s.getName(), s.getMarks());

        System.out.println("Saved to database " + rows + " affected");
    }

    public List<Student> findAll(){

        String sqlQuery = "select * from student";

        RowMapper<Student> rowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setRollNo(rs.getInt("rollNo"));
                student.setName(rs.getString("name"));
                student.setRollNo(rs.getInt("marks"));

                return student;
            }
        };

        return jdbcTemplate.query(sqlQuery, rowMapper);
    }

}
