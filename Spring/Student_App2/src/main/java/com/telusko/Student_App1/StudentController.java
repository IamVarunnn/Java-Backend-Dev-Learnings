package com.telusko.Student_App1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepo repo;

    @GetMapping("/getStudents")
    public List<Student> getStudents(){

        return repo.findAll();
    }
}
