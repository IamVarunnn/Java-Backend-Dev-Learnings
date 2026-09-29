package com.telusko.Student_App1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){

        return repo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent(){
        Student s = new Student();
        s.setAge(21);
        s.setName("Arun");


        repo.save(s);
    }
}
