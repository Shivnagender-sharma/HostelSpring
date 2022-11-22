package com.deloitte.HostelSpring.entity;

import java.util.List;


public class Student {
	
	private String id ;
	
	private String name ;
	
	private String email ;
	
	private Department department ;
	
	private List<Subject> subjects ;

	public Student(String name, String email, Department department, List<Subject> subjects) {
		super();
		this.name = name;
		this.email = email;
		this.department = department;
		this.subjects = subjects;
		
	}

	public Student(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department
				+ ", subjects=" + subjects + "]";
	}


	
	
	

}
