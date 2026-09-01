package com.telusko.SpringJDBCEx;

import com.telusko.SpringJDBCEx.model.Student;
import com.telusko.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);


		Student student = new Student();
		student.setRollNo(21);
		student.setName("Raj");
		student.setMarks(67);


		StudentService service = context.getBean(StudentService.class);
		service.addStudent(student);

		List<Student> ls = service.getStudents();
		System.out.println(ls);
	}

}
