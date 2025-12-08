
/**
 * Write a description of class Drinks here.
 *
 * @author (Richard)
 * @version (a version number or a date)
 */
public class Drinks extends Recipe
{
    // instance variables - replace the example below with your own
    private boolean isHot;
    private String sizeName;
    private boolean isAlcholholic;
    private boolean hasDairy;
    /**
     * Constructor for objects of class Drinks
     */
    public Drinks(String sizeName, boolean isAlchoholic, boolean hasDairy, boolean isHot)
    {
        this.isHot = isHot;
        this.isAlcholholic = isAlcholholic;
        this.hasDairy = hasDairy;
        this.sizeName = sizeName;
    }
    
    public boolean containsAlchohol()
    {
        //get ingrdients from Recipe.class for the recipe of called drink
        //while loop to check if alchohol is in the ingredients list of the called drink
        // return false if doesn't contain
        // else return true
        return isAlcholholic;
    }
    
    public boolean containsdairy()
    {
        /*get ingrdients from Recipe.class for the recipe of called drink
         while loop to check if dairy is in the ingredients list of the called drink
         the called drink
         return false if doesn't contain
         else return true
         */
        return hasDairy;
    }
    
    public boolean hotOrCold(){
        /*
        if(this.IsHot) -> systm. prints("it is a hot drink...")  return true 
        else (drink is cold) syst. prints("it is a cold drink...") return false 
        */
        if (isHot = true){
           System.out.println("Drink is hot");
        }
        if (isHot = false){
           System.out.println("Drink is cold");
        }
        return isHot;  
    }
    
}
