package org.apache.jsp.sampleServiceProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Input_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Inputs</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1>Inputs</H1>\r\n");
      out.write("\r\n");

String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

boolean valid = true;

if(methodID != -1) methodID = Integer.parseInt(method);
switch (methodID){ 
case 2:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 5:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">endpoint:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"endpoint8\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 10:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 13:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">courseId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"courseId16\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 18:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">studentId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"studentId21\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 23:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">instructorId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"instructorId26\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 28:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">courseId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"courseId31\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">instructorId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"instructorId33\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 35:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">studentId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"studentId38\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">courseId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"courseId40\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 42:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">studentId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"studentId45\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 47:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">instructorId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"instructorId50\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 52:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">studentId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"studentId55\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">firstname:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"firstname57\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">lastname:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"lastname59\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">address:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"address61\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">city:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"city63\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">state:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"state65\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">zipCode:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"zipCode67\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">courseList:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"courseList69\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 71:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">instructorId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"instructorId74\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">firstname:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"firstname76\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">lastname:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"lastname78\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">address:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"address80\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">city:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"city82\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">state:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"state84\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">zipCode:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"zipCode86\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">courseList:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"courseList88\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">department:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"department90\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">meetingTime:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"meetingTime92\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 94:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 97:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 100:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 103:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 106:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 109:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 112:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 115:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">courseId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"courseId118\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">courseName:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"courseName120\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">courseSection:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"courseSection122\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">location:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"location124\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 1111111111:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">URLString:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"url1111111111\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 1111111112:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
}
if (valid) {

      out.write("\r\n");
      out.write("Select a method to test.\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
