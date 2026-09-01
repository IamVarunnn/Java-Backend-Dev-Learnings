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
public class StudentRep {


    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student s){

        String query = "insert into student (rollno, name, marks) values (?, ?, ?)";

        int rows = jdbcTemplate.update(query, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println(rows + " effects");
    }

    public List<Student> findAll(){

        String query = "select * from student";

        RowMapper<Student> rowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

                Student s = new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));

                return s;
            }
        };

        return jdbcTemplate.query(query, rowMapper);
    }
}
