<%-- 
    Document   : submitchange
    Created on : Mar 30, 2018, 6:46:03 PM
    Author     : edgargangwareiv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="classes.SearchValueHandler" %>
<%@ page import="classes.DisplayCustomerHandler" %>
<%@ page import="classes.DisplayNewCustomerHandler" %>
<%@ page import="classes.SQLColumns" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.math.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link href='http://fonts.googleapis.com/css?family=Lato:400,700' rel='stylesheet' type='text/css'>

        
        <link rel="stylesheet" href="navbarstyle.css">
        
      
        
    </head>
    <body>
        <jsp:useBean id="SQLBean" scope="session" class="classes.SQLColumns" />
        <jsp:useBean id="displayCustomerBean" scope="session" class="classes.DisplayCustomerHandler" />
      
        
        <% 
            SQLBean.setAllAttributes();
            
            
        %>
        
        <jsp:useBean id="displayCustomerBeanzzz" class="classes.DisplayNewCustomerHandler" scope="session" />
        
  
        
        <jsp:setProperty name="displayCustomerBeanzzz" property="pd"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="in"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="csr"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="cn"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="ec"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="ea"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="un"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="p"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="cp"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="as"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="dbs"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="dop"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="wrd"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="ap"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="or"  />
        <jsp:setProperty name="displayCustomerBeanzzz" property="phase"  />
        
        
        
        <%
           
            String url = "jdbc:mysql://localhost:3306/GS1DB?zeroDateTimeBehavior=convertToNull";
            String userName = "root";
            String password = "password";//query the database with it
            
            Connection connection = DriverManager.getConnection(url, userName, password);
        
            Statement stmt = connection.createStatement(); //Allocating a statement object in the connection
            
            String companyOldName = displayCustomerBean.getCn();
            String update = "UPDATE Customers ";
            
            String set = "SET ";
            String attributes = "PurchaseDate = '" + displayCustomerBeanzzz.getPd() + "', InvoiceNumber = '" + displayCustomerBeanzzz.getIn() + "', CustomerServiceRep = '" + displayCustomerBeanzzz.getCsr() + "', CompanyName = '" + displayCustomerBeanzzz.getCn() + "', ExecutiveContact = '" + displayCustomerBeanzzz.getEc() + "', EmailAddress = '" + displayCustomerBeanzzz.getEa() + "', GS1UserName = '" + displayCustomerBeanzzz.getUn() + "', GS1Password = '" + displayCustomerBeanzzz.getP() + "', UPCCodesPurchased = '" + displayCustomerBeanzzz.getCp() + "', GS1ApplicationSubmissionDate = '" + displayCustomerBeanzzz.getAs() + "', DateBarcodesSentToCustomer = '" + displayCustomerBeanzzz.getDbs() + "', DigitalorPrinted = '" + displayCustomerBeanzzz.getDop() + "', GS1WorksheetReturnDate = '" + displayCustomerBeanzzz.getWrd() + "', AssignedPrefix = '" + displayCustomerBeanzzz.getAp() + "', UPCsOfficiallyRegistered = '" + displayCustomerBeanzzz.getOr() + "', CustomerPhase = '" + displayCustomerBeanzzz.getCp() + "' ";
            String where = "WHERE CompanyName = '" + companyOldName + "';";
            
          
            String queryNameStatement = update + set + attributes + where;
            System.out.println("The query is " + queryNameStatement); //Echo the query for debugging purposes
                 
            int success = stmt.executeUpdate(queryNameStatement);
            System.out.println("THE UPDATE RETURN IS: " +success);
            
            if (success > 0) {
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
                <script src="myScripts.js"></script>
                
                <%
            } else {
                
                %>
                <h1>Failure</h1>
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
                <script src="myScripts.js"></script>
               
                
                <%
            }

          
        %>
        
  

    </body>
</html>
