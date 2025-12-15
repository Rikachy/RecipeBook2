
/**
 * The Desserts class represents drinks-type recipes.
 * It is a sub class of the Recipe class
 * @author (Richard)
 * @version (1)
 */
public class Drinks extends Recipe
{
    private boolean isHot;
    private String sizeName;
    private boolean isAlcoholic;
    private boolean hasDairy;
    /**
     * Constructs a drinks object with some of its properties
     * 
     * @param name : the name of drink
     * @param isAlcoholic : if the drink contains Alcohol
     * @param hasDairy : if the drink contains dairy
     * @param isHot : if the drink is hot
     */
    public Drinks(String name, boolean isAlcoholic, boolean hasDairy, boolean isHot)
    {
        super (name); 
        this.isHot = isHot;
        this.isAlcoholic = isAlcoholic;
        this.hasDairy = hasDairy;
    }
    
    /**
     * indicated if the drink contains alcohol 
     * 
     * @return true if drink is alcoholic/false if is not
     */
    public boolean containsAlcohol()
    {
        return isAlcoholic;
    }
    
    /**
     * indicates if the drink has dairy
     * 
     * @return true if the drink has dairy/false if it doesn't
     */
    public boolean containsdairy()
    {
        return hasDairy;
    }
    
    /**
     * determines if the drink is hot or cold
     * 
     * @return true if drink is hot/false if is cold
     */
    public boolean hotOrCold(){
        if (isHot == true){
           System.out.println("Drink is hot");
        }
        if (isHot == false){
           System.out.println("Drink is cold");
        }
        return isHot;  
    }
}