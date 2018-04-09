<%-- 
    Document   : searchClientResult.jsp
    Created on : Jan 6, 2018, 12:17:19 AM
    Author     : edgargangwareiv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="classes.SearchValueHandler" %>
<%@page import="classes.SQLColumns" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.math.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link href='http://fonts.googleapis.com/css?family=Lato:400,700' rel='stylesheet' type='text/css'>

        
        <link rel="stylesheet" href="navbarstyle.css">
        
        <style>
          

.submissionButton {
    position:absolute;
    right: 0px;
}

#belowtable{
    position: relative;
    top: initial;
    
   
}

        </style>
    </head>
    <body>
        <jsp:useBean id="searchBean" scope="session" class="classes.SearchValueHandler" />
        <jsp:setProperty name = "searchBean" property="searchTerm" />
        <h1>Search by Company Name:   </h1>
        
        <div id="SideNavigation" class="sidenav"> <--!id is for one div and class is for more than one -->
                        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                        <a href="checkLogin.jsp"> Home</a>
                        <a href="readme.jsp">About This CRM</a>
                        <a href="searchClient.jsp">Search Client's</a>
                        <a href="addCustomer.jsp">Add a Client</a>
                    </div>
                    
                    <div id="OpenNavigationbutton" class="opennavbutton">
                    <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Navigation</span>
                    </div>
        
        <%
            String searchterm = searchBean.getSearchTerm();
            String url = "jdbc:mysql://localhost:3306/GS1DB?zeroDateTimeBehavior=convertToNull";
            String userName = "root";
            String password = "password";//query the database with it
            
            Connection connection = DriverManager.getConnection(url, userName, password);
        
            Statement stmt = connection.createStatement(); //Allocating a statement object in the connection
                
                
                String queryNameStatement = "select CompanyName, ExecutiveContact, EmailAddress from Customers where CompanyName like '%" + searchterm + "%';";
                System.out.println("The query is " + queryNameStatement); //Echo the query for debugging purposes
                
                ResultSet rset = stmt.executeQuery(queryNameStatement);
               
                
        %>
                <TABLE id="results" BORDER="1">
            <TR>
                <TH>Company Name</TH>
                <TH>Executive Contact</TH>
                <TH>Email Address</TH>
                <TH>View Profile</TH>
             
            </TR>
            <form action='companyInfo.jsp'> 
            <% while(rset.next()){ %>
            <TR>
                <TD> <%= rset.getString(1) %></</td>
                <TD> <%= rset.getString(2) %></TD>
                <TD> <%= rset.getString(3) %></TD>
                
                <TD> <input type="checkbox" name="searchTerm" value="<%= rset.getString(1) %>">
                </TD>
                
              
                
            </TR>
            <% } %>
            
            
            
            <div id="submissionbutton">
                    <input type="submit" value="OK">
            </div>
                </form>
        </TABLE>
            <div id="belowtable">
                <h1>No More Customers,
                    <a href="searchClient.jsp"  >New Search?</a> </h1>
            </div>
        
                
        
      
            <%
                rset.close();
            %>
<script src="myScripts.js"></script>
        
    </body>
</html>
