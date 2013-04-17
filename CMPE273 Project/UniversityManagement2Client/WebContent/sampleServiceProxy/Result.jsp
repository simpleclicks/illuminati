<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServiceProxyid" scope="session" class="Connections.ServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServiceProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleServiceProxyid.getEndpoint();
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
        sampleServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        Connections.Service getService10mtemp = sampleServiceProxyid.getService();
if(getService10mtemp == null){
%>
<%=getService10mtemp %>
<%
}else{
        if(getService10mtemp!= null){
        String tempreturnp11 = getService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
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
%>
<%=deleteCourse13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteCourse13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
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
%>
<%=deleteStudent18mtemp %>
<%
}else{
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteStudent18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
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
%>
<%=deleteInstructor23mtemp %>
<%
}else{
        String tempResultreturnp24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteInstructor23mtemp));
        %>
        <%= tempResultreturnp24 %>
        <%
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
%>
<%=assignInstructor28mtemp %>
<%
}else{
        String tempResultreturnp29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(assignInstructor28mtemp));
        %>
        <%= tempResultreturnp29 %>
        <%
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
%>
<%=enrollStudent35mtemp %>
<%
}else{
        String tempResultreturnp36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(enrollStudent35mtemp));
        %>
        <%= tempResultreturnp36 %>
        <%
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
%>
<%=unEnrollStudent42mtemp %>
<%
}else{
        String tempResultreturnp43 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(unEnrollStudent42mtemp));
        %>
        <%= tempResultreturnp43 %>
        <%
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
%>
<%=unAssignInstructor47mtemp %>
<%
}else{
        String tempResultreturnp48 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(unAssignInstructor47mtemp));
        %>
        <%= tempResultreturnp48 %>
        <%
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
%>
<%=addStudent52mtemp %>
<%
}else{
        String tempResultreturnp53 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addStudent52mtemp));
        %>
        <%= tempResultreturnp53 %>
        <%
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
%>
<%=addInstructor71mtemp %>
<%
}else{
        String tempResultreturnp72 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addInstructor71mtemp));
        %>
        <%= tempResultreturnp72 %>
        <%
}
break;
case 94:
        gotMethod = true;
        java.lang.String listStudents94mtemp = sampleServiceProxyid.listStudents();
if(listStudents94mtemp == null){
%>
<%=listStudents94mtemp %>
<%
}else{
        String tempResultreturnp95 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(listStudents94mtemp));
        %>
        <%= tempResultreturnp95 %>
        <%
}
break;
case 97:
        gotMethod = true;
        java.lang.String listCourse97mtemp = sampleServiceProxyid.listCourse();
if(listCourse97mtemp == null){
%>
<%=listCourse97mtemp %>
<%
}else{
        String tempResultreturnp98 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(listCourse97mtemp));
        %>
        <%= tempResultreturnp98 %>
        <%
}
break;
case 100:
        gotMethod = true;
        java.lang.String findPreson100mtemp = sampleServiceProxyid.findPreson();
if(findPreson100mtemp == null){
%>
<%=findPreson100mtemp %>
<%
}else{
        String tempResultreturnp101 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(findPreson100mtemp));
        %>
        <%= tempResultreturnp101 %>
        <%
}
break;
case 103:
        gotMethod = true;
        java.lang.String findCourse103mtemp = sampleServiceProxyid.findCourse();
if(findCourse103mtemp == null){
%>
<%=findCourse103mtemp %>
<%
}else{
        String tempResultreturnp104 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(findCourse103mtemp));
        %>
        <%= tempResultreturnp104 %>
        <%
}
break;
case 106:
        gotMethod = true;
        java.lang.String displayCourseInfo106mtemp = sampleServiceProxyid.displayCourseInfo();
if(displayCourseInfo106mtemp == null){
%>
<%=displayCourseInfo106mtemp %>
<%
}else{
        String tempResultreturnp107 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(displayCourseInfo106mtemp));
        %>
        <%= tempResultreturnp107 %>
        <%
}
break;
case 109:
        gotMethod = true;
        java.lang.String displayPersonInfo109mtemp = sampleServiceProxyid.displayPersonInfo();
if(displayPersonInfo109mtemp == null){
%>
<%=displayPersonInfo109mtemp %>
<%
}else{
        String tempResultreturnp110 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(displayPersonInfo109mtemp));
        %>
        <%= tempResultreturnp110 %>
        <%
}
break;
case 112:
        gotMethod = true;
        java.lang.String listInstructors112mtemp = sampleServiceProxyid.listInstructors();
if(listInstructors112mtemp == null){
%>
<%=listInstructors112mtemp %>
<%
}else{
        String tempResultreturnp113 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(listInstructors112mtemp));
        %>
        <%= tempResultreturnp113 %>
        <%
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
%>
<%=addCourse115mtemp %>
<%
}else{
        String tempResultreturnp116 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addCourse115mtemp));
        %>
        <%= tempResultreturnp116 %>
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