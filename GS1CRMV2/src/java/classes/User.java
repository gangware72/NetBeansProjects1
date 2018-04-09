
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.*;

/**
 *
 * @author edgargangwareiv
 */
public class User 
{
    private String userName;
    private String password;
    private int bothSuccess; //0 for no, 1 for yes
   
    

    public User() 
    {
        bothSuccess =0;
    
    }

    /**
     * @return the name
     */
    public String getuserName() {
        return userName;
    }

    /**
     * @param name the name to set
     */
    public void setuserName(String name) {
        this.userName = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getBothSuccess(){
        return this.bothSuccess;
    }
    
    public void setBothSuccess(int state){
        this.bothSuccess = state;
    }
    

    
    public boolean checkUserName(String dbUserNames)
    {
        if (this.userName.equalsIgnoreCase(dbUserNames)) {
            return true;
        } else {
            return false;
        }
    }
    
    
    public boolean checkPassword(String passwordFromDBQuery)
    {
        return this.password.equals(passwordFromDBQuery);
    }
    
    public void loginSuccessfull(boolean userName, boolean password)
    {
        if(userName && password) {
            System.out.println("Success!");
            bothSuccess =1;
        } else {
             System.out.println("Wrong Password or UserName");  
             
        }
    }
   
    
    
    
        
    
        
}

