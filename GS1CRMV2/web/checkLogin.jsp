<%-- 
    Document   : checkLogin
    Created on : Dec 18, 2017, 7:04:09 PM
    Author     : edgargangwareiv
--%>

<%@ page contentType="text/html" %>
<!DOCTYPE html>
<%@ page import="classes.User" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.math.*" %>
    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href='http://fonts.googleapis.com/css?family=Lato:400,700' rel='stylesheet' type='text/css'>
        <script src="myScripts.js"></script>
        
        <link rel="stylesheet" href="navbarstyle.css">
        
        <style>


</style>
    </head>
    <body>
        <jsp:useBean id="loginBean" scope="session" class="classes.User" />
        <jsp:setProperty name="loginBean" property="userName"  />
        <jsp:setProperty name="loginBean" property="password" />
        
       
        <% 
            User nu = new User();
            nu.setuserName(loginBean.getuserName()); //set the user Name, this is how you retrieve information from your beans
            nu.setPassword(loginBean.getPassword());
            System.out.println(loginBean.getPassword());
            String url = "jdbc:mysql://localhost:3306/GS1DB?zeroDateTimeBehavior=convertToNull";
            String userName = "root";
            String password = "password";//query the database with it
            
            Connection connection = DriverManager.getConnection(url, userName, password);
            
                System.out.println("Database connected!");
                Statement stmt = connection.createStatement(); //Allocating a statement object in the connection
                
                
                String queryNameStatement = "select FirstName, Password from Employees where FirstName='Eddie';"; //write up the statement you want to query
                System.out.println("The query is " + queryNameStatement); //Echo the query for debugging purposes
                
                
                ResultSet rset = stmt.executeQuery(queryNameStatement); //get the result set, your going to move over it like your reading in a string from excel
                while (rset.next()){
                    String name = rset.getString("FirstName");
                    String userPassword = rset.getString("Password");
                    nu.loginSuccessfull(nu.checkUserName(name), nu.checkPassword(userPassword));
                }
                
                if (nu.getBothSuccess()==1) {
                    System.out.println("User Identified");
                    loginBean.setBothSuccess(1);
                    %> 
                    <h1>Hello, <jsp:getProperty name="loginBean" property="userName" /></h1>
                    <h2>What would you like to do?</h2>
                    
                    <div id="SideNavigation" class="sidenav"> <--!id is for one div and class is for more than one -->
                        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                        <a href="readme.jsp">About This CRM</a>
                        <a href="searchClient.jsp">Search Client's</a>
                        <a href="addCustomer.jsp">Add a Client</a>
                    </div>
                    
                    <div id="OpenNavigationbutton" class="opennavbutton">
                    <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Navigation</span>
                    </div>
                   
                    
                    
                    
                    
                    
                    
                    
                    <%
                } else {
                    System.out.println("User Not Identified");
                    %><h1>Login Unsuccessful</h1>
                    <a href="index.jsp">Try Again</a><%
                }
                rset.close();
                connection.close();
            //
        %>
        
    
        
            
    </body>
</html>
