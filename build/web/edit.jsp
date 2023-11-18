<%-- 
    Document   : edit
    Created on : 18 Nov, 2023, 7:58:28 PM
    Author     : Mahak Neema
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="editcss.css">
        <title>JSP Page</title>
    </head>
    <body>
       <div class="container">
	
	
           <form action="UpdateServlet" method="post">
  <div>
  <p>
    <label>
      username<br>
    <input type="text"  name="username">
    </label>
  </p>
  <p>
    <label>
      password<br>
    <input type="password"  name="password">
    </label>
  </p>
  <p>
    <label>
      phone<br>
    <input type="number"  name="phone">
    </label>
  </p>
  <p>
    <label>
      email<br>
    <input type="email" name="email">
    </label>
  </p>
  <p>
    <label>
      Address<br>
    <input type="text" name="add">
    </label>
  </p>
  <p>
    <label>
      city<br>
    <input type="text" name="city">
    </label>
  </p>
  <p>
    
</form>
           <div class="col-auto">
    <button type="submit" class="btn btn-danger">Edit</button>
  </div>
</div>	
    </body>
</html>
