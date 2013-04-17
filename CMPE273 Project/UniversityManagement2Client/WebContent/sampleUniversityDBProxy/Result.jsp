<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleUniversityDBProxyid" scope="session" class="edu.web.UniversityDBProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleUniversityDBProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleUniversityDBProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleUniversityDBProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        edu.web.UniversityDB getUniversityDB10mtemp = sampleUniversityDBProxyid.getUniversityDB();
if(getUniversityDB10mtemp == null){
%>
<%=getUniversityDB10mtemp %>
<%
}else{
        if(getUniversityDB10mtemp!= null){
        String tempreturnp11 = getUniversityDB10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        java.lang.String displayCourseInfo13mtemp = sampleUniversityDBProxyid.displayCourseInfo();
if(displayCourseInfo13mtemp == null){
%>
<%=displayCourseInfo13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(displayCourseInfo13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 16:
        gotMethod = true;
        java.lang.String displayPersonInfo16mtemp = sampleUniversityDBProxyid.displayPersonInfo();
if(displayPersonInfo16mtemp == null){
%>
<%=displayPersonInfo16mtemp %>
<%
}else{
        String tempResultreturnp17 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(displayPersonInfo16mtemp));
        %>
        <%= tempResultreturnp17 %>
        <%
}
break;
case 19:
        gotMethod = true;
        java.lang.String listInstructors19mtemp = sampleUniversityDBProxyid.listInstructors();
if(listInstructors19mtemp == null){
%>
<%=listInstructors19mtemp %>
<%
}else{
        String tempResultreturnp20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(listInstructors19mtemp));
        %>
        <%= tempResultreturnp20 %>
        <%
}
break;
case 22:
        gotMethod = true;
        String studentId_1id=  request.getParameter("studentId25");
            java.lang.String studentId_1idTemp = null;
        if(!studentId_1id.equals("")){
         studentId_1idTemp  = studentId_1id;
        }
        java.lang.String unEnrollStudent22mtemp = sampleUniversityDBProxyid.unEnrollStudent(studentId_1idTemp);
if(unEnrollStudent22mtemp == null){
%>
<%=unEnrollStudent22mtemp %>
<%
}else{
        String tempResultreturnp23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(unEnrollStudent22mtemp));
        %>
        <%= tempResultreturnp23 %>
        <%
}
break;
case 27:
        gotMethod = true;
        String studentId_2id=  request.getParameter("studentId30");
            java.lang.String studentId_2idTemp = null;
        if(!studentId_2id.equals("")){
         studentId_2idTemp  = studentId_2id;
        }
        java.lang.String deleteStudent27mtemp = sampleUniversityDBProxyid.deleteStudent(studentId_2idTemp);
if(deleteStudent27mtemp == null){
%>
<%=deleteStudent27mtemp %>
<%
}else{
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteStudent27mtemp));
        %>
        <%= tempResultreturnp28 %>
        <%
}
break;
case 32:
        gotMethod = true;
        String instructorId_3id=  request.getParameter("instructorId35");
            java.lang.String instructorId_3idTemp = null;
        if(!instructorId_3id.equals("")){
         instructorId_3idTemp  = instructorId_3id;
        }
        String firstname_4id=  request.getParameter("firstname37");
            java.lang.String firstname_4idTemp = null;
        if(!firstname_4id.equals("")){
         firstname_4idTemp  = firstname_4id;
        }
        String lastname_5id=  request.getParameter("lastname39");
            java.lang.String lastname_5idTemp = null;
        if(!lastname_5id.equals("")){
         lastname_5idTemp  = lastname_5id;
        }
        String address_6id=  request.getParameter("address41");
            java.lang.String address_6idTemp = null;
        if(!address_6id.equals("")){
         address_6idTemp  = address_6id;
        }
        String city_7id=  request.getParameter("city43");
            java.lang.String city_7idTemp = null;
        if(!city_7id.equals("")){
         city_7idTemp  = city_7id;
        }
        String state_8id=  request.getParameter("state45");
            java.lang.String state_8idTemp = null;
        if(!state_8id.equals("")){
         state_8idTemp  = state_8id;
        }
        String zipCode_9id=  request.getParameter("zipCode47");
        int zipCode_9idTemp  = Integer.parseInt(zipCode_9id);
        String courseList_10id=  request.getParameter("courseList49");
            java.lang.String courseList_10idTemp = null;
        if(!courseList_10id.equals("")){
         courseList_10idTemp  = courseList_10id;
        }
        String department_11id=  request.getParameter("department51");
            java.lang.String department_11idTemp = null;
        if(!department_11id.equals("")){
         department_11idTemp  = department_11id;
        }
        String meetingTime_12id=  request.getParameter("meetingTime53");
            java.lang.String meetingTime_12idTemp = null;
        if(!meetingTime_12id.equals("")){
         meetingTime_12idTemp  = meetingTime_12id;
        }
        java.lang.String addInstructor32mtemp = sampleUniversityDBProxyid.addInstructor(instructorId_3idTemp,firstname_4idTemp,lastname_5idTemp,address_6idTemp,city_7idTemp,state_8idTemp,zipCode_9idTemp,courseList_10idTemp,department_11idTemp,meetingTime_12idTemp);
if(addInstructor32mtemp == null){
%>
<%=addInstructor32mtemp %>
<%
}else{
        String tempResultreturnp33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addInstructor32mtemp));
        %>
        <%= tempResultreturnp33 %>
        <%
}
break;
case 55:
        gotMethod = true;
        String instructorId_13id=  request.getParameter("instructorId58");
            java.lang.String instructorId_13idTemp = null;
        if(!instructorId_13id.equals("")){
         instructorId_13idTemp  = instructorId_13id;
        }
        java.lang.String deleteInstructor55mtemp = sampleUniversityDBProxyid.deleteInstructor(instructorId_13idTemp);
if(deleteInstructor55mtemp == null){
%>
<%=deleteInstructor55mtemp %>
<%
}else{
        String tempResultreturnp56 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteInstructor55mtemp));
        %>
        <%= tempResultreturnp56 %>
        <%
}
break;
case 60:
        gotMethod = true;
        String studentId_14id=  request.getParameter("studentId63");
            java.lang.String studentId_14idTemp = null;
        if(!studentId_14id.equals("")){
         studentId_14idTemp  = studentId_14id;
        }
        String courseId_15id=  request.getParameter("courseId65");
            java.lang.String courseId_15idTemp = null;
        if(!courseId_15id.equals("")){
         courseId_15idTemp  = courseId_15id;
        }
        java.lang.String enrollStudent60mtemp = sampleUniversityDBProxyid.enrollStudent(studentId_14idTemp,courseId_15idTemp);
if(enrollStudent60mtemp == null){
%>
<%=enrollStudent60mtemp %>
<%
}else{
        String tempResultreturnp61 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(enrollStudent60mtemp));
        %>
        <%= tempResultreturnp61 %>
        <%
}
break;
case 67:
        gotMethod = true;
        String instructorId_16id=  request.getParameter("instructorId70");
            java.lang.String instructorId_16idTemp = null;
        if(!instructorId_16id.equals("")){
         instructorId_16idTemp  = instructorId_16id;
        }
        java.lang.String unAssignInstructor67mtemp = sampleUniversityDBProxyid.unAssignInstructor(instructorId_16idTemp);
if(unAssignInstructor67mtemp == null){
%>
<%=unAssignInstructor67mtemp %>
<%
}else{
        String tempResultreturnp68 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(unAssignInstructor67mtemp));
        %>
        <%= tempResultreturnp68 %>
        <%
}
break;
case 72:
        gotMethod = true;
        String courseId_17id=  request.getParameter("courseId75");
            java.lang.String courseId_17idTemp = null;
        if(!courseId_17id.equals("")){
         courseId_17idTemp  = courseId_17id;
        }
        String instructorId_18id=  request.getParameter("instructorId77");
            java.lang.String instructorId_18idTemp = null;
        if(!instructorId_18id.equals("")){
         instructorId_18idTemp  = instructorId_18id;
        }
        java.lang.String assignInstructor72mtemp = sampleUniversityDBProxyid.assignInstructor(courseId_17idTemp,instructorId_18idTemp);
if(assignInstructor72mtemp == null){
%>
<%=assignInstructor72mtemp %>
<%
}else{
        String tempResultreturnp73 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(assignInstructor72mtemp));
        %>
        <%= tempResultreturnp73 %>
        <%
}
break;
case 79:
        gotMethod = true;
        java.lang.String findCourse79mtemp = sampleUniversityDBProxyid.findCourse();
if(findCourse79mtemp == null){
%>
<%=findCourse79mtemp %>
<%
}else{
        String tempResultreturnp80 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(findCourse79mtemp));
        %>
        <%= tempResultreturnp80 %>
        <%
}
break;
case 82:
        gotMethod = true;
        java.lang.String findPreson82mtemp = sampleUniversityDBProxyid.findPreson();
if(findPreson82mtemp == null){
%>
<%=findPreson82mtemp %>
<%
}else{
        String tempResultreturnp83 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(findPreson82mtemp));
        %>
        <%= tempResultreturnp83 %>
        <%
}
break;
case 85:
        gotMethod = true;
        java.lang.String listStudents85mtemp = sampleUniversityDBProxyid.listStudents();
if(listStudents85mtemp == null){
%>
<%=listStudents85mtemp %>
<%
}else{
        String tempResultreturnp86 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(listStudents85mtemp));
        %>
        <%= tempResultreturnp86 %>
        <%
}
break;
case 88:
        gotMethod = true;
        java.lang.String listCourse88mtemp = sampleUniversityDBProxyid.listCourse();
if(listCourse88mtemp == null){
%>
<%=listCourse88mtemp %>
<%
}else{
        String tempResultreturnp89 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(listCourse88mtemp));
        %>
        <%= tempResultreturnp89 %>
        <%
}
break;
case 91:
        gotMethod = true;
        String studentId_19id=  request.getParameter("studentId94");
            java.lang.String studentId_19idTemp = null;
        if(!studentId_19id.equals("")){
         studentId_19idTemp  = studentId_19id;
        }
        String firstname_20id=  request.getParameter("firstname96");
            java.lang.String firstname_20idTemp = null;
        if(!firstname_20id.equals("")){
         firstname_20idTemp  = firstname_20id;
        }
        String lastname_21id=  request.getParameter("lastname98");
            java.lang.String lastname_21idTemp = null;
        if(!lastname_21id.equals("")){
         lastname_21idTemp  = lastname_21id;
        }
        String address_22id=  request.getParameter("address100");
            java.lang.String address_22idTemp = null;
        if(!address_22id.equals("")){
         address_22idTemp  = address_22id;
        }
        String city_23id=  request.getParameter("city102");
            java.lang.String city_23idTemp = null;
        if(!city_23id.equals("")){
         city_23idTemp  = city_23id;
        }
        String state_24id=  request.getParameter("state104");
            java.lang.String state_24idTemp = null;
        if(!state_24id.equals("")){
         state_24idTemp  = state_24id;
        }
        String zipCode_25id=  request.getParameter("zipCode106");
        int zipCode_25idTemp  = Integer.parseInt(zipCode_25id);
        String courseList_26id=  request.getParameter("courseList108");
            java.lang.String courseList_26idTemp = null;
        if(!courseList_26id.equals("")){
         courseList_26idTemp  = courseList_26id;
        }
        java.lang.String addStudent91mtemp = sampleUniversityDBProxyid.addStudent(studentId_19idTemp,firstname_20idTemp,lastname_21idTemp,address_22idTemp,city_23idTemp,state_24idTemp,zipCode_25idTemp,courseList_26idTemp);
if(addStudent91mtemp == null){
%>
<%=addStudent91mtemp %>
<%
}else{
        String tempResultreturnp92 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addStudent91mtemp));
        %>
        <%= tempResultreturnp92 %>
        <%
}
break;
case 110:
        gotMethod = true;
        String courseId_27id=  request.getParameter("courseId113");
            java.lang.String courseId_27idTemp = null;
        if(!courseId_27id.equals("")){
         courseId_27idTemp  = courseId_27id;
        }
        String courseName_28id=  request.getParameter("courseName115");
            java.lang.String courseName_28idTemp = null;
        if(!courseName_28id.equals("")){
         courseName_28idTemp  = courseName_28id;
        }
        String courseSection_29id=  request.getParameter("courseSection117");
            java.lang.String courseSection_29idTemp = null;
        if(!courseSection_29id.equals("")){
         courseSection_29idTemp  = courseSection_29id;
        }
        String location_30id=  request.getParameter("location119");
            java.lang.String location_30idTemp = null;
        if(!location_30id.equals("")){
         location_30idTemp  = location_30id;
        }
        java.lang.String addCourse110mtemp = sampleUniversityDBProxyid.addCourse(courseId_27idTemp,courseName_28idTemp,courseSection_29idTemp,location_30idTemp);
if(addCourse110mtemp == null){
%>
<%=addCourse110mtemp %>
<%
}else{
        String tempResultreturnp111 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addCourse110mtemp));
        %>
        <%= tempResultreturnp111 %>
        <%
}
break;
case 121:
        gotMethod = true;
        String courseId_31id=  request.getParameter("courseId124");
            java.lang.String courseId_31idTemp = null;
        if(!courseId_31id.equals("")){
         courseId_31idTemp  = courseId_31id;
        }
        java.lang.String deleteCourse121mtemp = sampleUniversityDBProxyid.deleteCourse(courseId_31idTemp);
if(deleteCourse121mtemp == null){
%>
<%=deleteCourse121mtemp %>
<%
}else{
        String tempResultreturnp122 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteCourse121mtemp));
        %>
        <%= tempResultreturnp122 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>