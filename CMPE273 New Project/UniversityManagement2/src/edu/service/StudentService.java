package edu.service;

import edu.service.helper.PersonHelper;

public class StudentService {
	
	PersonHelper helper = null;
	
	public StudentService() {
		this.helper = new PersonHelper();
	}
	
	public String addStudent(String studentId, String firstname, String lastname, String address,
			String city, String state, int zipCode, String courseList)
	{
		return null;		
	}
	
	public String deleteStudent(String studentId)
	{
		return null;
	}
}
