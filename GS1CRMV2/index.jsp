<%-- 
    Document   : login
    Created on : Dec 18, 2017, 4:09:11 PM
    Author     : edgargangwareiv
--%>


<!DOCTYPE html>
<%--This includes my User.class so I can declare user objects later--%>    
<%@ page contentType="text/html" pageEncoding="UTF-8" import="classes.User" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Screen</title>
        <link href='http://fonts.googleapis.com/css?family=Lato:400,700' rel='stylesheet' type='text/css'>
        
        <style>
            
            .company-title {
                padding: 100px;
                background-color: white;
                font-family: "lato", serif;
                text-align: right;
                font-size: xx-large;
            }
        
            .flex-container {
                display:flex;
                flex-direction: column;
                flex-wrap: wrap;
                background-color: blue;
                text-align: center;
                padding-top: .5em;
                padding-bottom: .5em;
            }
                
            .form {
                padding-top: .5em;
                align-content: flex-end;
                display: block;
                text-align: right;
                
                    
            }
               
            .title {
                padding-bottom: .5em;
                font-family: Futura;
                text-align: right;
                padding-right: .5em;
                
            }
            
            .forms{
                font-family: Futura;
                padding: .25em;
                align-content: flex-end;
                text-align: right;
            }
        </style>
        
    </head>
    
    <body>
        <div class="company-title">
            Please Hire Me Inc.
        </div>
        
        <div class="flex-container">
            <div class="title">
                <div>CSR Login</div>
                
            </div>

            
             <div class="forms">   
            <form name="Login Input Form" action='checkLogin.jsp'>
                User Name: <input type="text" name="userName" /> <br>
                Password: <input type="password" name="password" /> <br>
                <input type="submit" value="OK" />
            </form>
             </div>
                
            
        </div>
    </body>
</html>
