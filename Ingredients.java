import java.util.HashSet;

/**
 * The ingredient class is a single ingredient used in a recipe
 *
 * @author (Daksh Balram)
 * @version (1)
 */
public class Ingredients
{
    
    private double amount;
    private String name;
    private UnitOfMeasurement unit;

    /**
     * Constructor of an Ingredient object.
     * 
     * @param name the name of the ingredient
     * @param amount the quantity of the ingredient
     * @param unit the unit of measurement
     *
     */
    public Ingredients(String name, double amount, UnitOfMeasurement unit)
    {
        this.name = name;
        this.unit = unit;
        this.amount = amount;
        
    }
    
    /**
     * Scales the ingredient amount by the given factor.
     * 
     * @param scale the factor used to scale the ingredient amount
     */
    public void scaleAmount(double scale)
    {
        amount *= scale;
    }
    
    /**
     * Returns the amount of the ingredient.
     * 
     * @return the ingredient amount
     */
    public double getAmount()
    {
        return amount;    
    }
    
    /**
     * Sets the amount of the ingredient to a new value.
     * 
     * @param newAmount the new amount
     */
    public void setAmount(double newAmount)
    {
        amount = newAmount;    
    }
    
    /**
     * Returns the name of the ingredient.
     * 
     * @return the ingredient name
     */
    public String getName()
    {
        return name;    
    }
    
    /**
     * Returns the Ingredient object as a string.
     * 
     * @return the details of the ingredient object
     */
    public String toString()
    {
        return amount + " " + unit + " of " + name;
    }
}