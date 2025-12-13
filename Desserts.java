import java.util.Scanner;
import java.util.ArrayList;

/**
 * The Desserts class represents desserts type recipes.
 * It is a sub class of the Recipe class
 *
 * @author (Daksh Balram)
 * @version (1)
 */
public class Desserts extends Recipe
{
    private boolean isBaked;
    private String texture;
    private String sweetLevel;

    /**
     * Constructs a Desserts object.
     * 
     * @param name the name of the dessert
     * @param isBaked indicates if the dessert is baked or not
     * @param texture the texture of the dessert
     * @param sweetLevel the sweetness of the dessert
     */
    public Desserts(String name, boolean isBaked, String texture, String sweetLevel)
    {
        super(name);
        this.isBaked = isBaked;
        this.texture = texture;
        this.sweetLevel = sweetLevel;
    }

    /**
     * Checks if the dessert is baked.
     * 
     * @return true if the dessert is baked
     */
    public boolean checkBaked()
    {
        System.out.println(isBaked ? "This is a baked recipe" : "This is not a baked recipe");
        return isBaked;
    }
    
    
    /**
     * Sets the texture of the dessert.
     * 
     * @param texture the texture of the dessert
     */
    public void setTexture(String texture)
    {
        switch(texture)
        {
            case "soft", "solid", "crispy", "crunchy", "creamy" -> this.texture = texture;
            default -> this.texture = "unknown";
        }
    }
    
    /**
     * Returns the texture of the dessert.
     * 
     * @return the dessert texture
     */
    public String getTexture()
    {
        return texture;  
    }
    
    /**
     * Returns the sweetness level of the dessert.
     * 
     * @return the sweetness level
     */
    public String getSweetLevel()
    {  
        return sweetLevel;
    }
    
    /**
     * Determines if the dessert is gluten free.
     * 
     * @return true if the dessert is gluten free
     */
    public boolean isGlutenFree()
    {
        return false;
    }
    
}
