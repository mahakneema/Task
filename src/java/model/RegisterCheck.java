/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Mahak Neema
 */
public class RegisterCheck 
{
     public  int isRegister(String username1,String password1,String phone,String email,String add,String city) throws SQLException
     {
        
         try
         {
             Connection con = DBase.getConnection();
             PreparedStatement pst = DBase.getPreparedStatement();
             pst = con.prepareStatement("Insert into customer1 values(?,?,?,?,?,?)");
             
             pst.setString(1,username1);
             pst.setString(2,password1);
             pst.setString(3,phone);
             pst.setString(4,email);
             pst.setString(5,add);
             pst.setString(6,city);
             
             int i= pst.executeUpdate();
            
         }
         catch(SQLException e)
         {
             System.out.println(e);
         }
        return 0;
         
         
     }
    
}
