package edu.web;

public class UniversityDBProxy implements edu.web.UniversityDB {
  private String _endpoint = null;
  private edu.web.UniversityDB universityDB = null;
  
  public UniversityDBProxy() {
    _initUniversityDBProxy();
  }
  
  public UniversityDBProxy(String endpoint) {
    _endpoint = endpoint;
    _initUniversityDBProxy();
  }
  
  private void _initUniversityDBProxy() {
    try {
      universityDB = (new edu.web.UniversityDBServiceLocator()).getUniversityDB();
      if (universityDB != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)universityDB)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)universityDB)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (universityDB != null)
      ((javax.xml.rpc.Stub)universityDB)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.web.UniversityDB getUniversityDB() {
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB;
  }
  
  public java.lang.String displayCourseInfo() throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.displayCourseInfo();
  }
  
  public java.lang.String displayPersonInfo() throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.displayPersonInfo();
  }
  
  public java.lang.String listInstructors() throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.listInstructors();
  }
  
  public java.lang.String unEnrollStudent(java.lang.String studentId) throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.unEnrollStudent(studentId);
  }
  
  public java.lang.String deleteStudent(java.lang.String studentId) throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.deleteStudent(studentId);
  }
  
  public java.lang.String addInstructor(java.lang.String instructorId, java.lang.String firstname, java.lang.String lastname, java.lang.String address, java.lang.String city, java.lang.String state, int zipCode, java.lang.String courseList, java.lang.String department, java.lang.String meetingTime) throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.addInstructor(instructorId, firstname, lastname, address, city, state, zipCode, courseList, department, meetingTime);
  }
  
  public java.lang.String deleteInstructor(java.lang.String instructorId) throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.deleteInstructor(instructorId);
  }
  
  public java.lang.String enrollStudent(java.lang.String studentId, java.lang.String courseId) throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.enrollStudent(studentId, courseId);
  }
  
  public java.lang.String unAssignInstructor(java.lang.String instructorId) throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.unAssignInstructor(instructorId);
  }
  
  public java.lang.String assignInstructor(java.lang.String courseId, java.lang.String instructorId) throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.assignInstructor(courseId, instructorId);
  }
  
  public java.lang.String findCourse() throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.findCourse();
  }
  
  public java.lang.String findPreson() throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.findPreson();
  }
  
  public java.lang.String listStudents() throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.listStudents();
  }
  
  public java.lang.String listCourse() throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.listCourse();
  }
  
  public java.lang.String addStudent(java.lang.String studentId, java.lang.String firstname, java.lang.String lastname, java.lang.String address, java.lang.String city, java.lang.String state, int zipCode, java.lang.String courseList) throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.addStudent(studentId, firstname, lastname, address, city, state, zipCode, courseList);
  }
  
  public java.lang.String addCourse(java.lang.String courseId, java.lang.String courseName, java.lang.String courseSection, java.lang.String location) throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.addCourse(courseId, courseName, courseSection, location);
  }
  
  public java.lang.String deleteCourse(java.lang.String courseId) throws java.rmi.RemoteException{
    if (universityDB == null)
      _initUniversityDBProxy();
    return universityDB.deleteCourse(courseId);
  }
  
  
}