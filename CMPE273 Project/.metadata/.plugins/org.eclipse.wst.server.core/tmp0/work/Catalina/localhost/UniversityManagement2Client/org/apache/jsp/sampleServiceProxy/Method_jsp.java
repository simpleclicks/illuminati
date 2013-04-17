package org.apache.jsp.sampleServiceProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Method_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Methods</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1>Methods</H1>\r\n");
      out.write("<UL>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=2\" TARGET=\"inputs\"> getEndpoint()</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=5\" TARGET=\"inputs\"> setEndpoint(java.lang.String)</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=10\" TARGET=\"inputs\"> getService()</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=13\" TARGET=\"inputs\"> deleteCourse(java.lang.String)</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=18\" TARGET=\"inputs\"> deleteStudent(java.lang.String)</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=23\" TARGET=\"inputs\"> deleteInstructor(java.lang.String)</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=28\" TARGET=\"inputs\"> assignInstructor(java.lang.String,java.lang.String)</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=35\" TARGET=\"inputs\"> enrollStudent(java.lang.String,java.lang.String)</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=42\" TARGET=\"inputs\"> unEnrollStudent(java.lang.String)</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=47\" TARGET=\"inputs\"> unAssignInstructor(java.lang.String)</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=52\" TARGET=\"inputs\"> addStudent(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,java.lang.String)</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=71\" TARGET=\"inputs\"> addInstructor(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,java.lang.String,java.lang.String,java.lang.String)</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=94\" TARGET=\"inputs\"> listStudents()</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=97\" TARGET=\"inputs\"> listCourse()</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=100\" TARGET=\"inputs\"> findPreson()</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=103\" TARGET=\"inputs\"> findCourse()</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=106\" TARGET=\"inputs\"> displayCourseInfo()</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=109\" TARGET=\"inputs\"> displayPersonInfo()</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=112\" TARGET=\"inputs\"> listInstructors()</A></LI>\r\n");
      out.write("<LI><A HREF=\"Input.jsp?method=115\" TARGET=\"inputs\"> addCourse(java.lang.String,java.lang.String,java.lang.String,java.lang.String)</A></LI>\r\n");
      out.write("</UL>\r\n");
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
