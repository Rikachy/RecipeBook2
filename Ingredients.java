import java.util.HashSet;

/**
 * Write a description of class Ingredients here.
 *
 * @author (Daksh Balram)
 * @version (a version number or a date)
 */
public class Ingredients
{
    
    private double amount;
    private String name;
    private UnitOfMeasurement unit;
    private HashSet<String>ingredients;

    /**
     * Constructor for objects of class Ingredients
     */
    public Ingredients()
    {
        ingredients = new HashSet<>();
        
        
    }
    
    public void scaleAmount(double scale)
    {
        //*make a new variable scaledAmount and multiply amount by the parameter  
    }
    
    public double getAmount()
    {
        return amount;    
    }
    
    public void setAmount(double newAmount)
    {
        amount = newAmount;    
    }
    
    public String getName()
    {
        return name;    
    }
    
    public void listAllIngredients()
    {
        //for each loop to print all ingredients in the set
    }
}
