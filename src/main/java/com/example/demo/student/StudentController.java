package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// will contain all the resources for the api
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
	public List<Student> getStudents(){
//		return "Hello World";
//		return List.of("Hello", "World");
		return List.of(new Student(1L, "Mariam","mariam.jamal@gmail.com",
				LocalDate.of(2000, Month.JANUARY, 5), 21));

	}
}
