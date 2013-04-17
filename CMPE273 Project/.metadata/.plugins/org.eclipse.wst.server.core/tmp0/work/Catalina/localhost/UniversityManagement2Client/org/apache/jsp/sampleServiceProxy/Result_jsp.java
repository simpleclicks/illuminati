package org.apache.jsp.sampleServiceProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Result_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Result</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1>Result</H1>\r\n");
      out.write("\r\n");
      Connections.ServiceProxy sampleServiceProxyid = null;
      synchronized (session) {
        sampleServiceProxyid = (Connections.ServiceProxy) _jspx_page_context.getAttribute("sampleServiceProxyid", PageContext.SESSION_SCOPE);
        if (sampleServiceProxyid == null){
          sampleServiceProxyid = new Connections.ServiceProxy();
          _jspx_page_context.setAttribute("sampleServiceProxyid", sampleServiceProxyid, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServiceProxyid.setEndpoint(request.getParameter("endpoint"));

      out.write("\r\n");
      out.write("\r\n");

String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getEndpoint2mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp3 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        Connections.Service getService10mtemp = sampleServiceProxyid.getService();
if(getService10mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getService10mtemp );
      out.write('\r');
      out.write('\n');

}else{
        if(getService10mtemp!= null){
        String tempreturnp11 = getService10mtemp.toString();
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempreturnp11);
      out.write("\r\n");
      out.write("        ");

        }}
break;
case 13:
        gotMethod = true;
        String courseId_1id=  request.getParameter("courseId16");
            java.lang.String courseId_1idTemp = null;
        if(!courseId_1id.equals("")){
         courseId_1idTemp  = courseId_1id;
        }
        java.lang.String deleteCourse13mtemp = sampleServiceProxyid.deleteCourse(courseId_1idTemp);
if(deleteCourse13mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(deleteCourse13mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteCourse13mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp14 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 18:
        gotMethod = true;
        String studentId_2id=  request.getParameter("studentId21");
            java.lang.String studentId_2idTemp = null;
        if(!studentId_2id.equals("")){
         studentId_2idTemp  = studentId_2id;
        }
        java.lang.String deleteStudent18mtemp = sampleServiceProxyid.deleteStudent(studentId_2idTemp);
if(deleteStudent18mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(deleteStudent18mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteStudent18mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp19 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 23:
        gotMethod = true;
        String instructorId_3id=  request.getParameter("instructorId26");
            java.lang.String instructorId_3idTemp = null;
        if(!instructorId_3id.equals("")){
         instructorId_3idTemp  = instructorId_3id;
        }
        java.lang.String deleteInstructor23mtemp = sampleServiceProxyid.deleteInstructor(instructorId_3idTemp);
if(deleteInstructor23mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(deleteInstructor23mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteInstructor23mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp24 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 28:
        gotMethod = true;
        String courseId_4id=  request.getParameter("courseId31");
            java.lang.String courseId_4idTemp = null;
        if(!courseId_4id.equals("")){
         courseId_4idTemp  = courseId_4id;
        }
        String instructorId_5id=  request.getParameter("instructorId33");
            java.lang.String instructorId_5idTemp = null;
        if(!instructorId_5id.equals("")){
         instructorId_5idTemp  = instructorId_5id;
        }
        java.lang.String assignInstructor28mtemp = sampleServiceProxyid.assignInstructor(courseId_4idTemp,instructorId_5idTemp);
if(assignInstructor28mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(assignInstructor28mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(assignInstructor28mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp29 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 35:
        gotMethod = true;
        String studentId_6id=  request.getParameter("studentId38");
            java.lang.String studentId_6idTemp = null;
        if(!studentId_6id.equals("")){
         studentId_6idTemp  = studentId_6id;
        }
        String courseId_7id=  request.getParameter("courseId40");
            java.lang.String courseId_7idTemp = null;
        if(!courseId_7id.equals("")){
         courseId_7idTemp  = courseId_7id;
        }
        java.lang.String enrollStudent35mtemp = sampleServiceProxyid.enrollStudent(studentId_6idTemp,courseId_7idTemp);
if(enrollStudent35mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(enrollStudent35mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(enrollStudent35mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp36 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 42:
        gotMethod = true;
        String studentId_8id=  request.getParameter("studentId45");
            java.lang.String studentId_8idTemp = null;
        if(!studentId_8id.equals("")){
         studentId_8idTemp  = studentId_8id;
        }
        java.lang.String unEnrollStudent42mtemp = sampleServiceProxyid.unEnrollStudent(studentId_8idTemp);
if(unEnrollStudent42mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(unEnrollStudent42mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp43 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(unEnrollStudent42mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp43 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 47:
        gotMethod = true;
        String instructorId_9id=  request.getParameter("instructorId50");
            java.lang.String instructorId_9idTemp = null;
        if(!instructorId_9id.equals("")){
         instructorId_9idTemp  = instructorId_9id;
        }
        java.lang.String unAssignInstructor47mtemp = sampleServiceProxyid.unAssignInstructor(instructorId_9idTemp);
if(unAssignInstructor47mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(unAssignInstructor47mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp48 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(unAssignInstructor47mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp48 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 52:
        gotMethod = true;
        String studentId_10id=  request.getParameter("studentId55");
            java.lang.String studentId_10idTemp = null;
        if(!studentId_10id.equals("")){
         studentId_10idTemp  = studentId_10id;
        }
        String firstname_11id=  request.getParameter("firstname57");
            java.lang.String firstname_11idTemp = null;
        if(!firstname_11id.equals("")){
         firstname_11idTemp  = firstname_11id;
        }
        String lastname_12id=  request.getParameter("lastname59");
            java.lang.String lastname_12idTemp = null;
        if(!lastname_12id.equals("")){
         lastname_12idTemp  = lastname_12id;
        }
        String address_13id=  request.getParameter("address61");
            java.lang.String address_13idTemp = null;
        if(!address_13id.equals("")){
         address_13idTemp  = address_13id;
        }
        String city_14id=  request.getParameter("city63");
            java.lang.String city_14idTemp = null;
        if(!city_14id.equals("")){
         city_14idTemp  = city_14id;
        }
        String state_15id=  request.getParameter("state65");
            java.lang.String state_15idTemp = null;
        if(!state_15id.equals("")){
         state_15idTemp  = state_15id;
        }
        String zipCode_16id=  request.getParameter("zipCode67");
        int zipCode_16idTemp  = Integer.parseInt(zipCode_16id);
        String courseList_17id=  request.getParameter("courseList69");
            java.lang.String courseList_17idTemp = null;
        if(!courseList_17id.equals("")){
         courseList_17idTemp  = courseList_17id;
        }
        java.lang.String addStudent52mtemp = sampleServiceProxyid.addStudent(studentId_10idTemp,firstname_11idTemp,lastname_12idTemp,address_13idTemp,city_14idTemp,state_15idTemp,zipCode_16idTemp,courseList_17idTemp);
if(addStudent52mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(addStudent52mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp53 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addStudent52mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp53 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 71:
        gotMethod = true;
        String instructorId_18id=  request.getParameter("instructorId74");
            java.lang.String instructorId_18idTemp = null;
        if(!instructorId_18id.equals("")){
         instructorId_18idTemp  = instructorId_18id;
        }
        String firstname_19id=  request.getParameter("firstname76");
            java.lang.String firstname_19idTemp = null;
        if(!firstname_19id.equals("")){
         firstname_19idTemp  = firstname_19id;
        }
        String lastname_20id=  request.getParameter("lastname78");
            java.lang.String lastname_20idTemp = null;
        if(!lastname_20id.equals("")){
         lastname_20idTemp  = lastname_20id;
        }
        String address_21id=  request.getParameter("address80");
            java.lang.String address_21idTemp = null;
        if(!address_21id.equals("")){
         address_21idTemp  = address_21id;
        }
        String city_22id=  request.getParameter("city82");
            java.lang.String city_22idTemp = null;
        if(!city_22id.equals("")){
         city_22idTemp  = city_22id;
        }
        String state_23id=  request.getParameter("state84");
            java.lang.String state_23idTemp = null;
        if(!state_23id.equals("")){
         state_23idTemp  = state_23id;
        }
        String zipCode_24id=  request.getParameter("zipCode86");
        int zipCode_24idTemp  = Integer.parseInt(zipCode_24id);
        String courseList_25id=  request.getParameter("courseList88");
            java.lang.String courseList_25idTemp = null;
        if(!courseList_25id.equals("")){
         courseList_25idTemp  = courseList_25id;
        }
        String department_26id=  request.getParameter("department90");
            java.lang.String department_26idTemp = null;
        if(!department_26id.equals("")){
         department_26idTemp  = department_26id;
        }
        String meetingTime_27id=  request.getParameter("meetingTime92");
            java.lang.String meetingTime_27idTemp = null;
        if(!meetingTime_27id.equals("")){
         meetingTime_27idTemp  = meetingTime_27id;
        }
        java.lang.String addInstructor71mtemp = sampleServiceProxyid.addInstructor(instructorId_18idTemp,firstname_19idTemp,lastname_20idTemp,address_21idTemp,city_22idTemp,state_23idTemp,zipCode_24idTemp,courseList_25idTemp,department_26idTemp,meetingTime_27idTemp);
if(addInstructor71mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(addInstructor71mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp72 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addInstructor71mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp72 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 94:
        gotMethod = true;
        java.lang.String listStudents94mtemp = sampleServiceProxyid.listStudents();
if(listStudents94mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(listStudents94mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp95 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(listStudents94mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp95 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 97:
        gotMethod = true;
        java.lang.String listCourse97mtemp = sampleServiceProxyid.listCourse();
if(listCourse97mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(listCourse97mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp98 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(listCourse97mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp98 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 100:
        gotMethod = true;
        java.lang.String findPreson100mtemp = sampleServiceProxyid.findPreson();
if(findPreson100mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(findPreson100mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp101 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(findPreson100mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp101 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 103:
        gotMethod = true;
        java.lang.String findCourse103mtemp = sampleServiceProxyid.findCourse();
if(findCourse103mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(findCourse103mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp104 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(findCourse103mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp104 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 106:
        gotMethod = true;
        java.lang.String displayCourseInfo106mtemp = sampleServiceProxyid.displayCourseInfo();
if(displayCourseInfo106mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(displayCourseInfo106mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp107 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(displayCourseInfo106mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp107 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 109:
        gotMethod = true;
        java.lang.String displayPersonInfo109mtemp = sampleServiceProxyid.displayPersonInfo();
if(displayPersonInfo109mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(displayPersonInfo109mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp110 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(displayPersonInfo109mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp110 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 112:
        gotMethod = true;
        java.lang.String listInstructors112mtemp = sampleServiceProxyid.listInstructors();
if(listInstructors112mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(listInstructors112mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp113 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(listInstructors112mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp113 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 115:
        gotMethod = true;
        String courseId_28id=  request.getParameter("courseId118");
            java.lang.String courseId_28idTemp = null;
        if(!courseId_28id.equals("")){
         courseId_28idTemp  = courseId_28id;
        }
        String courseName_29id=  request.getParameter("courseName120");
            java.lang.String courseName_29idTemp = null;
        if(!courseName_29id.equals("")){
         courseName_29idTemp  = courseName_29id;
        }
        String courseSection_30id=  request.getParameter("courseSection122");
            java.lang.String courseSection_30idTemp = null;
        if(!courseSection_30id.equals("")){
         courseSection_30idTemp  = courseSection_30id;
        }
        String location_31id=  request.getParameter("location124");
            java.lang.String location_31idTemp = null;
        if(!location_31id.equals("")){
         location_31idTemp  = location_31id;
        }
        java.lang.String addCourse115mtemp = sampleServiceProxyid.addCourse(courseId_28idTemp,courseName_29idTemp,courseSection_30idTemp,location_31idTemp);
if(addCourse115mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(addCourse115mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp116 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addCourse115mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp116 );
      out.write("\r\n");
      out.write("        ");

}
break;
}
} catch (Exception e) { 

      out.write("\r\n");
      out.write("Exception: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) );
      out.write("\r\n");
      out.write("Message: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) );
      out.write('\r');
      out.write('\n');

return;
}
if(!gotMethod){

      out.write("\r\n");
      out.write("result: N/A\r\n");

}

      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
