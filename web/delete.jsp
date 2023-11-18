<%-- 
    Document   : delete
    Created on : 18 Nov, 2023, 7:54:50 PM
    Author     : Mahak Neema
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="deletecss.css">
        <title>JSP Page</title>
    </head>
    <body>
        
      <form  action="DeleteServlet" method="post"  class="row g-3">
     <div class="login">
  <div class="form">
    <p>welcome</p>
    <form class="login-form">
        
      <input type="text" name="username" placeholder="Enter your username">
      <div class="col-auto">
    <button type="submit" class="btn btn-danger">Delete</button>
  </div>
      
    </form>  
  </div>
</div>
  
  
</form>		
        
    </body>
</html>
