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
public class SearchValueHandler {
    
    private String searchTerm;
    
    public SearchValueHandler() {

    }
    
    public String getSearchTerm() {
        return searchTerm;
    }
    
    public void setSearchTerm(String userInput) {
        this.searchTerm = userInput;
    }
    
}
