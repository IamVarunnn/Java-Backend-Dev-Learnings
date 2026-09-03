package com.telusko.SpringJDBCEx;

import com.telusko.SpringJDBCEx.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcExApplication.class, args);

		Student student = new Student();

		student.setRollNo(2);
		student.setName("Alex");
		student.setMarks(70);

		System.out.println(student);
	}

}
