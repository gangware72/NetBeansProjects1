<%-- 
    Document   : addCustomer
    Created on : Jan 6, 2018, 2:19:44 PM
    Author     : edgargangwareiv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <link href='http://fonts.googleapis.com/css?family=Lato:400,700' rel='stylesheet' type='text/css'>
        <script src="myScripts.js"></script>
        
        <link rel="stylesheet" href="navbarstyle.css">
        
        <style>
            
       
        
         .flex-container {
               columns: 4;
               column-gap: 5px;
               padding: 5px;
               
            }
            
                    .information-category {
                padding-top: 10px;
                font-weight: 600;
                
            }
   
        </style>
    </head>
    <body>
        <h1>Enter the Following Information to Add a New Customer: </h1>
        
         <div id="SideNavigation" class="sidenav"> 
                        <a href="javascript:void(0)" class="closebtn" onclick="closeNav();changeFlexContainerToFour()">&times;</a>
                        <a href="checkLogin.jsp">Home</a>
                        <a href="readme.jsp">About This CRM</a>
                        <a href="searchClient.jsp">Search Client's</a>
                        <a href="addCustomer.jsp">Add a Client</a>
                </div>
                
                <div id="OpenNavigationbutton" class="opennavbutton">
                    <span style="font-size:30px;cursor:pointer" onclick="openNav();changeFlexContainerToThree()">&#9776; Navigation</span>
                </div>
        
         <form  action='addCustomerLanding.jsp' id="hidden">
                 <div class="flex-container" id="displayed">
                     
                    <div class="information-category"> Company Name: </div>
                    <div> <input type="text" name="cn" required> </div>
                    
                    <div class="information-category"> Purchase Date: </div>
                    <div> <input type="text" name="pd" > </div>

                    <div class="information-category"> Invoice Number: </div>
                    <div> <input type="text" name="in"> </div>

                    <div class="information-category"> CSR: </div>
                    <div> <input type="text" name="csr" > </div>

                    
                    <div class="information-category"> Executive Contact: </div>
                    <div> <input type="text" name="ec" > </div>

                    <div class="information-category"> Email Address: </div>
                    <div> <input type="text" name="ea" > </div>

                    <div class="information-category"> GS1 UserName: </div>
                    <div> <input type="text" name="un" > </div>

                    <div class="information-category"> GS1 Password: </div>
                    <div> <input type="text" name="p" > </div>

                    <div class="information-category"> UPC Codes Purchased: </div>
                    <div> <input type="text" name="cp" > </div>

                    <div class="information-category"> GS1 Application Submission Date: </div>
                    <div> <input type="text" name="as" > </div>

                    <div class="information-category"> Date Barcodes Sent To Customer: </div>
                    <div> <input type="text" name="dbs" > </div>

                    <div class="information-category"> Digital or Printed: </div>
                    <div> <input type="text" name="dop" > </div>

                    <div class="information-category"> GS1 Worksheet Return Date: </div>
                    <div> <input type="text" name="wrd" > </div>

                    <div class="information-category"> Assigned Prefix: </div>
                    <div> <input type="text" name="ap" > </div>

                    <div class="information-category"> UPCs Officially Registered: </div>
                    <div> <input type="text" name="or" > </div>

                    <div class="information-category"> Customer Phase: </div>
                    <div> <input type="text" name="pd" > </div>
                    
                 </div>
  
                    <input type="submit" value="OK" />
                    
                </form>

    </body>
</html>
