package com.SpringJdbc;

import com.SpringJdbc.model.Student;

import com.SpringJdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;


@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbcApplication.class, args);

		Student stu=context.getBean(Student.class);
		stu.setRollno(54);
		stu.setName("pran");
		stu.setMarks(54);



		StudentService serv=context.getBean(StudentService.class);
		serv.addStudent(stu);

		List<Student> studs=serv.getStudent();
		System.out.println(studs);

	}

}
