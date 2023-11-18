/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.RegisterCheck;

/**
 *
 * @author Mahak Neema
 */
public class RegisterServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("login.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username1 = request.getParameter("username1");
        String password1= request.getParameter("password1");
        String phone = request.getParameter("password2");
        String email = request.getParameter("email");
        String add = request.getParameter("email");
        String city = request.getParameter("email");
        
       HttpSession session = request.getSession(true);
       session.getAttribute(username1);
       session.getAttribute(password1);
        
        
        response.sendRedirect("login.jsp");
        
       RegisterCheck r1 = new RegisterCheck();
        int register = 0;
        try {
            register = r1.isRegister(username1,password1,phone,email,add,city);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(register>0) 
        {

            System.out.println("recorted inserted");
            
        }
        else
        {
            System.out.println("recorted not inserted");
            
        }
        
        
       
    }

   
}
