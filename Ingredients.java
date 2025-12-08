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
    //private HashSet<String>ingredients;

    /**
     * Constructor for objects of class Ingredients
     */
    public Ingredients(String name, UnitOfMeasurement unit, double amount)
    {
        this.name = name;
        this.unit = unit;
        this.amount = amount;
        
    }
    
    public void scaleAmount(double scale)
    {
        amount *= scale;
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
    
    /*
     * {
        for(int i = 0; i > ingredients.size(); i++)
        {
            System.out.println(ingredients);  
        }
        //for each loop to print all ingredients in the set
    }
     * 
     */public void listAllIngredients()
    {
        
    }
    
    public String toString()
    {
        return amount + " " + unit + " of " + name;
    }
}
