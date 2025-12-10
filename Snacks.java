import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Snacks here.
 *
 * @author (Richard)
 * @version (a version number or a date)
 */
public class Snacks extends Recipe
{
    // instance variables - replace the example below with your own
    private boolean schoolAppropriate;
    private String perishability;
    // instead of having a scale, it would be high/low/medium

    /**
     * Constructor for objects of class Snacks
     */
    public Snacks(boolean schoolAppropriate,  String name )
    {
     super (name);
     this.schoolAppropriate = schoolAppropriate;
    }


    //a meme method 
    public boolean checkIfGuacamoly()
    {
        /*Goes trough the list of ingredients needed for the snacks
         * if one of those elements isequals guacamoly
         * return true 
         * systm prints("has guac...")
         * else return false
         * syst prints ("this snack does now have guac")
         */
        for (Ingredients checkGuac : ingredients){
            if(checkGuac.getName().equals("guacamole"))
            System.out.print("Has guacamole.");
            return true;
        }
        System.out.print("Does not have guacamole.");
        return false;
    }
    
    /* method used to be called containsNumIngredients
     *normally a snack is meant to be small, so this method help determines
     the size and complexity of the snack
    */
    
     
    public int numOfIngredients(){
        /*returns the size of the HashSet of the wanted recipe
         * 
         */
        return ingredients.size(); 
    }
    
    public boolean isSchoolAppropriate()
    {
        return schoolAppropriate;
    }
    
    public void setPerishabilityLevel()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How perishable is your snack : high, medium, low");
        perishability = sc.nextLine();
        
        
    }
    
    public String getPerishabilityLevel()
    {
        return perishability;
    }
        
}
