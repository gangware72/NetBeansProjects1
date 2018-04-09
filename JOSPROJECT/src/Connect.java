/*
 * Copyright (c) 1995, 2011, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.*;
import java.io.*;
import java.sql.BatchUpdateException;
import java.sql.DatabaseMetaData;
import java.sql.RowIdLifetime;
import java.sql.SQLWarning;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

public class Connect {

  public String dbms;
  public String jarFile;
  public String dbName; 
  public String userName;
  public String password;
  public String urlString;
  
  private String driver;
  private String serverName;
  private int portNumber;
  private Properties prop;
  
  
  
  public static void rowIdLifetime(Connection conn) throws SQLException {
    DatabaseMetaData dbMetaData = conn.getMetaData();
    RowIdLifetime lifetime = dbMetaData.getRowIdLifetime();
    switch (lifetime) {
    case ROWID_UNSUPPORTED:
      System.out.println("ROWID type not supported");
      break;
    case ROWID_VALID_FOREVER:
      System.out.println("ROWID has unlimited lifetime");
      break;
    case ROWID_VALID_OTHER:
      System.out.println("ROWID has indeterminate lifetime");
      break;
    case ROWID_VALID_SESSION:  
      System.out.println("ROWID type has lifetime that is valid for at least the containing session");
    break;
    case ROWID_VALID_TRANSACTION:
      System.out.println("ROWID type has lifetime that is valid for at least the containing transaction");
    }
  }
  
  

  public static void cursorHoldabilitySupport(Connection conn) throws SQLException {
    DatabaseMetaData dbMetaData = conn.getMetaData();
    System.out.println("ResultSet.HOLD_CURSORS_OVER_COMMIT = " +
                       ResultSet.HOLD_CURSORS_OVER_COMMIT);
    System.out.println("ResultSet.CLOSE_CURSORS_AT_COMMIT = " +
                       ResultSet.CLOSE_CURSORS_AT_COMMIT);
    System.out.println("Default cursor holdability: " +
                       dbMetaData.getResultSetHoldability());
    System.out.println("Supports HOLD_CURSORS_OVER_COMMIT? " +
                       dbMetaData.supportsResultSetHoldability(ResultSet.HOLD_CURSORS_OVER_COMMIT));
    System.out.println("Supports CLOSE_CURSORS_AT_COMMIT? " +
                       dbMetaData.supportsResultSetHoldability(ResultSet.CLOSE_CURSORS_AT_COMMIT));
  }

  public Connect()
  {
    
    this.dbName = "mysql";
    this.userName = "root";
    this.password = "G00029032g";
    this.serverName = "MAINDB";
    this.portNumber = 3306;

    System.out.println("Set the following properties:");
    System.out.println("dbms: " + dbms);
    System.out.println("driver: " + driver);
    System.out.println("dbName: " + dbName);
    System.out.println("userName: " + userName);
    System.out.println("serverName: " + serverName);
    System.out.println("portNumber: " + portNumber);
    
  }

 

 



  public Connection getConnectionToDatabase() throws SQLException {
    {
      Connection conn = null;
      Properties connectionProps = new Properties();

      connectionProps.put("user", this.userName);
      connectionProps.put("password", this.password);

      // Using a driver manager:

      if (this.dbms.equals("mysql")) {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        conn = DriverManager.getConnection("jdbc:" + dbms + "://" + serverName +
                                        ":" + portNumber + "/" + dbName,
                                        connectionProps);
        conn.setCatalog(this.dbName);
      } else if (this.dbms.equals("derby")) {
//        DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        conn =
            DriverManager.getConnection("jdbc:" + dbms + ":" + dbName, connectionProps);
      }
      System.out.println("Connected to database");
      return conn;
    }
  }



  public Connection getConnection() throws SQLException {
    Connection conn = null;
    Properties connectionProps = new Properties();
    connectionProps.put("user", "root");
    connectionProps.put("password", "G00029032g");
    if (this.dbms.equals("mysql")) {
      conn =
          DriverManager.getConnection("jdbc:" + this.dbms + "://" + this.serverName +
                                      ":" + this.portNumber + "/",
                                      connectionProps);
      conn.setCatalog(this.dbName);
    } else if (this.dbms.equals("derby")) {
      conn =
          DriverManager.getConnection("jdbc:" + this.dbms + ":" + this.dbName +
                                      ";create=true", connectionProps);
    }
    return conn;
  }


  

  public static void closeConnection(Connection connArg) {
    System.out.println("Releasing all open resources ...");
    try {
      if (connArg != null) {
        connArg.close();
        connArg = null;
      }
    } catch (SQLException sqle) {
    }
  }
  
  public static String convertDocumentToString(Document doc) throws TransformerConfigurationException,
                                                                    TransformerException {
    Transformer t = TransformerFactory.newInstance().newTransformer();
//    t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
    StringWriter sw = new StringWriter();
    t.transform(new DOMSource(doc), new StreamResult(sw));
    return sw.toString();
    
    
  }
}