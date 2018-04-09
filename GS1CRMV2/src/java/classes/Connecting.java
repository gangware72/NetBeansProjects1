/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.*;
import java.math.*;

/**
 *
 * @author edgargangwareiv
 */
public class Connecting {
    
    
    
    public static void main(String[] args) {
                
        String url = "jdbc:mysql://localhost:3306/GS1DB?zeroDateTimeBehavior=convertToNull";
        String userName = "root";
        String password = "password";  
        
        System.out.println("Connecting to Database...");
        
       try (Connection connection = DriverManager.getConnection(url, userName, password)) {
       System.out.println("Database connected!");
       connection.close();
       } catch (SQLException e) {
       throw new IllegalStateException("Cannot connect the database!", e);
       }
       
       
}
}
    

