<%-- 
    Document   : companyInfo
    Created on : Mar 21, 2018, 1:04:37 PM
    Author     : edgargangwareiv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="classes.SearchValueHandler" %>
<%@ page import="classes.DisplayCustomerHandler" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.math.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
              <link href='http://fonts.googleapis.com/css?family=Lato:400,700' rel='stylesheet' type='text/css'>

        
        <link rel="stylesheet" href="navbarstyle.css">
        
        <style>
            .information-category {
                padding-top: 25px;
                font-weight: 600;
                
            }
            .flex-container {
               columns: 4;
               column-gap: 5em;
               padding: 15px;
            }
           .body {
    font-family: "Lato", sans-serif;
}
.hidden {
    display: none;
}


        </style>
    </head>
    <body>
        <jsp:useBean id="searchBean" scope="session" class="classes.SearchValueHandler" />
        <jsp:setProperty name = "searchBean" property="searchTerm" />
        
        <a href="searchClient.jsp" class="myButton">New Search</a>
        <h1>  <jsp:getProperty name="searchBean" property="searchTerm" /> </h1>
        

        <%
            String searchterm = searchBean.getSearchTerm();
            String url = "jdbc:mysql://localhost:3306/GS1DB?zeroDateTimeBehavior=convertToNull";
            String userName = "root";
            String password = "password";//query the database with it
            
            Connection connection = DriverManager.getConnection(url, userName, password);
        
            Statement stmt = connection.createStatement(); //Allocating a statement object in the connection
                
                
                String queryNameStatement = "select * from Customers where CompanyName="+ "'" + searchterm + "'" + ";";
                System.out.println("The query is " + queryNameStatement); //Echo the query for debugging purposes
                
                ResultSet rset = stmt.executeQuery(queryNameStatement);
        %>
        <jsp:useBean id="displayCustomerBean" scope="session" class="classes.DisplayCustomerHandler" />
        
        
        <%
                rset.next();
                displayCustomerBean.setPd(rset.getString(1));
                displayCustomerBean.setIn(rset.getString(2));
                displayCustomerBean.setCsr(rset.getString(3));
                displayCustomerBean.setCn(rset.getString(4));
                displayCustomerBean.setEc(rset.getString(5));
                displayCustomerBean.setEa(rset.getString(6));
                displayCustomerBean.setUn(rset.getString(7));
                displayCustomerBean.setP(rset.getString(8));
                displayCustomerBean.setCp(rset.getString(9));
                displayCustomerBean.setAs(rset.getString(10));
                displayCustomerBean.setDbs(rset.getString(11));
                displayCustomerBean.setDop(rset.getString(12));
                displayCustomerBean.setWrd(rset.getString(13));
                displayCustomerBean.setAp(rset.getString(14));
                displayCustomerBean.setOr(rset.getString(15));
                displayCustomerBean.setPhase(rset.getString(16));
                rset.next();
                
                
         %>  
         
         <div class="flex-container" id="displayed">
            <div class="information-category"> Purchase Date: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="pd" /> </div>

            <div class="information-category"> Invoice Number: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="in" /> </div>

            <div class="information-category"> CSR: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="csr" /> </div>

            <div class="information-category"> Company Name: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="cn" /> </div>

            <div class="information-category"> Executive Contact: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="ec" /> </div>

            <div class="information-category"> Email Address: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="ea" /> </div>

            <div class="information-category"> GS1 UserName: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="un" /> </div>

            <div class="information-category"> GS1 Password: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="p" /> </div>

            <div class="information-category"> UPC Codes Purchased: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="cp" /> </div>

            <div class="information-category"> GS1 Application Submission Date: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="as" /> </div>

            <div class="information-category"> Date Barcodes Sent To Customer: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="dbs" /> </div>

            <div class="information-category"> Digital or Printed: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="dop" /> </div>

            <div class="information-category"> GS1 Worksheet Return Date: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="wrd" /> </div>

            <div class="information-category"> Assigned Prefix: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="ap" /> </div>

            <div class="information-category"> UPCs Officially Registered: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="or" /> </div>

            <div class="information-category"> Customer Phase: </div>
            <div> <jsp:getProperty name="displayCustomerBean" property="pd" /> </div>
         </div>   
         
         <button onclick="hideDisplay()" id="makeChangesButton"> Make Changes</button>
         
         <div class="hidden" id="hidden">
        <div onload="hideForms()" class="flex-container" id="hidden"> 
            
        
             
             <form  action='submitchange.jsp' id="hidden">
                 
                    <div class="information-category"> Purchase Date: </div>
                    <div> <input type="text" name="pd" value = <jsp:getProperty name="displayCustomerBean" property="pd" />> </div>

                    <div class="information-category"> Invoice Number: </div>
                    <div> <input type="text" name="in" value = <jsp:getProperty name="displayCustomerBean" property="in" />> </div>

                    <div class="information-category"> CSR: </div>
                    <div> <input type="text" name="csr" value = <jsp:getProperty name="displayCustomerBean" property="csr" />> </div>

                    <div class="information-category"> Company Name: </div>
                    <div> <input type="text" name="cn" value = <jsp:getProperty name="displayCustomerBean" property="cn" />> </div>
                    
                    <div class="information-category"> Executive Contact: </div>
                    <div> <input type="text" name="ec" value = <jsp:getProperty name="displayCustomerBean" property="ec" />> </div>

                    <div class="information-category"> Email Address: </div>
                    <div> <input type="text" name="ea" value = <jsp:getProperty name="displayCustomerBean" property="ea" />> </div>

                    <div class="information-category"> GS1 UserName: </div>
                    <div> <input type="text" name="un" value = <jsp:getProperty name="displayCustomerBean" property="un" />> </div>

                    <div class="information-category"> GS1 Password: </div>
                    <div> <input type="text" name="p" value = <jsp:getProperty name="displayCustomerBean" property="p" />> </div>

                    <div class="information-category"> UPC Codes Purchased: </div>
                    <div> <input type="text" name="cp" value = <jsp:getProperty name="displayCustomerBean" property="cp" />> </div>

                    <div class="information-category"> GS1 Application Submission Date: </div>
                    <div> <input type="text" name="as" value = <jsp:getProperty name="displayCustomerBean" property="as" />> </div>

                    <div class="information-category"> Date Barcodes Sent To Customer: </div>
                    <div> <input type="text" name="dbs" value = <jsp:getProperty name="displayCustomerBean" property="dbs" />> </div>

                    <div class="information-category"> Digital or Printed: </div>
                    <div> <input type="text" name="dop" value = <jsp:getProperty name="displayCustomerBean" property="dop" />> </div>

                    <div class="information-category"> GS1 Worksheet Return Date: </div>
                    <div> <input type="text" name="wrd" value = <jsp:getProperty name="displayCustomerBean" property="wrd" />> </div>

                    <div class="information-category"> Assigned Prefix: </div>
                    <div> <input type="text" name="ap" value = <jsp:getProperty name="displayCustomerBean" property="ap" />> </div>

                    <div class="information-category"> UPCs Officially Registered: </div>
                    <div> <input type="text" name="or" value =  <jsp:getProperty name="displayCustomerBean" property="or" />> </div>

                    <div class="information-category"> Customer Phase: </div>
                    <div> <input type="text" name="pd" value = <jsp:getProperty name="displayCustomerBean" property="pd" />> </div>
                 <%-- Use a for loop with java to loop the amount the customer 
                      would like to see companies wise
                 --%>
                    
                    <input type="submit" value="OK" />
                    
                </form>
            
         </div>
        </div>
    
             

        <script src="myScripts.js"></script>
         

                        
    </body>
</html>
