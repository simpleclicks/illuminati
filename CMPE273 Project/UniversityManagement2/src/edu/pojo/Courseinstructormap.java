package edu.pojo;
// Generated 16 Apr, 2013 10:53:37 PM by Hibernate Tools 3.1.0.beta4



/**
 * Courseinstructormap generated by hbm2java
 */

public class Courseinstructormap  implements java.io.Serializable {


    // Fields    

     private int ciid;
     private Course course;
     private Instructor instructor;


    // Constructors

    /** default constructor */
    public Courseinstructormap() {
    }

	/** minimal constructor */
    public Courseinstructormap(int ciid) {
        this.ciid = ciid;
    }
    
    /** full constructor */
    public Courseinstructormap(int ciid, Course course, Instructor instructor) {
        this.ciid = ciid;
        this.course = course;
        this.instructor = instructor;
    }
    

   
    // Property accessors

    public int getCiid() {
        return this.ciid;
    }
    
    public void setCiid(int ciid) {
        this.ciid = ciid;
    }

    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }
    
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
   








}
