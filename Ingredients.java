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
        ingredients.add("tomato");ingredients.add("milk");ingredients.add("Banana");
        ingredients.add("egg");ingredients.add("Potatoes");ingredients.add("Honey");
        ingredients.add("salt");ingredients.add("Carrots");ingredients.add("Cinnamon");
        ingredients.add("butter");ingredients.add("Lemon");ingredients.add("Cheese");
        ingredients.add("garlic");ingredients.add("Vinegar");ingredients.add("Lettuce");
        ingredients.add("onion");ingredients.add("Mushrooms");ingredients.add("Shrimp");
        ingredients.add("olive oil");ingredients.add("peppe");ingredients.add("Eggplant");
        ingredients.add("flour");ingredients.add("picktoes");ingredients.add("nut");
        ingredients.add("sugar");ingredients.add("Beans");ingredients.add("lime");
        
    }
    
    public void scaleAmount(double scale)
    {
        double newAmount = amount * scale;
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
        for(int i = 0; i > ingredients.size(); i++)
        {
            System.out.println(ingredients);  
        }
        //for each loop to print all ingredients in the set
    }
}
