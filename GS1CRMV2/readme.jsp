<%-- 
    Document   : landingpage
    Created on : Dec 18, 2017, 11:37:24 PM
    Author     : edgargangwareiv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="readmestyle.css">
        <link href='http://fonts.googleapis.com/css?family=Lato:400,700' rel='stylesheet' type='text/css'>

    </head>
    
    <body>
        
        <h1> Please Hire Me Inc. - Customer Relation Software</h1>
        

 <a href="checkLogin.jsp" class="myButton">Home</a>
        
        <div id="credit">
            Author: Edgar Gangware IV <br>
            Last Update: April, 2018
        </div> <!-- div id="credit -->

        <div class ="segments" id="applicationdetails">
            <div class="title"> Application Details </div>

            <div class="paragraph">
                This web application was built using five different languages: CSS, HTML, Javascript, Java and SQL.<br>
                It uses a local host MYSQL server to maintain its database.<br>
                The database will not be hosted online because the application’s database on my MacBook contains real company information.<br>
                The name of the company this Customer Relation Software was built for has been changed to protect its information.<br>
            </div> <!-- div class="segments" id=applicationdetails -->
        </div> <!-- div class="title -->
        
        <div class ="segments" id="applicationpurpose">
            <div class="title"> Application Purpose </div>

            <div class="paragraph">
                I worked as IT support for a small business that (among many other services) 
                provides support for companies registering new products to GS1<sup>1</sup>.
                My CEO’s new service (split between three customer representatives) was wildly popular, and a year after rollout, we were cutting cake with the words “1,000 Customers” drizzled on top.<br><br>
                However, to candidly (and incorrectly) quote the late, great
                Notorious BIG: “Mo’ Customers, Mo’ Problems. <br><br>
                The database for this service was a single excel file with 20 
                attributes kept on local storage with a locking design that 
                allowed one user access at a time. Only 2 out of the 3 Customer
                Service Representatives would use “control F” to find companies 
                in the file<sup>2</sup>.  So, I first tried to write a VBA script 
                that would search for them—however it never passed UAT trials.<br><br>
                The answer, it seemed, was a CRM.<br><br>
                However, the CRMs built for them were created in the Paleozoic Era 
                and could not be adapted to this new information. As well, 
                Large Enterprise developer’s software was both (a) much too 
                expensive and (b) seriously unaffordable.<br><br>
                So, I built this. It allows quick access to company details, 
                stays open on the CSR’s desktop and allows multiple accesses. 
                It is simple too use and allows customer service representatives 
                to quickly glean a customer’s information and accurately update a
                company’s information as well.
            </div> <!-- div class="paragraph" -->
        </div> <!-- div class=segments id=applicationpurpose -->
        
        <div class ="segments" id="requirements">
            
            <div class="title">Requirements</div>

            <div class="paragraph">
                The web application shall:<br>
                <ul>
                    <li>Only allow access to CSR representatives</li>
                    <li>Search a customer database customer information based on the Customer’s Company Name</li>
                    <li>Display a customer information</li>
                    <li>Allow the modification of an existing customer and update the customer database accordingly</li>
                    <li>Allow a customer service representative to add new customers to the customer database</li>
                    <!-- Allow CSR to enter notes with due dates-->
                    <!-- Landing page displays notes and overdue notes-->
                    <!-- Search by email and contact as well -->
                    <!-- A display all that dispays all alphabetically-->
                    <!-- Admin should be able to make all companies distinct -->
                    <!-- No re-entry of same company without a warning -->
                    <!-- Dates must be realistic -->
                    <!-- Can delete the company -->
                    <!-- Admin view -->
                    <!-- Real Time search refinement -->
                </ul>
                ____________________________ <br>
                <sup>1</sup> Most large scale retailors and the man putting them out of business (*Cough* Jeff Bezos *Cough*) require products to register with the Global Standards One (GS1). 
                The process is tedious and obtuse but admittedly necessary.<br>
                <sup>2</sup> Predictably, 0 out 3 CSRs found “control F” useful on a 20 column excel sheet.
            </div> <!-- div class=paragraph -->
        </div> <!-- div class=segments id=requirements  -->
        
    </body>
    
</html>
