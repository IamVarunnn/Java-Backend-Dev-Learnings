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


		Student student = context.getBean(Student.class);
		student.setName("Kran");
		student.setRollNo(34);
		student.setMarks(56);


		StudentService service = context.getBean(StudentService.class);

		service.addStudent(student);

		List<Student> studentList = service.getStudents();
		System.out.println(studentList);

	}

}
