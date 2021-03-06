package edu.pojo;
// Generated 16 Apr, 2013 10:53:37 PM by Hibernate Tools 3.1.0.beta4

import java.util.HashSet;
import java.util.Set;


/**
 * Person generated by hbm2java
 */

public class Person  implements java.io.Serializable {


    // Fields    

     private int personId;
     private String firstName;
     private String lastName;
     private String address;
     private String city;
     private String state;
     private Integer zipCode;
     private String associatedCourses;
     private Set students = new HashSet(0);
     private Set instructors = new HashSet(0);


    // Constructors

    /** default constructor */
    public Person() {
    }

	/** minimal constructor */
    public Person(int personId) {
        this.personId = personId;
    }
    
    /** full constructor */
    public Person(int personId, String firstName, String lastName, String address, String city, String state, Integer zipCode, String associatedCourses, Set students, Set instructors) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.associatedCourses = associatedCourses;
        this.students = students;
        this.instructors = instructors;
    }
    

   
    // Property accessors

    public int getPersonId() {
        return this.personId;
    }
    
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getAssociatedCourses() {
        return this.associatedCourses;
    }
    
    public void setAssociatedCourses(String associatedCourses) {
        this.associatedCourses = associatedCourses;
    }

    public Set getStudents() {
        return this.students;
    }
    
    public void setStudents(Set students) {
        this.students = students;
    }

    public Set getInstructors() {
        return this.instructors;
    }
    
    public void setInstructors(Set instructors) {
        this.instructors = instructors;
    }
   








}
