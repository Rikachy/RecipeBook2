import java.util.ArrayList;
import java.util.Scanner;
/**
 * The Desserts class represents snacks type recipes.
 * It is a sub class of the Recipe class
 * @author (Richard)
 *  @version (1)
 */
public class Snacks extends Recipe
{
    private boolean schoolAppropriate;
    private String perishability;

    /**
     * constructs a snacks object 
     * 
     * @param schoolAppropriate : if the snack is allowed to bring to school
     * @param name : the name of the snack recipe
     */
    public Snacks(boolean schoolAppropriate,  String name )
    {
     super (name);
     this.schoolAppropriate = schoolAppropriate;
    }

    /**
     * checks if the snack contains guacamole
     * 
     * @return true if has guacamole/false if does not
     */
    //a meme method 
    public boolean checkIfGuacamole()
    {
        for (Ingredients checkGuac : ingredients){
            if(checkGuac.getName().equals("guacamole"))
            {
                System.out.print("Has guacamole.");
                return true;
            }
        }    
        System.out.print("Does not have guacamole.");
        return false;
    } 
    
    /**
     * returns the number of ingredients in the snack
     * see if the snack is easy to prepare(complexity level)
     * 
     * @return the # of ingredients
     */
    
     
    public int numOfIngredients(){
        return ingredients.size(); 
    }
    
    /**
     * checks if the snack is school appropriate
     * 
     * @return true if appropriate/false if not appropriate
     */
    public boolean isSchoolAppropriate()
    {
        return schoolAppropriate;
    }
    
    /**
     * the perishability level of the snack (how likely it is to go bad)
     * possible answers are : high, medium, low
     */
    public void setPerishabilityLevel()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How perishable is your snack : high, medium, low");
        perishability = sc.nextLine();
    }
    
    /**
     * returns the perishability level of the snack
     * 
     * @return perishability level
     */
    public String getPerishabilityLevel()
    {
        return perishability;
    } 
}
