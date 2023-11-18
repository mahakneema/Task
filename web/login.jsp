<%-- 
    Document   : login
    Created on : 17 Nov, 2023, 5:12:00 PM
    Author     : Mahak Neema
--%>
<html>
    <head>
        <title>Login Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="logincss.css">
        
    </head>
   
    <body>
        <form action="LoginServlet" method= "post"> 
       <div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Username</label>
					<input id="user" type="text" class="input" name="username">
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password" class="input"  name="password">
				</div>
				<div class="group">
					<input id="check" type="checkbox" class="check" checked>
					<label for="check"><span class="icon"></span> Keep me Signed in</label>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign In" >
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="#forgot">Forgot Password?</a>
				</div>
			</div>
                    </form>          
        
        <form action="RegisterServlet" method="post">
            
			<div class="sign-up-htm">
				<div class="group">
					<label for="user" class="label">Username</label>
					<input id="user" type="text" class="input" name="username1">
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password" class="input"  name="password1">
				</div>
				<div class="group">
					<label for="pass" class="label">Phone</label>
					<input id="pass" type="number" class="input"  name="phone">
				</div>
				<div class="group">
					<label for="pass" class="label">Email Address</label>
					<input id="pass" type="email" class="input" name="email">
				</div>
                            <div class="group">
					<label for="pass" class="label">Address</label>
					<input id="pass" type="text" class="input"  name="add">
				</div>
				<div class="group">
					<label for="pass" class="label">City</label>
					<input id="pass" type="text" class="input" name="city">
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign Up">
				</div>
				<div class="hr"></div>
				
			</div>
		</div
               
	</div>
           
</div>  
        </form>
    </body>
    
</html>