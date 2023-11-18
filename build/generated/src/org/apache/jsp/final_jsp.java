package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.DBase;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class final_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:powderblue;\">\n");
      out.write("        \n");
      out.write("            ");
 
 
                Connection con = DBase.getConnection();
                Statement st = DBase.getStatement();
                 ResultSet rs = DBase.getResultSet();
                 st=con.createStatement();
                 String query = "Select * from customer1";
                 rs=st.executeQuery(query);
                
             
      out.write("\n");
      out.write("                <table class=\"table table-dark table-striped\">\n");
      out.write("              <tr class=\"table-info\" border=\"1\">\n");
      out.write("                <td><B>username</B></td> \n");
      out.write("                 <td><B>password</B></td> \n");
      out.write("                  <td><B>phone</B></td> \n");
      out.write("                   <td><B>email</B></td> \n");
      out.write("                    <td><B>Address</B></td> \n");
      out.write("                    <td><B>City</B></td> \n");
      out.write("                    <td><B>Delete Button</B></td> \n");
      out.write("                    <td><B>UPDate Button</B></td> \n");
      out.write("            </tr>\n");
      out.write("                 ");

                 while(rs.next())
                 {
                
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                 <td><B>");
      out.print(rs.getString(1));
      out.write("</B></td> \n");
      out.write("                 <td><B>");
      out.print(rs.getString(2));
      out.write("</B></td> \n");
      out.write("                 <td><B>");
      out.print(rs.getString(3));
      out.write("</B></td> \n");
      out.write("                 <td><B>");
      out.print(rs.getString(4));
      out.write("</B></td> \n");
      out.write("                 <td><B>");
      out.print(rs.getString(5));
      out.write("</B></td>\n");
      out.write("                 <td><B>");
      out.print(rs.getString(6));
      out.write("</B></td>\n");
      out.write("                 <form action=\"delete.jsp\" method=\"post\">\n");
      out.write("                 <td><B><input type=\"submit\"  value=\"Delete\" name=\"delete\"></B></td>\n");
      out.write("                 </form>\n");
      out.write("                 <form action=\"edit.jsp\" method=\"post\">\n");
      out.write("                 <td><B><input type=\"submit\"  value=\"Update\"></B></td>\n");
      out.write("                 <form>\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("             </tr>  \n");
      out.write("                 ");

               }
           

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("<form action=\"RegisterServlet\" method=\"post\" > \n");
      out.write("    \n");
      out.write("    <input type=\"submit\" class=\"btn btn-outline-success\" value =\"Add more user\" > \n");
      out.write("</form>     \n");
      out.write("            \n");
      out.write("     \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
