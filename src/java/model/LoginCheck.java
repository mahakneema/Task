/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mahak Neema
 */
public class LoginCheck 
{
     public  boolean isLogin(String username,String password)
     {
         String tablePassword = "";
       try
       {   Statement st = DBase.getStatement();
           String query = "SELECT password from customer1 where username1= '"+username+"'";
           System.out.println("Query = "+query);
           
           ResultSet rs = st.executeQuery(query);
          if(rs.next())
          {
              tablePassword = rs.getString(1);
          }
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
       if(username!=null && password!=null && !username.trim().equalsIgnoreCase("") && password.equals(tablePassword))
       {
           return true;
       }
       return false;
     }
      
    
}
