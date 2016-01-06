/*
 * @author Jeremy Williamson
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
