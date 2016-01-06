/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hopfieldhexpattern.controller;

/**
 *
 * @author jeremy.williamson
 */
public class GameLogic {
    
    private int allowableOrganisms;
    
    public GameLogic(){
        allowableOrganisms = 1;
    }//end constructor
    
    public void setAllowableOrgansims(int newNum){
        allowableOrganisms = newNum;
    }
    
    public int getAllowableOrganisms(){
        return allowableOrganisms;
    }    
    
}//end GameLogic
