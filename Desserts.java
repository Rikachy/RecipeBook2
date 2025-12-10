import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class Desserts here.
 *
 * @author (Daksh Balram)
 * @version (a version number or a date)
 */
public class Desserts extends Recipe
{
    private boolean isBaked;
    private String texture;
    private String sweetLevel;

    /**
     * Constructor for objects of class Desserts
     */
    public Desserts(String name, boolean isBaked, String texture, String sweetLevel)
    {
        super(name);
        this.isBaked = isBaked;
        this.texture = texture;
        this.sweetLevel = sweetLevel;
    }

    public boolean checkBaked()
    {
        System.out.println(isBaked ? "This is a baked recipe" : "This is not a baked recipe");
        return isBaked;
        /*if(this.isBaked) -> print("this is a baked recipe") return true
         * else return false
         */
    }
    
    public void setTexture(String texture)
    {
        switch(texture)
        {
            case "soft", "solid", "crispy", "crunchy", "creamy" -> this.texture = texture;
            default -> this.texture = "unknown";
        }
    }
    
    public String getTexture()
    {
        return texture;  
    }
    
    public String getSweetLevel()
    {  
        return sweetLevel;
    }
    
    public boolean isGlutenFree()
    {
        //return true if contains gluten
        return false;
    }
    
}
