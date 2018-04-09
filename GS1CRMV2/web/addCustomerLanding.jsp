<%-- 
    Document   : addCustomerLanding.jsp
    Created on : Jan 6, 2018, 5:48:34 PM
    Author     : edgargangwareiv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="classes.DisplayNewCustomerHandler" %>
<%@ page import="java.sql.*" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 
                
        <jsp:useBean id="addNewCustomerBean" scope="session" class="classes.DisplayNewCustomerHandler" />
        <jsp:setProperty name="addNewCustomerBean" property="pd"  />
        <jsp:setProperty name="addNewCustomerBean" property="in"  />
        <jsp:setProperty name="addNewCustomerBean" property="csr"  />
        <jsp:setProperty name="addNewCustomerBean" property="cn"  />
        <jsp:setProperty name="addNewCustomerBean" property="ec"  />
        <jsp:setProperty name="addNewCustomerBean" property="ea"  />
        <jsp:setProperty name="addNewCustomerBean" property="un"  />
        <jsp:setProperty name="addNewCustomerBean" property="p"  />
        <jsp:setProperty name="addNewCustomerBean" property="cp"  />
        <jsp:setProperty name="addNewCustomerBean" property="as"  />
        <jsp:setProperty name="addNewCustomerBean" property="dbs"  />
        <jsp:setProperty name="addNewCustomerBean" property="dop"  />
        <jsp:setProperty name="addNewCustomerBean" property="wrd"  />
        <jsp:setProperty name="addNewCustomerBean" property="ap"  />
        <jsp:setProperty name="addNewCustomerBean" property="or"  />
        <jsp:setProperty name="addNewCustomerBean" property="phase"  />
                     <%
           
            String url = "jdbc:mysql://localhost:3306/GS1DB?zeroDateTimeBehavior=convertToNull";
            String userName = "root";
            String password = "password";//query the database with it
            
            Connection connection = DriverManager.getConnection(url, userName, password);
        
            Statement stmt = connection.createStatement(); //Allocating a statement object in the connection
            
            String companyOldName = addNewCustomerBean.getCn();
            String update = "UPDATE Customers ";
            
            String insert = "INSERT INTO Customers VALUES (";
            String values = "'" + addNewCustomerBean.getPd() + "', " + 
                            "'" +addNewCustomerBean.getIn() + "', " + 
                            "'" +addNewCustomerBean.getCsr() + "', " + 
                            "'" +addNewCustomerBean.getCn() + "', " + 
                            "'" +addNewCustomerBean.getEc() + "', " + 
                            "'" +addNewCustomerBean.getEa() + "', " + 
                            "'" +addNewCustomerBean.getUn() + "', " + 
                            "'" +addNewCustomerBean.getP() + "', " + 
                            "'" +addNewCustomerBean.getCp() + "', " + 
                            "'" +addNewCustomerBean.getAs() + "', " + 
                            "'" +addNewCustomerBean.getDbs() + "', " + 
                            "'" +addNewCustomerBean.getDop() + "', " + 
                            "'" +addNewCustomerBean.getWrd() + "', " + 
                            "'" +addNewCustomerBean.getAp() + "', " + 
                            "'" +addNewCustomerBean.getOr() + "', " + 
                            "'" +addNewCustomerBean.getCp() + "'); ";
            
            
          
            String queryNameStatement = insert + values;
            System.out.println("The query is " + queryNameStatement); //Echo the query for debugging purposes
            int success = stmt.executeUpdate(queryNameStatement);
            System.out.println("The return value of the query is: " + success);

            
            if (success == 1    ) {
                %>
                
                <h1>Success!</h1>
                
                <div id="SideNavigation" class="sidenav"> <--!id is for one div and class is for more than one -->
                        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                        <a href="checkLogin.jsp">Home</a>
                        <a href="readme.jsp">About This CRM</a>
                        <a href="searchClient.jsp">Search Client's</a>
                        <a href="addCustomer.jsp">Add a Client</a>
                </div>
                
                <div id="OpenNavigationbutton" class="opennavbutton">
                    <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Navigation</span>
                </div>
                
                <h2><jsp:getProperty name="addNewCustomerBean" property="cn" /> has been successfully added! </h2>
                
                
                <%
            } else {
                
                %>
                <h1>Failure</h1>
                <a href="addCustomer.jsp">Try Again?</a>
               
                
                <%
            }

          
        %>
            
        
        
        
    </body>
</html>
