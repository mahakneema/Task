/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBase;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mahak Neema
 */
public class UpdateServlet extends HttpServlet 
{
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("login.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String us = request.getParameter("username");
        String pass = request.getParameter("password");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String add = request.getParameter("add");
        String city = request.getParameter("city");
        
         try
        {
            
             Connection con = DBase.getConnection();
             PreparedStatement pst = DBase.getPreparedStatement();
             ResultSet rs = DBase.getResultSet();
       
           pst=con.prepareStatement("UPDATE customer1 set password=?,phone=?,email=?,add=?,city=? where username1 ='"+us+"' ");
           
           pst.setString(1,pass);
           pst.setString(2,phone);
           pst.setString(3,email);
           pst.setString(4,add);
           pst.setString(5,city);
           
            int i = pst.executeUpdate();
            if(i>0)
            {
                response.sendRedirect("final.jsp");
            }
            else
            {
                System.out.println("Not updated");
            }
        
    }   
         catch (SQLException e) {
             System.out.println(e);
        }

   
    
    }

    
}
