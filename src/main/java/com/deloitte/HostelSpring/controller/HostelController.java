package com.deloitte.HostelSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.HostelSpring.entity.Student;

@RestController

public class HostelController {
	
	
	
	@Autowired
	private RestTemplate restTemplate ;
	
	static final String STUDENT_URL_MS = "http://localhost:8080/";
	
	@GetMapping("/find/{name}")
	public List<Student> fetchStudent( @PathVariable String name ) {
		

//		 return restTemplate.exchange( "http://localhost:8080/api/student/studentsByNameOrMail/John/peter@gmail.com", HttpMethod.GET,null,List.class ).getBody();
		
		 return restTemplate.exchange( STUDENT_URL_MS+"api/student/studentsByName/"+name, HttpMethod.GET,null,List.class ).getBody();
		 
//		 return restTemplate.exchange( STUDENT_URL_MS+"api/student/studentsByName/{name}"+name, HttpMethod.GET,null,List.class).getBody();
		
	}
	
	@GetMapping("/findStudent")
	public List<Student> fetchallStudents(){
		 return restTemplate.exchange(STUDENT_URL_MS+"api/student/all",HttpMethod.GET,null,List.class ).getBody();
	}
	
	
	//http://localhost:8080/api/student/studentsByName/John

}
