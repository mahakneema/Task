/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LoginCheck;

/**
 *
 * @author Mahak Neema
 */
public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
     {
        response.sendRedirect("login.jsp");
    }
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username1 = request.getParameter("username");
        String password1 = request.getParameter("password");
       
        
        
        LoginCheck l1 = new LoginCheck();
        boolean login = l1.isLogin(username1,password1);
        if(login)
                {
                    
                    response.sendRedirect("main.jsp");
                    
                    
                }
        else
        {
            response.sendRedirect("login.jsp");
        }
        
        
        
        
        
       
        
      
        
        
        
    }

    
 
}
