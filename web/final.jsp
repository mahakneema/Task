<%-- 
    Document   : final
    Created on : 18 Nov, 2023, 5:12:07 PM
    Author     : Mahak Neema
--%>

<%@page import="db.DBase"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:powderblue;">
        
            <% 
 
                Connection con = DBase.getConnection();
                Statement st = DBase.getStatement();
                 ResultSet rs = DBase.getResultSet();
                 st=con.createStatement();
                 String query = "Select * from customer1";
                 rs=st.executeQuery(query);
                
             %>
                <table class="table table-dark table-striped">
              <tr class="table-info" border="1">
                <td><B>username</B></td> 
                 <td><B>password</B></td> 
                  <td><B>phone</B></td> 
                   <td><B>email</B></td> 
                    <td><B>Address</B></td> 
                    <td><B>City</B></td> 
                    <td><B>Delete Button</B></td> 
                    <td><B>UPDate Button</B></td> 
            </tr>
                 <%
                 while(rs.next())
                 {
                %>
             <tr>
                 <td><B><%=rs.getString(1)%></B></td> 
                 <td><B><%=rs.getString(2)%></B></td> 
                 <td><B><%=rs.getString(3)%></B></td> 
                 <td><B><%=rs.getString(4)%></B></td> 
                 <td><B><%=rs.getString(5)%></B></td>
                 <td><B><%=rs.getString(6)%></B></td>
                 <form action="delete.jsp" method="post">
                 <td><B><input type="submit"  value="Delete" name="delete"></B></td>
                 </form>
                 <form action="edit.jsp" method="post">
                 <td><B><input type="submit"  value="Update"></B></td>
                 <form>
                 
                
             </tr>  
                 <%
               }
           
%>


       
        </table>

<form action="RegisterServlet" method="post" > 
    
    <input type="submit" class="btn btn-outline-success" value ="Add more user" > 
</form>     
            
     
    
    </body>
</html>
