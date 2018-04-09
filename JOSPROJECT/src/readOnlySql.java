/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgargangwareiv
 */

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.sql.Timestamp;
public class readOnlySql {
    
    
    public Connection conn;
    
    public readOnlySql(Connection c)
    {
        conn = c;
    }
    
    public void viewTable() throws SQLException 
    {
        Statement stmt = null;
        String query = "select * from CUSTOMERS";
        
          stmt = conn.createStatement();

          ResultSet rs = stmt.executeQuery(query);

          while (rs.next()) {
            System.out.print("CustomerID " + rs.next());
            }
    }      
      public Connection getConn()   
      {
          return this.conn;
      }
    
    
}
