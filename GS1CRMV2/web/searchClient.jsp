<%-- 
    Document   : searchClient
    Created on : Jan 5, 2018, 11:12:18 PM
    Author     : edgargangwareiv
--%>

<%@page contentType="text/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search For Customers</title>
        <link href='http://fonts.googleapis.com/css?family=Lato:400,700' rel='stylesheet' type='text/css'>

        
        <link rel="stylesheet" href="navbarstyle.css">
       


    </head>
    <body>
        
        <div id="SideNavigation" class="sidenav"> <--!id is for one div and class is for more than one -->
                        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                        <a href="checkLogin.jsp"> Home</a>
                        <a href="readme.jsp">About This CRM</a>
                        <a href="searchClient.jsp">Search Clients</a>
                        <a href="addCustomer.jsp">Add a Client</a>
                    </div>
                    
                    <div id="OpenNavigationbutton" class="opennavbutton">
                    <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Navigation</span>
                    </div>
        
       
        
   
        <h1>Search by Company Name:   </h1>
       
            
        
 
        
        <form name="Search Form" action='searchClientResult.jsp'>
            <input type="text" name="searchTerm" /> <br>
            <input type="submit" value="OK" />
        </form>
        

     <script src="myScripts.js"></script>
    </body>
</html>
