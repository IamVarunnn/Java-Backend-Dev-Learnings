package com.telusko.SpringJDBCEx.repo;

import com.telusko.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    public void save(Student s){
        System.out.println("Saved to database");
    }

    public List<Student> findAll(){
        return new ArrayList<>();
    }

}
