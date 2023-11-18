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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mahak Neema
 */
public class DeleteServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
        response.sendRedirect("login.jsp");
        
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String us = request.getParameter("username");
        String pass = request.getParameter("password");
         try
        {
            
             Connection con = DBase.getConnection();
             Statement st = DBase.getStatement();
             ResultSet rs = DBase.getResultSet();
              st=con.createStatement();
             String query = "DELETE  from customer1 where username1 ='"+us+"'";
          int i = st.executeUpdate(query);
           if(i>0)
           {
               response.sendRedirect("final.jsp");
           }
           else
           {
               System.out.println("login.jsp");
           }
             
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
    }


}
