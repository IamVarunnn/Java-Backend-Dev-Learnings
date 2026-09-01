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

    public void save(Student student){
//        System.out.println("Student Added");

        String sql = "insert into student (rollno, name, marks) values (?,?,?)";
        int rows = jdbcTemplate.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println(rows + " affected");
    }

    public List<Student> findAll(){

        String sql = "select * from student";

        RowMapper<Student> mapper = (rs, rowNum) -> {

                Student s =  new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;

        };

        return jdbcTemplate.query(sql, mapper);

    }
}
