package com.telusko.SpringJDBCEx.service;

import com.telusko.SpringJDBCEx.model.Student;
import com.telusko.SpringJDBCEx.repo.StudentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class StudentService {

    private StudentRep repo;

    public StudentRep getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRep repo) {
        this.repo = repo;
    }

    public void addStudent(Student student){
        repo.save(student);
    }

    public List<Student> getStudents(){
        return repo.findAll();
    }
}
